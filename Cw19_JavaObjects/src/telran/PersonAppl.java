package telran;

public class PersonAppl {

	public static void main(String[] args) {
		
	//	String str = "Hello";
		Person pers = new Person();
		System.out.println(pers.getName());
		System.out.println(pers.getTelNumber());
		System.out.println(pers.getAge());
		
		pers.setName("Vasya");
		pers.setAge(30);
		pers.setTelNumber(529998855);
		System.out.println(pers.getName());
		pers.display();
		
		Person pers1 = new Person("Masha", 538887744, 25);
		pers1.display();
		pers.setAge(100500);
		pers.display();
		Person pers2 = new Person("Moshe", -1233, -56);
		pers2.display();
		
//		int[]arr = {1,2,3,4,5};
		Person[]perss = {pers1, pers, pers2};
		for (int i = 0; i < perss.length; i++) {
			perss[i].display();
		}
	}

}
