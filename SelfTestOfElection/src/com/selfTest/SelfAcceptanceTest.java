package com.selfTest;

import java.util.List;

/**
 * 
 * @author shashi.jaiswal to make election simulator login with valid user //
 *         throw exception for invalid user login with valid user and password
 *         login with multiple user login with incorrect user login with
 *         incorrect Password start time 12:22pm end time 1:41pm
 * 
 * 
 *         list of candidate of particular state. w.r.t to matching the current
 *         voter state i.e, if current voter is of Gujarat then all candidate of
 *         Gujrat should be displayed. start time 2:26pm
 * 
 */

public class SelfAcceptanceTest {

	public static void main(String[] args) {
		SelfAcceptanceTest acceptanceTest = new SelfAcceptanceTest();

		acceptanceTest.testOfInvalidUsers();

		acceptanceTest.testOfMultipleuserLogin();

		acceptanceTest.testToFetListOfCandidateMatchingCurrentVoterState();
		 
		System.out.println("All above test cases has passed");

	}
 
	private void testToFetListOfCandidateMatchingCurrentVoterState() {
		// TODO Auto-generated method stub
		SelfTestElectionSimulator electionSimulator = createSimulator();
		List<String> result= electionSimulator.getCandidaiteNameBasedOnCurrentVoterStateMatching("Gujrat");
		for(int i=0; i<result.size();i++) {
			System.out.println((i+1) + ". " + result.get(i));
		}
	}

	private void testOfMultipleuserLogin() {
		SelfTestElectionSimulator electionSimulator = createSimulator();
		loginDefaultUser(electionSimulator);
		
		 
		
	}

	private void loginDefaultUser(SelfTestElectionSimulator electionSimulator) {
		String result = electionSimulator.executeLogin("tiger", "scoot");
		
		Checkbox(result, "successful login");
		
	}

	private void testOfInvalidUsers() {
		SelfTestElectionSimulator electionSimulator = createSimulator();
		String result = electionSimulator.executeLogin("tigerr", "scxoot");

		Checkbox(result, "invalid credentials");
	}

	private SelfTestElectionSimulator createSimulator() {

		return new SelfTestElectionSimulator(
				new SelfTestUsers[] { new SelfTestUsers("tiger", "scoot" ,"Gujrat"), 
						new SelfTestUsers("admin", "admin","UP")

				}, new SelfTestCandidate[] { 
						new SelfTestCandidate("Narendra Modi", "Gujrat", "BJP"),
						new SelfTestCandidate("Rahul Gandhi", "UP", "Congress")

				}

		);
	}

	private void Checkbox(String result, String expectedOutput) {

		if (!result.equals(expectedOutput)) {
			fail();
		}
	}

	private void fail() {
		// TODO Auto-generated method stub
		throw new RuntimeException();
	}

}
