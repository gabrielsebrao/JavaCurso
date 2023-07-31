package javacurso;
import java.util.Scanner;

public class Java9 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String day2 = "";
		
		System.out.println("What day of week is today?");
		String day = scanner.nextLine();
		
		switch(day) {
		
			case "Sunday": 
				day2 = "Sunday";
			break;
			
			case "Monday":
				day2 = "Monday";
			break;
			
			case "Tuesday":
				day2 = "Tuesday";
			break;
			
			case "Wednesday":
				day2 = "Wednesday";
			break;
			
			case "Thursday":
				day2 = "Thursday";
			break;
			
			case "Friday":
				day2 = "Friday";
			break;
			
			case "Saturday":
				day2 = "Saturday";
			break;
			
			default:
				System.out.println("This is not a day!");
				System.exit(0);
		}
		System.out.println("It is "+day2+"!");
		scanner.close();

	}
}
