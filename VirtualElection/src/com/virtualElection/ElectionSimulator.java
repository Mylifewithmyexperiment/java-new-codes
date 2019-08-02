package com.virtualElection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ElectionSimulator {

	Voter[] voters;
	String[] passwd;
	String result,endresult;
	String currentStateofLoggedInVoter;
	Candidate[] candidates;
	String candidateState;
	String candidateName;
	List<String> listOfCandidateStateDetail;
	Map<String, Integer> VoteCountAgaintsCandidate;
	boolean endingElection;
	int endElectionforNow =0;

	public ElectionSimulator(Voter[] voters, Candidate[] candidates) {
		this.voters = voters;
		this.candidates = candidates;
	}

	public String executeLogin(String args) {
		// TODO Auto-generated method stub
		String[] command = args.split(" ");
		String operation = command[0];

		switch (operation) {
		case "login":
			String currentVoter = command[1];
			String currentvoterpass = command[2];
			result = loginOperation(currentVoter, currentvoterpass);
			break;

		case "list":
			currentVoter = command[1];
			currentvoterpass = command[2];
			result = showListOfLoggedincandidate(currentVoter, currentvoterpass);
			// System.out.println(currentStateofLoggedInVoter);
			break;

		case "candidateList":
			candidateState = command[1];
			listOfCandidateStateDetail = showlistofCandidatebasedOncandidateState(candidateState);
			break;

		case "vote":
			candidateName = command[1];
			System.out.println(" to check correct pass of candidate name" + candidateName);
			VoteCountAgaintsCandidate = testTocastvoteToParticularCandidiate(candidateName);

			break;
		case "end":
			endEletion();

			break;

		case "AfterElectionEnd":
			result = afterElectionEnd();

			break;

		default:

			break;
		}

		return result;
	}

	private String afterElectionEnd() {
		
		if (endElectionforNow==1) {
			endresult = "can't cast vote as election are over";
			return endresult;
		}
	/*	
		if (endingElection==true) {
			
			System.out.println("Value of ending election " + endingElection );
			endresult = "can't cast vote as election are over";

			System.out.println(endresult);
		}
		
		else {
			endresult ="you may cast vote";
		}
		

		System.out.println(   "end result before printing"+  endresult);*/
		
		
		return endresult;
		 
	}

	private void endEletion() {
		this.endingElection = true;
		endElectionforNow=1;
		 

	}

	private Map testTocastvoteToParticularCandidiate(String candidateName) {
		// TODO Auto-generated method stub
		Map<String, Integer> candidateVoteCount = new HashMap<>();
		int countOfVote = 0;
		for (int i = 0; i < candidates.length; i++) {

			if (candidateName.equals(candidates[i].getCandidateName())) {
				candidateVoteCount.put(candidateName, ++countOfVote);
			}
		}
		return candidateVoteCount;

	}

	private List<String> showlistofCandidatebasedOncandidateState(String candidateState) {

		List<String> elligibleCandidate = new ArrayList<>();

		for (int i = 0; i < candidates.length; i++) {
			if (candidates[i].getCandidateState().equals(candidateState)) {
				String tempStoreofCandidateDetails = " " + candidates[i].getCandidateName();
				elligibleCandidate.add(tempStoreofCandidateDetails);
			}
		}
		return elligibleCandidate;

	}

	private String loginOperation(String currentVoter, String currentvoterpass) {
		// TODO Auto-generated method stub

		for (int i = 0; i < voters.length; i++) {
			if (currentVoter.equals(voters[i].getVotername()) && currentvoterpass.equals(voters[i].getPassword())) {
				result = "successful login";
				currentStateofLoggedInVoter = testShouldShowListOfCandidateForLoggerdInVoter(currentVoter,
						currentvoterpass);
				// System.out.println(currentStateofLoggedInVoter);
			}
		}
		return result;
	}

	private String testShouldShowListOfCandidateForLoggerdInVoter(String currentVoter, String currentvoterpass) {

		for (int i = 0; i < voters.length; i++) {
			if (currentVoter.equals(voters[i].getVotername()) && currentvoterpass.equals(voters[i].getPassword())) {
				result = "successful login";
				currentStateofLoggedInVoter = voters[i].getState();
			}
		}
		return currentStateofLoggedInVoter;

	}

	private String showListOfLoggedincandidate(String currentVoter, String currentvoterpass) {

		for (int i = 0; i < voters.length; i++) {
			if (currentVoter.equals(voters[i].getVotername()) && currentvoterpass.equals(voters[i].getPassword())) {
				result = "successful login";
				currentStateofLoggedInVoter = voters[i].getState();

			}

		}
		return currentStateofLoggedInVoter;

	}

}
