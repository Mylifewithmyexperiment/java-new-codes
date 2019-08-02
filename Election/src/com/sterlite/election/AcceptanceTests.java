package com.sterlite.election;

public class AcceptanceTests {

	
	public static void main(String[] args) {
		AcceptanceTests tests = new AcceptanceTests();
		// Login
		tests.testSuccessfulLogin();
		tests.testInvalidUsernameScenario();
		tests.testInvalidPasswordScenario();
		
		// List the candidates
		tests.userShouldNotBeAbleToSeeListOfCandidatesWithoutLogin();
		
		tests.testVoterShouldSeeListOfCandidatesOfItsRegion();
		
		// Cast vote
		tests.userIsAbleToCastVoteToChosenCandidate();
		
		// Vote status
		// TODO what if status is fired before casting vote?
		tests.userShouldBeAbleToSeeStatusOfVoteCasted();
		
		//Report of election
		tests.userElectionReport();
		
		//End election
		tests.userIsEndingElection();
		tests.cannotCastVoteAfterElectionEnded();
		
		System.out.println("All tests pass");
	}

	private void cannotCastVoteAfterElectionEnded() {
		ElectionSimulator simulator = createSimulator();
		loginDefaultUser(simulator);
		
		simulator.executeProcess("end");
		String result = simulator.executeProcess("vote 1");
		check(result, "Cannot cast vote after election has ended.", "Should not be able to vote after election has ended");
	}

	private void userIsEndingElection() {
		ElectionSimulator simulator = createSimulator();
		loginDefaultUser(simulator);
		
		String result = simulator.executeProcess("end");
		check(result, "Elections are over", "You can still vote");
	}

	private void userElectionReport() {
		ElectionSimulator simulator = createSimulator();
		loginDefaultUser(simulator);
		
		
		//Cast vote 2-3 times
		//Show report
		//Check report
		String result = simulator.executeProcess("vote 1");
		result = simulator.executeProcess("report");
		check(result, "BJP->1\n", "Report is invalid!!!");
		result = simulator.executeProcess("vote 2");
		result = simulator.executeProcess("vote 1");
		
		result = simulator.executeProcess("report");
		check(result, "BJP->2\nINC->1\n", "Report is invalid!!!");
			
	}

	private void userShouldBeAbleToSeeStatusOfVoteCasted() {
		ElectionSimulator simulator = createSimulator();
		loginDefaultUser(simulator);
		
		simulator.executeProcess("vote 1");
		
		String result = simulator.executeProcess("status");
		check(result, "You voted for candidate: Narendra Modi, BJP", "Not able to see correct list after login");
	}

	private void userIsAbleToCastVoteToChosenCandidate() {
		ElectionSimulator simulator = createSimulator();
		loginDefaultUser(simulator);
		
		String result = simulator.executeProcess("vote 1");
		check(result, "Successfully cast vote to: Narendra Modi, BJP", "Not able to see correct list after login");
		
		result = simulator.executeProcess("vote 2");
		check(result, "Successfully cast vote to: Rahul Gandhi, INC", "Not able to see correct list after login");
	}

	private void testVoterShouldSeeListOfCandidatesOfItsRegion() {
		ElectionSimulator simulator = createSimulator();
		loginDefaultUser(simulator);
		
		String result = simulator.executeProcess("list");
		check(result, "1. Narendra Modi, BJP\n2. Rahul Gandhi, INC", "Not able to see correct list after login");
	}

	private void userShouldNotBeAbleToSeeListOfCandidatesWithoutLogin() {
		ElectionSimulator simulator = createSimulator();
		String result = simulator.executeProcess("list");
		check(result, "Login first!", "List of candidates was shown without proper login");
	}

	private void testInvalidPasswordScenario() {
		ElectionSimulator simulator = createSimulator();
		String result = simulator.executeProcess("login scott tigbmver1");
		check(result, "Invalid credentials!", "Invalid user login not working");
	}

	private void testInvalidUsernameScenario() {
		ElectionSimulator simulator = createSimulator();
		String result = simulator.executeProcess("login scogntt1 tiger");
		check(result, "Invalid credentials!", "Invalid user login not working");
	}


	private void testSuccessfulLogin() {
		ElectionSimulator simulator = createSimulator();
		String result = simulator.executeProcess("login scott tiger");
		check(result, "Successful login", "Successful login not working");
		
		result = simulator.executeProcess("login admin admin");
		check(result, "Successful login", "Successful login not working");
	}
	
	private void check(String actual, String expected, String failureMessage) {
		if (!expected.equals(actual)) {
			// fail
			fail("Expected: " + expected + ", but was: " + actual);
		}
	}

	private static void fail(String failureMessage) {
		throw new RuntimeException(failureMessage);
	}
	
	private void loginDefaultUser(ElectionSimulator simulator) {
		simulator.executeProcess("login scott tiger");
	}
	
	private ElectionSimulator createSimulator() {
		return new ElectionSimulator(
				new Voter[] {
						new Voter("scott", "tiger", "Gujarat"),
						new Voter("admin", "admin", "Gujarat")
				},
				new Candidate[] {
						new Candidate("Narendra Modi", "Gujarat", "BJP"),
						new Candidate("Rahul Gandhi", "Gujarat", "INC"),
						new Candidate("Manmohan Singh", "Punjab", "INC")
				});
	}
}
