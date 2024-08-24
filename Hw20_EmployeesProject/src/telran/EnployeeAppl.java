package telran;

public class EnployeeAppl {

	public static void main(String[] args) {
		
		Employee[] emps = {
			new Employee("Roga", 10000., 2, "Shura", 12, 20), null,
			new Employee("Kopyta", 15000., 7, "Ostap", 1, 28),
			new Employee("Roga", 10000., 2, "Panikovsky", 13, 65),
			new Employee("Roga", 8000., 1, "Kozlevich", 7, 32),
			new Employee("Kopyta", 20000., 5, "Funt", 2, 65),
		};
			printNetto(emps);
			printBrutto(emps);
			printEmployees(emps);
			printTotalEmpSalary(emps);
	}

	public static void printTotalEmpSalary(Employee[] emps) {
		if(emps == null)
			return;
		double total = 0;
		for (int i = 0; i < emps.length; i++) {
			if(emps[i] != null)
			
		total += emps[i].salary();
		}
		System.out.println("Total salary is: " + total);
	}

	private static void printEmployees(Employee[] emps) {
		if(emps == null)
			return;
		for (int i = 0; i < emps.length; i++) {
			if(emps[i] != null)
		System.out.println(emps[i].display());	
		}
	}

	private static void printBrutto(Employee[] emps) {
		if(emps == null)
			return;
		for (int i = 0; i < emps.length; i++) {
			if(emps[i] != null)
			System.out.println(emps[i].display(false)); 
		}
	}

	public static void printNetto(Employee[] emps) {
		if(emps == null)
			return;
		for (int i = 0; i < emps.length; i++) {
			if(emps[i] != null)
			 System.out.println(emps[i].display(true)); 
		}
		
	}

}
