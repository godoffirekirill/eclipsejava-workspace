package telran.library;

import telran.library.dto.EducationBook;
import telran.library.dto.FictionBook;

public class TestBook {

	public static void main(String[] args) {
		
		EducationBook edBook1 = new EducationBook("author1", "Title1", 123, 123456, "subject1");
		EducationBook edBook2 = new EducationBook("author2", "Title2", 122, 123452, "subject2");
		EducationBook edBook3 = new EducationBook("author3", "Title3", 123, 123453, "subject3");

		FictionBook fBook1 = new FictionBook("author4", "Title4", 456, 789456, "genre1");
		FictionBook fBook2 = new FictionBook("author5", "Title5", 455, 789455, "genre5");
		FictionBook fBook3 = new FictionBook("author7", "Title7", 457, 789457, "genre7");
		
		System.out.println(edBook1);
		System.out.println(edBook2);
		System.out.println(edBook3);
		System.out.println(fBook1);
		System.out.println(fBook2);
		System.out.println(fBook3);
	}
	
} 
