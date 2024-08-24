package telran;

public class EducationBook extends LibBook{

	 String subject;

	public EducationBook(String author, int numberOfPages, int catNumber, String subject) {
		super(author, numberOfPages, catNumber);
		this.setSubject(subject);
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		if(subject != null && subject.length()!=0)
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "EducationBook [subject=" + subject + ", catNumber=" + catNumber + ", author=" + author
				+ ", numberOfPages=" + numberOfPages + "]";
	}

	
	
	
}
