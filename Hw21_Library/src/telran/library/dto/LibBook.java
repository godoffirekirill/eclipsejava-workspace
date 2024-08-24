package telran.library.dto;

public class LibBook extends Book {
	int catNumber;


//	public LibBook(int catNumber) {
//	super();
//	this.catNumber = catNumber;
//}

	public LibBook(String author, String title, int nPages, int catNumber) {
		super(author, title, nPages);
		setCatNumber(catNumber);
	}
	
	public LibBook() {
	}

	public int getCatNumber() {
		return catNumber;
	}
	//00001
	// "000001"
	public void setCatNumber(int catNumber) {
		if (catNumber >= 100_000 && catNumber <= 999_999)
			this.catNumber = catNumber;
	}

	@Override
	public String toString() {
		return "LibBook [catNumber=" + catNumber + ", Author:" + getAuthor() + ", getTitle()=" + getTitle()
				+ ", getnPages()=" + getnPages() + "]";
	}
	
	
}
