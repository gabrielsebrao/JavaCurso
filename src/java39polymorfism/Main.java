package java39polymorfism;

public class Main {
	public static void main(String[] args) {
		
		Daniel daniel = new Daniel();
		Nicolas nicolas = new Nicolas();
		Giulia giulia = new Giulia();
		
		Friends[] friends = {daniel, nicolas, giulia};
		
		for (Friends x : friends) {
			x.speak();
		}
	}
}
