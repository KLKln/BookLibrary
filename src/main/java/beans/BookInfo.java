package beans;

import javax.persistence.Embeddable;

@Embeddable
public class BookInfo {
	private int length;
	private String genre;
	private String publisher;
	
	public BookInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BookInfo(int length, String genre, String publisher) {
		super();
		this.length = length;
		this.genre = genre;
		this.publisher = publisher;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@Override
	public String toString() {
		return "BookInfo [length=" + length + ", genre=" + genre + ", publisher=" + publisher + "]";
	}

	

}
