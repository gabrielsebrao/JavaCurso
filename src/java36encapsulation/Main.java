package java36encapsulation;

public class Main {

	public static void main(String[] args) {

		Car car = new Car("Ford", "Camaro", 2023);

		System.out.println(car.getMake());
		System.out.println(car.getModel());
		System.out.println(car.getYear());
		
		System.out.println();
		
		car.setMake("Chevrolet");
		car.setModel("Lamborghini");
		car.setYear(2021);
		
		System.out.println();
		
		System.out.println(car.getMake());
		System.out.println(car.getModel());
		System.out.println(car.getYear());

	}

}
