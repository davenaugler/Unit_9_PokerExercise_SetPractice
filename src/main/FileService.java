package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class FileService {

	private final String FILENAME = "PokerHands.csv";

	public Set<String> readFile(String fileName) {
		Set<String> pokerHands = new HashSet<>();
		boolean isFirstLine = true;
		int columbNumber = 1;

		try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {
			String line;
			// Skips first line on .csv (aka header on .csv)
			while ((line = br.readLine()) != null) {
				if (isFirstLine) {
					isFirstLine = false;
					continue; 
				}

				// Split the line by the CSV delimiter
				String[] values = line.split(",");

				// Add only column 1 to the HashSet
				if (columbNumber < values.length) {
					String columnValue = values[columbNumber].trim();
					pokerHands.add(columnValue);
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
//		System.out.println("FileService returnable data: " + " " + pokerHands);
		return pokerHands;
	}
}
