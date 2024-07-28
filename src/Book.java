
public class Book {
	private String name;
	private String author;
	private boolean format;
	private int pages;
	private Review review;
	
	public Book(String name, String author, int pages) {
		this.name = name;
		this.author = author;
		this.pages = pages;
		this.format = true;
		this.review = new Review();
	}
	
	public Review getReview() {
		return this.review;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getAuthor() {
		return this.author;
	}
	
	public int getPageCount() {
		return this.pages;
	}
	
	public void isPaperback() {
		if (this.format) {
			System.out.println("Paperback");
		} else {
			System.out.println("Digital");
		}
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void setPageCount(int pages) {
		this.pages = pages;
	}
	
	public void setPaperback(boolean format) {
		this.format = format;
	}
	
	public String toString() {
		return this.name + ": " + this.author + ": " + this.pages +" pages";
	}

}
