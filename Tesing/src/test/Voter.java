package test;

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
	public String getPasswd() {
		return passwd;
	}	public String getState() {
		return state;
	}	
	
}
