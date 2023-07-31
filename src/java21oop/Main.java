package java21oop;

public class Main {
	public static void main(String[] args) {
		
		Daniel daniel = new Daniel();
		
		System.out.println(daniel.favoriteArtist);
		daniel.favoriteArtist = "Corcunde";
		System.out.println(daniel.favoriteArtist);
		
		System.out.println();
		daniel.talk();
		
	}
}
