package java40dynamicpolymorfism;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Animal animal;
		
		System.out.println("What animal do you want to choose?");
		System.out.println("[ 1 ] - Dog");
		System.out.println("[ 2 ] - Cat");
		System.out.print("Option: ");
		int choice = scanner.nextInt();
		
		switch (choice) {
			case 1:
				animal = new Dog();
				animal.speak();
			break;
			
			case 2:
				animal = new Cat();
				animal.speak();
			break;
			
			default:
				animal = new Animal();
				animal.speak();
		}
		
		scanner.close();
	}	
}
