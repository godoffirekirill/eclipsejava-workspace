package telran;

public class Person {

	String name = "No name";
	int age = 1;
	boolean married = false;
	
	public Person() {}
	
	
	public Person(String name, int age, boolean married) {
		super();
		setName(name);
		setAge(age);
		setMarried(married);
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
		if(age > 1 && age <= 10000)
		this.age = age;
	}

	public boolean isMarried() {
		return married;
	}

	public void setMarried(boolean married) {
		this.married = married;
	}

	public void display() {
		System.out.printf("Person name is: %s, age: %d, married: %s \n", name, age, married);

	}
}
