package com.virtualElection;

public class Candidate {
	private String candidateName;
	private String candidateState;

	public Candidate(String candidateName, String candidateState) {
		// TODO Auto-generated constructor stub

		this.candidateName = candidateName;
		this.candidateState = candidateState;
	}

	public String getCandidateName() {
		return candidateName;
	}

	public String getCandidateState() {
		return candidateState;
	}

	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}

	public void setCandidateState(String candidateState) {
		this.candidateState = candidateState;
	}

}
