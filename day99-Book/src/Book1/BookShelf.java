package Book1;

/**
 * Book 여러개가 꼽혀있어
 * 책 객체 여러개를 한번에 저장하고 
 * 관리할 수 있는 클래스
 * 
 * @author 304
 *
 */
public class BookShelf {
	
	Book[] books;
	
	BookShelf() {
		books = new Book[0];
	}
	
	BookShelf(Book[] books) {
		this.books = books;
	}
	
	public void add(Book book) {
		Book[] newBooks = new Book[books.length + 1];
		
		for (int idx = 0; idx < books.length; idx++) {
			newBooks[idx] = books[idx];
		}
		
		newBooks[newBooks.length - 1] = book;
		
		this.books = newBooks;
	}
	
	public void remove(Book book) {
		Book[] newBooks;
		
		int index = findBookIndex(book);
		
		if (index > -1) {
			newBooks = new Book[books.length - 1];
			
			for (int idx = 0; idx < index; idx++) {
				newBooks[idx] = books[idx];
			}
			
			for (int idx = index; idx < newBooks.length; idx++) {
				newBooks[idx] = books[idx + 1];
			}
			
			this.books = newBooks;
		}
	}
	
	public void set(Book book) {
		
		int index = findBookIndex(book);
		
		if (index > -1) {
			books[index] = book;
		}
	}
	
	public Book get(Book book) {
		return findBook(book);
	}
	
	public Book[] getAllBooks() {
		return this.books;
	}
	
	private Book findBook(Book book) {
		Book findBook = null;
		for (int idx = 0; idx < books.length; idx++) {
			if (books[idx].getSequence() == book.getSequence()) {
				findBook = books[idx];
				break;
			}
		}
		
		return findBook;
	}
	
	private int findBookIndex(Book book) {
		int index = -1;
		for (int idx = 0; idx < books.length; idx++) {
			if (books[idx].getSequence() == book.getSequence()) {
				index = idx;
				break;
			}
		}
		return index;
	}
	
	public Book[] getBook() {
		return books;
	}
	
	public void setBooks(Book[] books) {
		this.books = books;
	}

}
