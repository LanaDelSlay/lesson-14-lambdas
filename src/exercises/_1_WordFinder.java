package exercises;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

public class _1_WordFinder {
	
	public static List<String> messages = new ArrayList<String>();

	public static void main(String[] args) {
		/* Print all the words beginning with P that are over 10 characters. */
		loadWordList();
		Stream<String> wordStream = messages.stream();
		List<String>goodWords = wordStream.filter(String -> String.indexOf("P") == 0).
				filter(String -> String.length() >= 10).
				collect(Collectors.toList());
		System.out.println(goodWords);

		
	}

	public static List<String> loadWordList() {
		//List<String> messages = new ArrayList<String>();
		File file = new File("resource/words.txt");

		try {
			BufferedReader buffer = new BufferedReader(new FileReader(file));
			String aLine;
			while ((aLine = buffer.readLine()) != null) {
				messages.add(aLine);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return messages;
	}

	
}
