package test;

//waiter
public class ElectionSimulator {

	private Voter[] voters;

	public ElectionSimulator(Voter[] voters) {
		this.voters = voters;
	}

	public String execute(String command) {
		String[] args = command.split(" ");
		String commandName = args[0];
		switch (commandName) {
		case "login":
			String actualUsername = args[1];
			String actualPassword = args[2];
			
			for (int i = 0; i < voters.length; i++) {
				Voter knownVoter = voters[i];
				if (actualUsername.equals(knownVoter.getName()) 
						&& actualPassword.equals(knownVoter.getPasswd())) {
					return "Successful Login";
				}
			}
			return "Invalid Credentials";
		default: 
			return "Narendra Modi\nAmit Shah\n";
		}
	}
	
}
