
public class Book {

	private String name;
	private int time;

	public Book(String title, int year) {
		this.name = title;
		this.time = year;
	}

	public String getTitle() {
		return this.name;
	}

	public int getAge() {
		return this.time;
	}

	public void addSequel() {
		this.name = this.name + ": The Sequel";

	}
	
}