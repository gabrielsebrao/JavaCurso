package java30statickeyword;

public class Friend {
	
	String name;
	static int numberOfFriends;
	
	public Friend(String name) {
		this.name = name;
		numberOfFriends++;
	}
	
	public static void displayFriends() {
		System.out.printf("You have %s friends.",numberOfFriends);
	}
}
