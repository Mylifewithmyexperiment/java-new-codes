package com.sterlite.election;

public class Candidate {

	private String name;
	private String state;
	private String party;

	public Candidate(String name, String state, String party) {
		this.name = name;
		this.state = state;
		this.party = party;
	}

	public String getName() {
		return name;
	}

	public String getState() {
		return state;
	}
	
	public String getParty() {
		return party;
	}
	
}
