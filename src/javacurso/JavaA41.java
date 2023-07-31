package javacurso;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaA41 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		while(true){
			try {
				System.out.print("Enter a number to divide: ");
				int x = scanner.nextInt();
				
				System.out.print("Enter a number to divide by: ");
				int y = scanner.nextInt();
				
				int z = x/y;
				
				System.out.printf("The result of %d by %d is %d.", x, y, z);	
				break;
			}
			catch(ArithmeticException a) {
				System.out.println("ERROR: cannot divide by zero.");
			}
			catch(InputMismatchException b) {
				System.out.println("ERROR: enter a valid value.");
				scanner.nextLine();
			}
		}
		
		scanner.close();
	}
}
