package main;

import java.util.HashSet;
import java.util.Set;

public class SetExerciseApplication {
	// --- Instantiate new HashSet --- //
	static Set<String> pokerHands = new HashSet<>();
	// Looking to get some understanding for why Trevor wanted to instantiate the new 
	// HashSet outside of the main method. In my case, it's not needed. Probably because 
	// I instantiate it inside my FileService.java file
	
	public static void main(String[] args) {
		// --- Extract the data from the CSV --- //
		// Original extractDataFromCSV() method
//		Set<String> pokerHands = new HashSet<>();
		
		// Updated extractDataFromCSV() request
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
	
	// Original extractDataFromCSV() method
//	public static Set<String> extractDataFromCSV(String fileName) {
//		FileService_2 fileService = new FileService_2();
//		fileService.readFile();
//		return null;
//	}

	// Updated extractDataFromCSV() method
	public static Set<String> extractDataFromCSV(String fileName) {
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
