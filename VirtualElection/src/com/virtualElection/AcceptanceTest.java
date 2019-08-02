package com.virtualElection;

import java.util.List;
import java.util.Scanner;

public class AcceptanceTest {
	String candidateToVote;
	int voteCount;

	public static void main(String[] args) {
		AcceptanceTest acceptanceTest = new AcceptanceTest();
		acceptanceTest.testForMultipleValidUsernameAndPasswordBylogging();
		acceptanceTest.testShouldShowListOfCandidateForLoggerdInVoter();
		// acceptanceTest.testInvalidUsername();
		// candidate state
		acceptanceTest.testShouldListCandidateforWithoutloggedInVoterState();

		// voter should see list of candidate of his state.
		acceptanceTest.testToShowlistOfCandidateOfParticularState(); // to do test this test for multiple users.

		acceptanceTest.testToCastVote();

		acceptanceTest.testToGenerateReport();

		acceptanceTest.UserIsEndingElection();
		
		acceptanceTest.NoVoteCastAfterElectionEnd();

		System.out.println("All Test Passed");
	}

	private void NoVoteCastAfterElectionEnd() {
		ElectionSimulator electionSimulator = simulator();
		String endresult = electionSimulator.executeLogin("AfterElectionEnd");
		String expectedValue = "can't cast vote as election are over";
	 
		System.out.println(" end result          " + endresult);
		Check(endresult, expectedValue);
	}

	private void UserIsEndingElection() {
		ElectionSimulator electionSimulator = simulator();
		electionSimulator.executeLogin("end");
		System.out.println("Election are over");

	}

	private void testToGenerateReport() {
		System.out.println("Report Gnerated");
		System.out.println("Vote casted to " + candidateToVote + " is:- " + voteCount);

	}

	private void testToCastVote() {
		// TODO Auto-generated method stub
		ElectionSimulator electionSimulator = simulator();
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Enter Candidate name to vote :-");
		candidateToVote = scanner.nextLine();

		electionSimulator.executeLogin("vote " + candidateToVote);
		voteCount = electionSimulator.VoteCountAgaintsCandidate.get(candidateToVote);
		System.out.println("The vote count of  " + this.candidateToVote + " is:- " + this.voteCount);

	}

	private void testToShowlistOfCandidateOfParticularState() {
		ElectionSimulator electionSimulator = simulator();
		List<String> result;

		Scanner scanner = new Scanner(System.in);
		System.out.println(" Enter state name to see the list of candidate of that particular state");
		String stateNameToFetchCandidate = scanner.nextLine();

		electionSimulator.executeLogin("candidateList " + stateNameToFetchCandidate);
		result = electionSimulator.listOfCandidateStateDetail;
		for (int i = 0; i < result.size(); i++) {
			System.out.println((i + 1) + "  " + result.get(i));

		}

	}

	private void testShouldShowListOfCandidateForLoggerdInVoter() {
		// TODO Auto-generated method stub
		ElectionSimulator electionSimulator = simulator();
		String result = electionSimulator.executeLogin("login tiger scoot");
		// System.out.println(result);
	}

	private void testShouldListCandidateforWithoutloggedInVoterState() {
		ElectionSimulator electionSimulator = simulator();
		String result = electionSimulator.executeLogin("list tiger scoot");
		// System.out.println(result);

	}

	private void testInvalidUsername() {

		ElectionSimulator electionSimulator = simulator();
		String result = electionSimulator.executeLogin("login tigee admin");
		String expectedValue = "invalid Credentials";
		Check(result, expectedValue);

	}

	private void testForMultipleValidUsernameAndPasswordBylogging() {
		// TODO Auto-generated method stub
		ElectionSimulator electionSimulator = simulator();
		String result = electionSimulator.executeLogin("login tiger scoot");
		result = electionSimulator.executeLogin("login admin admin");
		// System.out.println(result);
		String expectedValue = "successful login";
		Check(result, expectedValue);

	}

	private ElectionSimulator simulator() {
		return new ElectionSimulator(

				new Voter[] {

						new Voter("tiger", "scoot", "gujrat"),

						new Voter("admin", "admin", "rajasthan")

				},

				new Candidate[] { new Candidate("NarendraModi", "Gujrat"), new Candidate("AmitShah", "Gujrat"),
						new Candidate("Rahulgandhi", "Kerala") }

		);

	}

	private void Check(String result, String expectedValue) {
		// TODO Auto-generated method stub
		if (!result.equals(expectedValue)) {
			throw new RuntimeException();
		}

	}

}
