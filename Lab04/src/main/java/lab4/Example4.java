package lab4;

import java.util.List;
import java.util.ArrayList;

/**
 * A simple class to introduce ArrayLists
 * 
 * @author Stella Kazamia
 * 
 */

public class Example4 {
	
	// Add a field
	private List<String> nameList;
	// Add a default constructor
	public Example4() {
		nameList = new ArrayList<String>();
	}
	public void addNames() {
		// Initialise the array list
		this.nameList.add("Helen");
		this.nameList.add("Stella");
	}

	public String displayNames() {
		// Loop through the array list
		String allElements = "";
		for (int i = 0; i < nameList.size(); i++) {
		allElements += nameList.get(i);
		}
		return allElements;
	}
}
