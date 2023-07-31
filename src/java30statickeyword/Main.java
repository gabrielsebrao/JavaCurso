package java30statickeyword;

public class Main {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		Friend friend1 = new Friend("Daniel");
		@SuppressWarnings("unused")
		Friend friend2 = new Friend("Gabriel");
		@SuppressWarnings("unused")
		Friend friend3 = new Friend("Nicolas");
		
		Friend.displayFriends();
	}
}
