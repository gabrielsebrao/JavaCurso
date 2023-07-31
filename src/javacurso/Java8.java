package javacurso;
import java.util.Scanner;

public class Java8 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("How old are you?");
		int age = scanner.nextInt();
		
		if (age >= 75) {
			System.out.println("Ok Boomer");
		}
		else if (age >= 18) {
			System.out.println("You are an adult!");
		}
		else if (age >= 13) {
			System.out.println("You are a teenager!");
		}
		else if (age < 0) {
			System.out.println("Insert a valid age!");
		}
		else {
			System.out.println("You are not and adult!");
		}
		
		scanner.close();
	}
}
