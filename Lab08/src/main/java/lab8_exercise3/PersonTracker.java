package lab8_exercise3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PersonTracker {
	private List<Person> peopleList;
	
	public PersonTracker() {
		this.peopleList = new ArrayList<Person>();
	}
	
	public String displayList() {
		String result = "";
		for(int i = 0; i < peopleList.size(); i++) {
			result += peopleList.get(i) + "\n";
		}
		return result;
	}
	
	public void readTextFile(String filename) {
		try {
			BufferedReader fileBR = new BufferedReader(new FileReader(filename));
			String a = "";
			while ((a = fileBR.readLine()) != null) {
				this.breakLine(a);
			}
			fileBR.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException");
		}
		catch (IOException e) {
			System.out.println("IOException");
		}
	}
		
	private void breakLine(String line) {
		String[] personalData = line.split(" ");
		String forename = personalData[0];
		String surname = personalData[1];
		int age = Integer.parseInt(personalData[2]);
		try {
		this.addPerson(forename, surname, age);
		}
		catch (Exception e) {
		}
	}
		
	private void addPerson(String forename, String surname, int age) throws InvalidAgeException, InvalidSurnameException {
		Person person = new Person(forename, surname, age);
		peopleList.add(person);
	}	
}
