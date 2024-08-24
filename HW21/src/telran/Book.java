package telran;

public class Book {

	 String author;
	 int numberOfPages;
	
	public Book() {}

	public Book(String author, int numberOfPages) {
		super();
		this.setAuthor(author);
		this.setNumberOfPages(numberOfPages);
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		if(author != null && author.length()!=0)
			this.author = author;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		 if (numberOfPages >= 0)
		this.numberOfPages = numberOfPages;
	}

	@Override
	public String toString() {
		return "Book [author=" + author + ", numberOfPages=" + numberOfPages + ", toString()=" + super.toString() + "]";
	}
//
//	@Override
//	public String toString() {
//		return "Book [author=" + author + ", numberOfPages=" + numberOfPages + "]";
//	}
	
	
	
}
