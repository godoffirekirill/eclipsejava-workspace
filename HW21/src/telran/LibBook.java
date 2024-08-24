package telran;

public class LibBook extends Book{

	 int catNumber;

	public LibBook(String author, int numberOfPages, int catNumber) {
		super(author, numberOfPages);
		this.setCatNumber(catNumber);
	}

	public int getCatNumber() {
		return catNumber;
	}

	public void setCatNumber(int catNumber) {
		 if (numberOfPages >= 0)
		this.catNumber = catNumber;
	}

	@Override
	public String toString() {
		return "LibBook [catNumber=" + catNumber + ", author=" + author + ", numberOfPages=" + numberOfPages + "]";
	}



	
	
}
