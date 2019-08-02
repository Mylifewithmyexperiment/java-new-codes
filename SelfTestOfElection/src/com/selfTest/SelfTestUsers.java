package com.selfTest;

public class SelfTestUsers {
	private String username;
	private String password;
     private String user_state;
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public String getuserState()
	{
		return user_state;
	}
	
	public SelfTestUsers(String username, String password, String user_state) {
		super();
		this.username = username;
		this.password = password;
		this.user_state= user_state;
	}
	 
}
