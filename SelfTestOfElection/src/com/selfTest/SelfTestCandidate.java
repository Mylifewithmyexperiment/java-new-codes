package com.selfTest;

public class SelfTestCandidate {

	private  String candidate_name;
	private String candidate_state;
	private String candidate_party;
	
	
	
	public SelfTestCandidate(String candidate_name, String candidate_state, String candidate_party) {
		super();
		this.candidate_name = candidate_name;
		this.candidate_state = candidate_state;
		this.candidate_party = candidate_party;
	}
	
	public String getCandidate_name() {
		return candidate_name;
	}
	public String getCandidate_state() {
		return candidate_state;
	}
	public String getCandidate_party() {
		return candidate_party;
	}
	
}
				