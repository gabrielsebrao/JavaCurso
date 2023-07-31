package java28arrayofobjects;

public class Main {
	public static void main(String[] args) {
		
		//Food[] groceries = new Food[3];
		
		Food food1 = new Food("Pizza");
		Food food2 = new Food("Water");
		Food food3 = new Food("Hamburguer");
		
		Food[] groceries = {food1, food2, food3};
		
		//groceries[0] = food1;
		//groceries[1] = food2;
		//groceries[2] = food3;
		
		for (Food i : groceries) {
			System.out.println(i);
		}
	}
}
