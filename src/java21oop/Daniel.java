package java21oop;

public class Daniel {
	
	int age = 17;
	double height = 1.85;
	boolean chatonildo = true;
	String sex = "male";
	String hair = "blond";
	String favoriteArtist = "Taylor Swift";
	
	void talk() {
		System.out.println("You talk to Daniel.");
	}
	
	void mock() {
		System.out.println("You mock Daniel.");
	}
	int birthYear() {
		int birthYear = 2023 - age;
		return birthYear;
	}
	
}
