package javacurso;
import java.util.Scanner;

public class JavaA10 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("You are playing a game! Press q or Q to quit.");
		String event = scanner.nextLine();
		
		if (!event.equals("q") && !event.equals("Q")) {
			System.out.println("You quit the game.");
		}
		else {
			System.out.println("You are still playing the game.");
		}
		
//		System.out.println("What is the temperature outside?");
//		int temp = scanner.nextInt();
//		
//		if (temp > 30) {
//			System.out.println("It is hot outside.");
//		}
//		else if (temp >= 20 && temp <= 30) {
//			System.out.println("It is warm outside.");
//		}
//		else {
//			System.out.println("It is cold outside.");
//		}
		
		scanner.close();
	}
}
