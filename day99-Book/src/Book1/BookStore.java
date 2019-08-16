package Book1;

public class BookStore {
	
	BookManager manager;
	
	BookStore() {
		manager = new BookManager();
	}
	
	BookStore(BookManager manager) {
		this.manager = manager;
	}
	
	public void add(Book book) {
		manager.add(book);
	}
	
	public void remove(Book book) {
		manager.remove(book);
	}
	
	public void set(Book book) {
		manager.set(book);
	}
	
	public Book get(Book book) {
		return manager.get(book);
	}
	
	public Book[] getAllBooks() {
		return manager.getAllBooks();
	}

}
