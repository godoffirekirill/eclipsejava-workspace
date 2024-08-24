package telran;

public class SaleManager extends Employee{

	double totalSales;
	double bonus;
	
	public SaleManager(String name, int age, boolean married, String company, String position, double baseSalary,
			double totalSales, double bonus) {
		super(name, age, married, company, position, baseSalary);
		setTotalSales(totalSales);
		setBonus(bonus);
	}

	public double getTotalSales() {
		return totalSales;
	}

	public void setTotalSales(double totalSales) {
		if(totalSales >=0.0)
		this.totalSales = totalSales;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		if(bonus >=0.0 && bonus <= 1.0)
		this.bonus = bonus;
	}
	
	double calculateSalary() {
		
		return baseSalary + (baseSalary * bonus);
	}
	
	
	public void display() {
		System.out.println("Person name is:" + name + " Age: " + age + " Married: " + married + " Work in company: " + company + " position " + position + " baseSalary " + baseSalary + " bonus " + bonus + " calculateSalary " + calculateSalary());

	}
	
}
