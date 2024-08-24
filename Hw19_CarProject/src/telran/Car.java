package telran;

public class Car {
	public static int count = 0;
	
	private String model; //- модель машины 
	private String color = "No color"; //- цвет машины 
	private int year; //- год выпуска машины (диапазон 1945 - 2022) 
	private double motorValue;
	
	public Car() {}
	
	
	public Car(String manufacture, String modelName, String color, int year, double motorValue) {
		super();
		model = manufacture+" "+modelName;
		this.color = color;
		this.year = year;
		this.motorValue = motorValue;
	}


	public Car(String model, String color, int year, double motorValue) {
		count++;
		if(model !=null && model.length()!=0)
		this.model = model;
		else this.model = "No model";
		
//		if(color != null && color.length() !=0)
//		this.color = color;
//		else this.color = "No color";
		
		setColor(color);
		
		if(year >= 1945 && year < 2022)
		this.year = year;
		
		if(motorValue >=0.5 && motorValue < 9.)
		this.motorValue = motorValue;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		if(color != null && color.length() !=0)
		this.color = color;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if(year >= 1945 && year < 2022)
		this.year = year;
	}

	public double getMotorValue() {
		return motorValue;
	}

	public void setMotorValue(double motorValue) {
		if(motorValue >=0.5 && motorValue < 9.)
		this.motorValue = motorValue;
	}

	public String getModel() {
		return model;
	} 
	
	public void display() {
	System.out.printf("Car => model: %s, color: %s, year: %d, motor value: %.1f\n", model, color, year, motorValue);
	}
	public void display(int i) {
		i++;
		System.out.printf("Car => model: %s, color: %s, year: %d, motor value: %.1f\n", model, color, year, motorValue);		
	}
	
//	public String display1() {
//		
//	}
	
//	car1.display1();
	
//	long a = 4526456456;
//	String str = car1.display();
	
	public static Car randomCarGenerator(String[] models, String[] colors) {
		String model = models[intNumberGenerator(0, models.length - 1)];
		String color = colors[intNumberGenerator(0, colors.length-1)];
		int year = intNumberGenerator(1945, 2021);
		float motorVal = intNumberGenerator(1, 8);
		
		return new Car(model, color, year, motorVal);
	}

	private static int intNumberGenerator(int min, int max) {		
		return (int)(Math.random()*(max-min +1) ) + min;
	}


}
