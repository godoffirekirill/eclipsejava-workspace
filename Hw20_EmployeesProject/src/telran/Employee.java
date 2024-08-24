package telran;

public class Employee {
	private String company = "No company";  //- название компании   
	private double baseSalary;  //- базовая зарплата от 6000 до 50000 шек без учета процентной надбавки зависящей от позиционного уровня   
	private int position;  //- позиционный уровень от 1 до 7   
	private String name = "No name";  //- имя сотрудника   
	private int id = -1;   //-  табельный номер   
	private int age;  //- возраст сотрудника От 18 до 80 лет   

	public Employee() {}
	
	public Employee(String company, double baseSalary, int position, String name, int id, int age) {
		setCompany(company);
		setBaseSalary(baseSalary);
		setPosition(position);
		setName(name);
		if(id >=1 && id<1000000)
		this.id = id;
		setAge(age);	
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		if(company != null && company.length()!=0)
		this.company = company;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		if(baseSalary>=6000 && baseSalary < 50000)
		this.baseSalary = baseSalary;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		if(position>=1 && position <=7)
		this.position = position;
	}

	public String getName() {
	
		return name;
	}

	public void setName(String name) {
		if(name != null && name.length()!=0)
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age >= 18 && age <80)
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public double salary() {
		double[] coef = {0.1, 0.15, 0.2, 0.25, 0.3, 0.35, 0.5};
		return baseSalary + baseSalary*coef[position -1];				
	}
	public String display() {
//		System.out.printf("Employee: id = %d, name = %s, age = %d, company = %s, position = %d\n",
//				id, name, age, company, position);
		
		return String.format("Employee: id = %d, name = %s, age = %d, company = %s, position = %d\n",
				id, name, age, company, position);
	}
	
	public String display(boolean tax) {
		double sal = salary();
		return display() + " Salary: " + (tax? sal * 0.7 : sal);
	}
}
