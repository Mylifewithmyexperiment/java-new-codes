package com.virtualElection;

public class Voter   {
	private String votername;
	private String password;
	private String state;
	
	public Voter(String votername, String password, String state) {
		// TODO Auto-generated constructor stub
		this.votername = votername;
		this.password=password;
		this.state = state;
		
	}
	public String getVotername() {
		return votername;
	}
	public String getPassword() {
		return password;
	}
	public String getState() {
		return state;
		
	}

}
