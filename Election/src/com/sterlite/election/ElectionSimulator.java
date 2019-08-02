package com.sterlite.election;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ElectionSimulator {
	
	private Voter[] voters;
	private Candidate[] candidates;
	private Voter currentVoter;
	private Map<String, Candidate> voterNameToChosenCandidate = new HashMap<>();
	private Map<String, Integer> partyNameToVoteCount = new HashMap<>();
	private boolean ended;

	public ElectionSimulator(Voter[] voters, Candidate[] candidates) {
		this.voters = voters;
		this.candidates = candidates;
	}

	public String executeProcess(String input) {
		String[] args = input.split(" ");
		
		switch (args[0]) {
		case "login":
			return login(args);
		case "list":
			return listCandidates(args);
		case "vote":
			return castVote(args);
		case "status":
			return status(args);
		case "report":
			return report(args);
		case "end":
			return end(args);
		default:
			return null;
		}
	}

	private String end(String[] args) {
		ended = true;
		return "Elections are over";
	}

	private String report(String[] args) {
		String output="";
		for(Map.Entry<String, Integer> mapElement : partyNameToVoteCount.entrySet()) {
			output += mapElement.getKey();
			output += "->" + mapElement.getValue() + "\n";
			
		}
		return String.format("%s",  output);
		
	}

	private String status(String[] args) {
		// TODO assuming a voter has logged in
		Candidate chosenCandidate = voterNameToChosenCandidate.get(currentVoter.getName());
		return String.format("You voted for candidate: %s, %s", chosenCandidate.getName(), chosenCandidate.getParty());
	}

	private String castVote(String[] args) {
		if (ended) {
			return "Cannot cast vote after election has ended.";
		}
		int candidateNo = Integer.parseInt(args[1]);
		List<Candidate> stateCandidates = getStateCandidates()
				.collect(Collectors.toList());
		Candidate chosenCandidate = stateCandidates.get(candidateNo - 1);
		voterNameToChosenCandidate.put(currentVoter.getName(), chosenCandidate);
		partyNameToVoteCount.putIfAbsent(chosenCandidate.getParty(), 0);
		partyNameToVoteCount.computeIfPresent(chosenCandidate.getParty(), (key, val) -> val + 1);
		
		return String.format("Successfully cast vote to: %s, %s", chosenCandidate.getName(), chosenCandidate.getParty());
	}

	private String listCandidates(String[] args) {
		if (currentVoter == null) {
			return "Login first!";
		}
		
		List<String> stateCandidates = getStateCandidatesName();
		for (int i = 0; i < stateCandidates.size(); i++) {
			stateCandidates.set(i, (i + 1) + ". " + stateCandidates.get(i));
		}
		
		return String.join("\n", stateCandidates);
	}

	private List<String> getStateCandidatesName() {
		List<String> stateCandidates = getStateCandidates()
		.map(candidate -> candidate.getName() + ", " + candidate.getParty())
		.collect(Collectors.toList());
		return stateCandidates;
	}

	private Stream<Candidate> getStateCandidates() {
		return Arrays.stream(candidates)
		.filter(candidate -> candidate.getState().equals(currentVoter.getState()));
	}

	private String login(String[] args) {
		for (int i = 0; i < voters.length; i++) {
			Voter voter = voters[i];
			String user = voter.getName();
			String passwd = voter.getPasswd();
			
			if (user.equals(args[1]) && passwd.equals(args[2])) {
				currentVoter = voter;
				return "Successful login";
			}
		}
		return "Invalid credentials!";
	}


	public static void main(String[] args) {
		ElectionSimulator simulator = new ElectionSimulator(
				new Voter[] {
						new Voter("scott", "tiger", "Gujarat"),
						new Voter("admin", "admin", "Gujarat")
				},
				new Candidate[] {
						new Candidate("Narendra Modi", "Gujarat", "BJP"),
						new Candidate("Rahul Gandhi", "Gujarat", "INC"),
						new Candidate("Manmohan Singh", "Punjab", "INC")
				});
		
		try (Scanner scanner = new Scanner(System.in)) {
			String command = null;
			System.out.print("> ");
			while (!"q".equals(command = scanner.nextLine())) {
				String result = simulator.executeProcess(command);
				System.out.println(result);
				System.out.print("> ");
			}
		}
	}
}
