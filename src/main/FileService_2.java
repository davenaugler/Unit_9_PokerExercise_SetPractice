package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class FileService_2 {

	private final String FILENAME = "PokerHands.csv";

	public Set<String> readFile() {
		Set<String> pokerHands = new HashSet<>();
		boolean isFirstLine = true;
		int columbNumber = 1;

		try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {
			String line;
			while ((line = br.readLine()) != null) {
				if (isFirstLine) {
					isFirstLine = false;
					continue; // Skips first line on .csv
				}

				// Split the line by the CSV delimiter
				String[] values = line.split(",");

				// Add only column 1 to the HashSet
				if (columbNumber < values.length) {
					String columnValue = values[columbNumber].trim();
					pokerHands.add(columnValue);
				}

//				 Add each value to the HashSet
//				for (String value : values) {
//					pokerHands.add(value);
//				}
			}
//			return pokerHands;
//			System.out.println(pokerHands);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return pokerHands;

	}

}
