package telran.library.dto;

public class FictionBook extends LibBook {
	String genre = "no genre";

	public FictionBook(String author, String title, int nPages, int catNumber, String genre) {
		super(author, title, nPages, catNumber);
		setGenre(genre);
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		if(genre != null && genre.length() != 0)
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "FictionBook [genre=" + genre + ", toString()=" + super.toString() + "]";
	}
	
	
}
