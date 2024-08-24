package telran.library.dto;

public class EducationBook extends LibBook {
	String subject = "no subject";

	public EducationBook(String author, String title, int nPages, int catNumber, String subject) {
		super(author, title, nPages, catNumber);
		setSubject(subject);
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		if(subject != null && subject.length() != 0)
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "EducationBook [catNumber=" + catNumber + ", author=" + author + ", title=" + title + ", nPages="
				+ nPages +  ", subject=" + subject + "]";
	}

	
	
	
	
}