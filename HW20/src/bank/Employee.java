package bank;

public class Employee {

	private String company;
	private double baseSalary;
	private int position;
	private String name;
	private int id;
	private int age;
	
	public Employee() {}

	public Employee(String company, double baseSalary, int position, String name, int id, int age) {
	//	super();
		if(company != null && (company.length() != 0 && company.length() <= 20))
		this.company = company;
		else this.company = "Error company";
		if(baseSalary >= 6000 && baseSalary <= 50000)
		this.baseSalary = baseSalary;
		if(position >=1 && position <= 7)
		this.position = position;
		if(name != null && (name.length() != 0 && name.length() <= 15))
		this.name = name;
		else this.name = "Anonimus";
		if(id >=0 && id <= 9999)
		this.id = id;
		if(age >=18 && age <= 80)
		this.age = age;
		
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age >=18 && age <= 80)
		this.age = age;
	}

	public int getId() {
		
		return id;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPosition() {
		
		return position;
	}

	public void setPosition(int position) {
		if(position >=1 && position <= 7)

		this.position = position;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		if(baseSalary >= 6000 && baseSalary <= 50000)

		this.baseSalary = baseSalary;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		if(company != null && (company.length() != 0 && company.length() <= 20))

		this.company = company;
	}
	
	public double salary() {
		double percent = 0;
		switch (position) {
		case 1:
			percent = 0.10;
		case 2: 
			percent = 0.15;
		case 3:
			percent = 0.20;
		case 4:
			percent = 0.25;
		case 5:
			percent = 0.30;
		case 6:
			percent = 0.40;
		case 7:
			percent = 0.50;

		}
		
	//	System.out.printf("Salary = %2f/n",salary);
		return baseSalary + (baseSalary * percent);	}
	
	public void display() {
		System.out.printf("About Employee information, Company: %s, Position: %d, Name: %s, Id: %d, age %d\n",company,position,name,id,age);

	}

	  public void display(boolean tax) {
	        double temp;
	        if (!tax) {
	            temp = salary() - (salary() * 0.3);
	            System.out.printf("Salary after tax: %.2f\n", temp);
	        } else {
	            temp = salary();
	            System.out.printf("Salary before tax: %.2f\n", temp);
	        }
	    }
	  
	


}
	
	
	
	
	

