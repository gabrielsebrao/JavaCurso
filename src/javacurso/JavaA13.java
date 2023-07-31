package javacurso;
import java.util.Scanner;

public class JavaA13 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int rows = 0;
		int columns = 0;
		String symbol = "";
		
		System.out.println("Enter # of rows: ");
		rows = scanner.nextInt();
		System.out.println("Enter # of columns: ");
		columns = scanner.nextInt();
		System.out.println("Enter symbol to use: ");
		symbol = scanner.next();
		
		for (int i=1;i<=rows;i++) {
			System.out.println();
//			System.out.print(i+" ");
			for (int j=1; j <= columns; j++) {
				System.out.print(symbol);
			}
		}
		
		scanner.close();
	}

}
