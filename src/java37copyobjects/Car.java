package java37copyobjects;

public class Car {
		
		private String make;
		private String model;
		private int year;
		
		Car(String make, String model, int year) {
			
			setModel(model);
			setMake(make);
			setYear(year);
			
		}
		
		Car(Car car) {
			
			setMake(car.getMake());
			setModel(car.getModel());
			setYear(car.getYear());
	
		}
		
		public void copy(Car car) {
			setMake(car.getMake());
			setModel(car.getModel());
			setYear(car.getYear());
		}

		// Getter e Setter de make
		public String getMake() {
			return make;
		}
		
		public void setMake(String make) {
			this.make = make;
		}
		
		
		// Getter e Setter de model
		public String getModel() {
			return model;
		}
		
		public void setModel(String model) {
			this.model = model;
		}
		
		
		// Getter e Setter de year
		public int getYear() {
			return year;
		}
		
		public void setYear(int year) {
			this.year = year;
		}
	}

