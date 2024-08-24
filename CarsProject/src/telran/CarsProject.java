package telran;

public class CarsProject {

	private String model;
	private String color;
	private int year;
	private double motorValue;
	
	
	public CarsProject(String model1, String color1, int year1, double motorValue1) {
		if(model1 != null)
			setModel(model1);
		else model = "Anonimous";
		if (color1 !=null)
			setColor(color1);
		else color = "White";
		if(year1 >= 1945 && year1 <= 2022)
			setYear(year1);
		else year1 = -1;
		if(motorValue1 >= 0.5 && motorValue1 <= 0.9)
			setMotorValue(motorValue1);
		else motorValue1 = -1;
	
	}
	public double getMotorValue() {
		return motorValue;
	}
	public void setMotorValue(double NewmotorValue) {
		if(NewmotorValue >= 0.5 && NewmotorValue <= 0.9)
		motorValue = NewmotorValue;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int newYear) {
		if(newYear >= 1945 && newYear <= 2022) 
		year = newYear;
		
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	public void display() {
		System.out.printf("Hello! I have a car %s, color: %s, year: %d, motor: %.1f,\n",model,color,year,motorValue);
	}
	
}
