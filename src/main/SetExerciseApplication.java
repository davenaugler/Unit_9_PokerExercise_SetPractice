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
		Set<String> pokerHands = extractDataFromCSV("FileService_2.java");
		printToConsole(pokerHands);
		
		// --- Remove ACE HIGH and QUEEN HIGH --- //
		removeItem(pokerHands, "ACE HIGH");
		removeItem(pokerHands, "QUEEN HIGH");
		printToConsole(pokerHands);

		// --- Update PAIR to DEUCES --- // 
		updateItem(pokerHands, "PAIR", "DEUCES");
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

	private static void removeItem(Set<String> pokerHands, String item) {
		pokerHands.remove(item);
	}

	private static void updateItem(Set<String> pokerHands, String item, String cardFace) {
		pokerHands.contains(item);
		pokerHands.remove(item);
		pokerHands.add(cardFace);
	}

}
