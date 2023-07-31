package java44filereader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException, FileNotFoundException {
		
		FileReader reader = new FileReader("src\\java44filereader\\art.txt");
		
		int data = reader.read();
		while(data != -1) {
		System.out.print((char)data);
		data = reader.read();
		}
		reader.close();
	}
}
