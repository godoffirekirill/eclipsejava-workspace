package telran;

public class CarAppl {

	public static void main(String[] args) {
		System.out.println(Car.count);
		Car car1 = new Car();
		Car car2 = new Car("Nissan", "Juke", "silver", 2013, 1.6);
		car2.display();
		Car[] cars = {
				new Car("BMW", "black", 2000, 2.0),
				new Car("Nissan", "blUE", 2021, 1.3),
				new Car("Kia", "red", 2016, 1.2),
				new Car("Fiat", "white", 1987, 0.5),
				new Car("Volga", "black", 2000, 1.8),
		};
		displayAllCars(cars);
		System.out.println(Car.count);
		
		Car[] cars2 = new Car[20];
		String[] colors = {"red", "black", "green", "white", "blue"};
		String[] models = {"BMW", "Kia", "Fiat", "Skoda", "Mazda"};
		for (int i = 0; i < cars2.length; i++) {
			cars2[i] = Car.randomCarGenerator(models, colors);
		}
		System.out.println("============= " + Car.count + " ===================");
		displayAllCars(cars2);
	}

	private static void displayAllCars(Car[] cars) {
		for(int i = 0; i < cars.length; i++)
			cars[i].display();		
	}

}
