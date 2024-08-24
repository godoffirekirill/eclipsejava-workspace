package telran.library;

import telran.library.dto.*;


public class TestBook {

	public static void main(String[] args) {
		
		byte b = 123;
		int i = b;
		
		int n = 345356;
		double d = n;
		
		double pi = 3.14;
		float f = (float) pi;
		
		Book book = new FictionBook("a1", "t1", 2, 456788, "g");
		Book book1 = new LibBook();
		
		EducationBook edBook1 = new EducationBook("author1", "Title1", 123, 123456, "subject1");
		EducationBook edBook2 = new EducationBook("author2", "Title2", 122, 123452, "subject2");
		EducationBook edBook3 = new EducationBook("author3", "Title3", 123, 123453, "subject3");

		FictionBook fBook1 = new FictionBook("author4", "Title4", 456, 789456, "genre1");
		FictionBook fBook2 = new FictionBook("author5", "Title5", 455, 789455, "genre5");
		FictionBook fBook3 = new FictionBook("author7", "Title7", 457, 789457, "genre7");
		
//		System.out.println(edBook1);
//		System.out.println(edBook2);
//		System.out.println(edBook3);
//		System.out.println(fBook1);
//		System.out.println(fBook2);
//		System.out.println(fBook3);
		
		Book[] books = {edBook1, edBook2, edBook3, fBook1, fBook2, fBook3};
		for (int j = 0; j < books.length; j++) {
			System.out.println(books[j].toString());
		}
		LibBook lg = (LibBook) books[0];
		System.out.println(lg.getCatNumber());
		
		FictionBook fb = (FictionBook) books[3];
		fb.getGenre();
		
		boolean res = books[0] instanceof EducationBook;
		
		res = books[5] instanceof EducationBook;
		System.out.println(res);
		
		for (int j = 0; j < books.length; j++) {
			if(books[j] instanceof FictionBook) {
				FictionBook temp = (FictionBook) books[j];
				System.out.println(temp.getGenre());
			}
		}
		
		for (int j = 0; j < books.length; j++) {
			if(books[j] instanceof LibBook) {
				LibBook temp = (LibBook) books[j];
				System.out.println(temp.getCatNumber());
			}
		}
		
	}
	
}
