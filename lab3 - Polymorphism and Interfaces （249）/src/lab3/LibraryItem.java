package lab3;

public abstract class LibraryItem {
	
	private String title;
	private String author;
	
	public LibraryItem(String title, String author) {
		this.author = author;
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public abstract String getDetails();

	@Override
	public String toString() {
		return "LibraryItem{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
	}
	
	

}
