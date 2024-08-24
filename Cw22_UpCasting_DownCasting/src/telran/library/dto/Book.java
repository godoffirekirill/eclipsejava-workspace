package telran.library.dto;


public class Book {
	
	String author;
	String title = "No title";
	int nPages;
	
	public Book() {}
	
	public Book(String author, String title, int nPages) {
		super();
		if(author != null && author.length()!=0)
		this.author = author;
		else this.author = "No  author";
		
		//this.author = (author != null && author.length()!=0)? author : "No author";
		
		setTitle(title);
		
		setnPages(nPages);
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		if(author != null && author.length()!=0)
			this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		if(title != null && title.length() != 0)
		this.title = title;
	}

	public int getnPages() {
		return nPages;
	}

	public void setnPages(int nPages) {
		if(nPages > 1 && nPages <= 10000)
		this.nPages = nPages;
	}

	@Override
	public String toString() {
		return "Book [author=" + author + ", title=" + title + ", nPages=" + nPages + "]";
	}
	
	
}
