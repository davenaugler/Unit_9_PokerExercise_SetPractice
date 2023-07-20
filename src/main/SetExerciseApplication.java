package main;

import java.util.HashSet;
import java.util.Set;

public class SetExerciseApplication {
	// instantiate new HashSet
//	static Set<String> pokerHands = new HashSet<>();
	public static void main(String[] args) {
		Set<String> pokerHands = new HashSet<>();

		// extract the data from the CSV
		extractDataFromCSV("FileService_2.java");
		printToConsole(pokerHands);

		// remove ACE HIGH and QUEEN HIGH
		removeItem(pokerHands, "ACE HIGH");
		removeItem(pokerHands, "QUEEN HIGH");
		printToConsole(pokerHands);

		// Update PAIR to DEUCES
		updateItem(pokerHands, "PAIR", "DEUCES");
	}

	private static void printToConsole(Set<String> pokerHands) {
		for (String pokerHand : pokerHands) {
			System.out.println(pokerHand);
		}
		System.out.println("");
	}

	public static Set<String> extractDataFromCSV(String fileName) {
		FileService_2 fileService = new FileService_2();
		fileService.readFile();
		return null;
	}

	// My Methods
	private static void removeItem(Set<String> pokerHands, String item) {
		pokerHands.remove(item);
	}

	private static void updateItem(Set<String> pokerHands, String item, String cardFace) {
		pokerHands.contains(item);
		pokerHands.remove(item);
		pokerHands.add(cardFace);
	}

}
