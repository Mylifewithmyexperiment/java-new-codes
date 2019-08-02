package test;

// robot
public class AcceptanceTest {

	public static void main(String[] args) {

		AcceptanceTest acceptanceTest = new AcceptanceTest();
		acceptanceTest.testSuccessfulLogin();
		acceptanceTest.testShouldNotLoginInvalidUser();
		acceptanceTest.testShouldNotAllowLoginForInvalidPassword();
		acceptanceTest.testShouldListCandidatesFromLoggedInVoterState();
		// List of candidates
		
		System.out.println("All tests pass");

	}
	
	

	private void testShouldListCandidatesFromLoggedInVoterState() {
		ElectionSimulator electionSimulator = createSimulator();
		
		electionSimulator.execute("login scott tiger");
		
		String acutalResult = electionSimulator.execute("list");
		
		check(acutalResult, "Narendra Modi");
		
		electionSimulator.execute("login admin admin");
		
		acutalResult = electionSimulator.execute("list");
		
		check(acutalResult, "Amit Shah");
	}



	private void testShouldNotAllowLoginForInvalidPassword() {
		ElectionSimulator electionSimulator = createSimulator();
		
		String acutalResult = electionSimulator.execute("login scott tiger1");
		
		check(acutalResult, "Invalid Credentials");
	}

	private void testShouldNotLoginInvalidUser() {
		ElectionSimulator electionSimulator = createSimulator();
		
		String actualResult = electionSimulator.execute("login scott1 tiger");
		
		check(actualResult, "Invalid Credentials");
	}

	private void testSuccessfulLogin() {
		ElectionSimulator electionSimulator = createSimulator();
		
		String actualResult = electionSimulator.execute("login scott tiger");
		
		check(actualResult, "Successful Login");
		
		actualResult = electionSimulator.execute("login admin admin");
		
		check(actualResult, "Successful Login");
	}

	private void check(String acutalResult, String expectedResult) {
		if (!expectedResult.equals(acutalResult)) {
			throw new RuntimeException();
		}
	}
	
	private ElectionSimulator createSimulator() {
		return new ElectionSimulator(new Voter[] {
				new Voter("scott", "tiger", "Gujarat"),
				new Voter("admin", "admin", "Maharashtra")
		});
	}
}
