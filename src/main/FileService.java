package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class FileService {

	public Set<String> readFile(String fileName) {
		Set<String> pokerHands = new HashSet<>();
		boolean isFirstLine = true;
		int columbNumberInCSV = 1;

		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			String line;
			// Skips first line on .csv (aka header on .csv)
			while ((line = br.readLine()) != null) {
				if (isFirstLine) {
					isFirstLine = false;
					continue; 
				}

				// Split the line by the CSV delimiter
				String[] valuesInCSV = line.split(",");

				// Add only column 1 to the HashSet
				if (columbNumberInCSV < valuesInCSV.length) {
					String columnValue = valuesInCSV[columbNumberInCSV].trim();
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
