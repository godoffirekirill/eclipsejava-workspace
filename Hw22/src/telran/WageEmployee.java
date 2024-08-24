package telran;

public class WageEmployee extends Employee{
	double hours;
	double wage;
	
	public WageEmployee(String name, int age, boolean married, String company, String position, double baseSalary,
			double hours, double wage) {
		super(name, age, married, company, position, baseSalary);
		setHours(hours);
		setWage(wage);
	}
	
	public double getHours() {
		return hours;
	}
	public void setHours(double hours) {
		if(hours >=0.0)
		this.hours = hours;
	}
	public double getWage() {
		return wage;
	}
	public void setWage(double wage) {
		if(wage >=0.0)
		this.wage = wage;
	}
	
	double calculateSalary() {
		
		return baseSalary + (hours * wage);
	}
	
	
	public void display() {
		System.out.println("Person name is:" + name + " Age: " + age + " Married: " + married + " Work in company: " + company + " position " + position + " baseSalary " + baseSalary + " hours " + hours + " wage " + wage + " calculateSalary " + calculateSalary());

	}
	
	
}
