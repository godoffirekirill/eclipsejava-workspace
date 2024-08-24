package bank;


public class EmployeeAppl {

	public static void main(String[] args) {
		
		
		Employee[] employee = {
				new Employee("Nissan", 10000, 3, "Oleg", 99, 28),
				new Employee("Nissan", 10000, 3, "Oleg", 99, 28),
				new Employee("Kia", 10000, 3, "Oleg", 99, 28),
				new Employee("Fiat", 10000, 3, "Oleg", 99, 28),
				new Employee("Volga", 10000, 3, "Oleg", 99, 28),
		};
		displayAllEmployee(employee);
		displayAllEmployeeSalaryTax(employee);
		displayAllEmployeeSalaryWithTax(employee);
		displayAllEmployeeSalary(employee);		

	}

	
	
	
	private static void displayAllEmployee( Employee[] employee) {
		for(int i = 0; i < employee.length; i++)
			employee[i].display();		
	}
	private static void displayAllEmployeeSalaryTax( Employee[] employee) {
		for(int i = 0; i < employee.length; i++)
			employee[i].display(true);		
	}
	private static void displayAllEmployeeSalaryWithTax( Employee[] employee) {
		for(int i = 0; i < employee.length; i++)
			employee[i].display(false);		
	
	}
	private static void displayAllEmployeeSalary( Employee[] employee) {
		double sum = 0;
		for(int i = 0; i < employee.length; i++)
			sum += employee[i].salary();		
			System.out.printf("Salary = %.2f \n",sum);

		 
	}
	
}
