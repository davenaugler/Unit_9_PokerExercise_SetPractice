package main;

import java.util.HashSet;
import java.util.Set;

public class SetExerciseApplication {
	// --- Instantiate new HashSet --- //
	static Set<String> pokerHands = new HashSet<>();

	public static void main(String[] args) {
		// --- Extract the data from the CSV --- //
		Set<String> pokerHands = extractDataFromCSV("PokerHands.csv"); // What should be in these parentheses?
		printToConsole(pokerHands);

		// --- Remove ACE HIGH and QUEEN HIGH --- //
		removeCard(pokerHands, "ACE HIGH");
		removeCard(pokerHands, "QUEEN HIGH");
		printToConsole(pokerHands);

		// --- Update PAIR to DEUCES --- //
		updateCard(pokerHands, "PAIR", "DEUCES");
		printToConsole(pokerHands);
	}

	private static void printToConsole(Set<String> pokerHands) {
		for (String pokerHand : pokerHands) {
			System.out.println(pokerHand);
		}
		System.out.println("");
	}

	private static Set<String> extractDataFromCSV(String fileName) {
		FileService fileService = new FileService();
		return fileService.readFile(fileName);
	}

	private static void removeCard(Set<String> pokerHands, String hand) {
		pokerHands.remove(hand);
	}

	private static void updateCard(Set<String> pokerHands, String hand, String cardFace) {
		pokerHands.remove(hand);
		pokerHands.add(cardFace);
	}

}
