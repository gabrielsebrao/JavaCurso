package java42fileclass;

import java.io.File;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		
		File file = new File("src\\java42fileclass\\secret_message.txt");
		
		if(file.exists()) {
			System.out.println("That file exists!");
			System.out.println(file.getPath());
			System.out.println(file.getAbsolutePath());
			System.out.println(file.isFile());
			file.delete();
		}
		else {
			System.out.println("That file doesnt exist...");
			file.createNewFile();
		}
	}
}
