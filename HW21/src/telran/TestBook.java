package telran;

public class TestBook {

	public static void main(String[] args) {
		
		FictionBook[] fBook = { new FictionBook("Tolstoy", 900, 10, "Horor"),
								new FictionBook("Olegov", 100, 76, "Comedy"),
								new FictionBook("Spatnov", 999, 65, "Shoter"),
								new FictionBook("Ivanov", 333, 65, "Scuter"),
								new FictionBook("Ololo", 555, 34, "Slipknot"),
								new FictionBook("Frank", 555, 33, "Korn")
				
		};
		EducationBook[] eBook = { new EducationBook("Stalker", 555, 33, "English"),
								new EducationBook("NFS", 555, 33, "Math"),
								new EducationBook("Resident", 555, 33, "Prog"),
								new EducationBook("Left 4 death", 555, 33, "Crazy"),
								new EducationBook("Doom", 555, 33, "Lol"),
								new EducationBook("Far cry", 555, 33, "Joke")
				
		};
		

		
		for (int i = 0; i < fBook.length; i++) {
			System.out.println(fBook[i]);

		} 
		for (int i = 0; i < eBook.length; i++) {
			System.out.println(eBook[i]);

		} 
	}

}
