package com.selfTest;

import java.util.ArrayList;
import java.util.List;

public class SelfTestElectionSimulator {

	String result = "invalid credentials";

	SelfTestUsers[] users;
	SelfTestCandidate[] candidates;
	List<String> currentVoterState;

	public SelfTestElectionSimulator(SelfTestUsers[] selfTestUsers, SelfTestCandidate[] selfTestCandidates) {
		this.users = selfTestUsers;
		this.candidates = selfTestCandidates;
	}

	public String executeLogin(String username, String password) {
		for (int i = 0; i < users.length; i++) {
			if ((username.equals(users[i].getUsername())) && password.equals(users[i].getPassword())) {
				result = "successful login";
				//currentVoterState = users[i].getuserState();
				//System.out.println(currentVoterState);
			}
			
		}
		
		return result;
	}

	public List<String> getCandidaiteNameBasedOnCurrentVoterStateMatching(String user_State) {
		List<String> eligibleCandidates = new ArrayList<>();
		for (int i = 0; i < candidates.length; i++) {
        	if(candidates[i].getCandidate_state().equals(user_State)) {
        		String temp = candidates[i].getCandidate_name() + " " + candidates[i].getCandidate_party();
        		eligibleCandidates.add(temp);
        	}
		 
}
		
		return eligibleCandidates;
	}

}
