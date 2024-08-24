package telran;

public class FictionBook extends LibBook{

	 String genre;

	public FictionBook(String author, int numberOfPages, int catNumber, String genre) {
		super(author, numberOfPages, catNumber);
		this.setGenre(genre);
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		if(genre != null && genre.length()!=0)
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "FictionBook [genre=" + genre + ", catNumber=" + catNumber + ", author=" + author + ", numberOfPages="
				+ numberOfPages + "]";
	}



	
	
}
