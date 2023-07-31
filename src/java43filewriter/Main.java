package java43filewriter;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
	
	public static void main(String[] args) {
		
		try {
			FileWriter writer = new FileWriter("src\\java43filewriter\\poem.txt");
			writer.write("Roses are red \nViolets are blue \nYour mom");
			writer.append("\nA poem by Gabriel");
			writer.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
