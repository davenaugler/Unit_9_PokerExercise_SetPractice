package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class FileService {
	
	private final String FILENAME = "PokerHands.csv";
	private final int TOTAL_CARDS = 50;
	
	public PokerHand[] readFile() throws IOException {
		PokerHand[] pokerHands = new PokerHand[TOTAL_CARDS];
		boolean isFirstLine = true;
		int counter = 0;

		try(BufferedReader fileReader = new BufferedReader(new FileReader(FILENAME))) {
			String line;
			while ((line = fileReader.readLine()) != null) {
				if (isFirstLine) {
					isFirstLine = false;
					continue; // Skips first line on .csv
				}
				
				
//				PokerHand hand = new PokerHand(line.split(","));
				HashSet hand = new HashSet();
				pokerHands[counter] = hand;
				counter++;
				System.out.println(pokerHands);
				
				if (counter >= TOTAL_CARDS) {
					break; // Reached total number of cards in FILENAME, exit the loop
				}
				
			}
			
		}
		return null;
		
		
	}
	
	


}
