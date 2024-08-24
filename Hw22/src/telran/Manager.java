package telran;

public class Manager extends Employee{

	int grade = 1;

	public Manager(String name, int age, boolean married, String company, String position, double baseSalary,
			int grade) {
		super(name, age, married, company, position, baseSalary);
		setGrade(grade);
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		if(grade >=1 && grade <= 6)
		this.grade = grade;
	}
	
	double calculateSalary() {
		
		return baseSalary * grade;
	}
	
	
	public void display() {
		System.out.println("Person name is:" + name + " Age: " + age + " Married: " + married + " Work in company: " + company + " position " + position + " baseSalary " + baseSalary + " grade " + grade + " calculateSalary " + calculateSalary());

	}

}
