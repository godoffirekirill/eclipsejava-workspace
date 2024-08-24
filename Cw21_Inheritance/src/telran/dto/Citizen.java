package telran.dto;

public class Citizen extends Person{
	int id;

	public Citizen(String name, int age, int id) {
		super(name, age);
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Citizen [id=" + id + ", name=" + name + ", age=" + super.getAge() + "]";
	}
	
	
}
