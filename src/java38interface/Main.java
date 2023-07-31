package java38interface;

public class Main {
	
	public static void main(String[] args) {
		
		Rabbit rabbit = new Rabbit();
		Hawk hawk = new Hawk();
		Fish fish = new Fish();
		
		hawk.hunt();
		rabbit.flee();
		
		fish.flee();
		fish.hunt();
		
	}
}
