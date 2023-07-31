package javacurso;
import java.util.Scanner;

public class JavaA17 {
	
	public static void main(String[] args) {
		
		// in english
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Type you name: ");
		String name = scanner.next();
		
		System.out.println("Type your age: ");
		int age = scanner.nextInt();
		
		nomear(name);
		System.out.println("You were born in: "+anoNascimento(age));
		
		scanner.close();
	}
	
		// o resto em portugues para mostrar que 
		// parametro e diferente de argumento!
	
	static void nomear(String nome) {
		System.out.println("Ola, "+nome+", voce esta usando um metodo!");
	}
	
	static int anoNascimento(int idade) {
		int z = 2023 - idade;
		return z;
	}
}