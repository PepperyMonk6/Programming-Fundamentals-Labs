package lab8_exercise1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Counting {
	public Counting() {
		super();
	}

	public String readTextFile() {
		String result = "";
		int counter = 1;
		try {
			BufferedReader fileBR = new BufferedReader(new FileReader("words.txt"));
			String c = "";
			while ((c = fileBR.readLine()) != null) {
				result += this.displayLine(c, counter);
				counter++;
			}
			fileBR.close();
		}
		catch (IOException e) {
			System.out.println("IOException");
		}
		return result;
	}
	
	private String displayLine(String line, int counter) {
		line = line + " : " + counter + "\n";
		//System.out.println(line);
		return line;
	}
}
