package telran;

public class PersonAppl {

	
	public static void main(String[] args) {
		
		

		Manager one = new Manager("name1",30,false,"Comp","tech",2000.20,3);
		Manager two = new Manager("name2",40,false,"Comp","tech",2000.20,3);
		Manager tree = new Manager("name3",50,false,"Comp","tech",2000.20,3);
		
		WageEmployee four = new WageEmployee("name4",60,true,"Company4","Position4",4000.3,80.3,3);
		WageEmployee five = new WageEmployee("name5",60,true,"Company5","Position5",5000.4,20.2,3);
		WageEmployee six = new WageEmployee("name6",60,true,"Company6","Position6",5000.5,50.4,3);

		SaleManager seven = new SaleManager("name7",77,false,"Company7","Position7",2000,200000,30.0);
		SaleManager eight = new SaleManager("name8",77,false,"Company7","Position7",2000,200000,30.0);
		SaleManager nine = new SaleManager("name9",77,false,"Company7","Position7",2000,200000,30.0);
		SaleManager ten = new SaleManager("name10",77,false,"Company7","Position7",2000,200000,30.0);
		
		Employee[] employees = {one,two,tree,four,five,six,seven,eight,nine,ten};
		
		
		displayAllEmployees(employees);
		AllExpenses(employees);
		AllSales(employees);
	}
	public static void displayAllEmployees(Employee[] employees) {
		for (int j = 0; j < employees.length; j++) {
			if(employees[j] instanceof Manager) {
				Manager temp = (Manager) employees[j];
				temp.display();
			}
			if(employees[j] instanceof WageEmployee) {
				WageEmployee temp = (WageEmployee) employees[j];
				temp.display();
			}
			if(employees[j] instanceof SaleManager) {
				SaleManager temp = (SaleManager) employees[j];
				temp.display();
			}
			
		}
	}
	public static double AllExpenses(Employee[] employees) {
		double sumManager = 0;
		double sumWageEmployee = 0;
		double sumSaleManager = 0;
		for (int j = 0; j < employees.length; j++) {
			if(employees[j] instanceof Manager) {
				Manager temp = (Manager) employees[j];
				sumManager += temp.calculateSalary();
			}
			if(employees[j] instanceof WageEmployee) {
				WageEmployee temp = (WageEmployee) employees[j];
				sumWageEmployee += temp.calculateSalary();
			}
			if(employees[j] instanceof SaleManager) {
				SaleManager temp = (SaleManager) employees[j];
				sumSaleManager += temp.calculateSalary();
			}
	
	}
		System.out.println(sumManager + sumWageEmployee + sumSaleManager);
		return sumManager + sumWageEmployee + sumSaleManager;

	}
	public static double AllSales(Employee[] employees) {
		double sum = 0;
		for (int j = 0; j < employees.length; j++) {
			if(employees[j] instanceof SaleManager) {
				SaleManager temp = (SaleManager) employees[j];
				sum += temp.totalSales;
			}
	}
		System.out.println(sum);
		return sum;
	}
}
