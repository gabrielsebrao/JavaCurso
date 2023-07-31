package java22constructors;

public class Main {
	public static void main(String[] args) {
		
		Human gabriel = new Human("Gabriel", 20, 70.5);
		Human giulia = new Human("Giulia", 30,  62.7);
		
		System.out.println(gabriel.name);
		System.out.println(giulia.name);
		
		gabriel.eat();
		giulia.eat();
		
	}
}
