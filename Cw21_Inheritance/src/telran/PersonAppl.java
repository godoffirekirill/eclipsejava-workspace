package telran;

import telran.dto.BankClient;
import telran.dto.Citizen;
import telran.dto.Person;

public class PersonAppl {

	public static void main(String[] args) {
		
		Person pers = new Person("Vasya", 40);
		Citizen isr = new Citizen("Moshe", 25, 30258745);
		BankClient donald = new BankClient(25000);
		System.out.println(pers.getName());
		System.out.println(pers.toString());
		System.out.println(isr);
		System.out.println(donald);
		
		Person[] p = {pers, isr, donald};
		for (int i = 0; i < p.length; i++) {
			System.out.println(p[i]);
		}
	}

}
