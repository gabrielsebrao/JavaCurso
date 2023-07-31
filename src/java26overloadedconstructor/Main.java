package java26overloadedconstructor;

public class Main {
	public static void main(String[] args) {
		
		String object = "Focaccio";
		
		Pizza pizza = new Pizza(object);
		
		System.out.println(pizza.bread);
		System.out.println(pizza.sauce);
		System.out.println(pizza.cheese);
		System.out.println(pizza.topping);
	}
}
