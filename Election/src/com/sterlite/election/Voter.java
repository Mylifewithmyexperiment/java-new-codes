package com.sterlite.election;

public class Voter {

	private String name;
	private String passwd;
	private String state;
	
	public Voter(String name, String passwd, String state) {
		this.name = name;
		this.passwd = passwd;
		this.state = state;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPasswd() {
		return passwd;
	}
	
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	
	public String getState() {
		return state;
	}
}
