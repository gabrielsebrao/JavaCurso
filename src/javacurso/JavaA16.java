package javacurso;
import java.util.ArrayList;

public class JavaA16 {
	public static void main(String[] args) {
		
//		String[] books = {"Biblia", "O Prisioneiro de Azkabam", 
//				"O Diario de um Banana"};
		
		ArrayList<String> books = new ArrayList<String>();
		books.add("Biblia");
		books.add("O Prisioneiro de Azkabam");
		books.add("O Diario de um Banana");
		
		
		for (String i : books) {
			System.out.println(i);
		}
	}
}
