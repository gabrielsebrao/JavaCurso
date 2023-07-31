package java32methodoverriding;

public class Dog extends Animal{
	
	@Override
	void speak() {
		System.out.println("The dog goes *bark*.");
	}
}
