package telran;

public class Employee extends Person{
	
	String company = "No company";
	String position = "No position";
	double baseSalary;
	
	public Employee(String name, int age, boolean married, String company, String position, double baseSalary) {
		super(name, age, married);
		setCompany(company);
		setPosition(position);
		setBaseSalary(baseSalary);
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		if(company != null && company.length()!=0)
		this.company = company;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		if(position != null && position.length()!=0)
		this.position = position;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		if(baseSalary >=0.0)
		this.baseSalary = baseSalary;
	}
	
	public void display() {
		System.out.println("Person name is:" + name + " Age: " + age + " Married: " + married + " Work in company: " + company + " position " + position + " baseSalary " + baseSalary);

	}
	
}
