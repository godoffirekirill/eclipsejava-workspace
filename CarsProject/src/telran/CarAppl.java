package telran;

public class CarAppl {

	public static void main(String[] args) {
		
		
		CarsProject car1 = new CarsProject("volvo", "cx90", 2020, 0.8);
		CarsProject car2 = new CarsProject("volvo", "cx60", 2020, 0.6);
		CarsProject car3 = new CarsProject("volvo", "cx30", 2020, 0.3);

		car1.display();
		
		CarsProject[]cars = {car1,car2,car3};
		for (int i = 0; i < cars.length; i++) {
			cars[i].display();
		}
	}

}
