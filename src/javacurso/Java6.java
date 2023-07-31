package javacurso;
import java.util.Scanner;

public class Java6 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("Let's find the Hypotenuse!");
		
		System.out.println("What is the lengh of x:");
		double x = scanner.nextDouble();
		System.out.println("What is the lengh of y:");
		double y = scanner.nextDouble();
		
		double z = Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
		System.out.println("The Hypotenuse is "+z);
		
		scanner.close();
}
}
