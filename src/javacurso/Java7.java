package javacurso;
import java.util.Random;

public class Java7 {
	public static void main(String[] args) {
	
		Random random = new Random();
		
		int x = random.nextInt(7);
		//double y = random.nextDouble(0.1);
		//boolean z = random.nextBoolean();
		
		System.out.println(x);
	}
}
