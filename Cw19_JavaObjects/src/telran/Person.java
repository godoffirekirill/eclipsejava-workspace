package telran;

public class Person {
	private String name;
	private int age;
	private int telNumber;
	
	public Person(String name1, int telNumber1, int age1) {
		if(name1 != null)
		setName(name1);
		else name = "Anonimous";
		if(age1 >= 18 && age1 <=120)
		age = age1;
		else age = 0;
		 if(telNumber1> 100_000_000 && telNumber1 <=999_999_999)
		telNumber = telNumber1;		
	}
	
	public Person() {

	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getTelNumber() {
		return telNumber;
	}
	
	public void setAge(int newAge) {
		if(newAge >= 18 && newAge <=120)
			age = newAge;
	}
	 public void setTelNumber(int newTelNum) {
		 if(newTelNum > 100_000_000 && newTelNum <=999_999_999)
			 telNumber = newTelNum;
	 }
	
	public void display() {
		System.out.printf("Hello! My name is %s, age: %d, tel number: %d\n", name, age, telNumber);
	}

	public void setName(String newName) {
		if(newName != null)
		name = newName;
	}
}
