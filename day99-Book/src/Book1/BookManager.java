package Book1;

/**
 * 책장(BookShelf)을 사용하는 북매니저를 나타내는 클래스
 * -----------------------------------------------------
 * 서점의 북매니저는 
 * 
 * 1. 책을 책장에 꼽거나(추가하거나)
 * 2. 책장에서 찾아달라고 부탁받은 책을 가지고 오거나
 * 3. 어떤 책의 수량이나 가격정보를 수정하거나
 * 4. 더 이상 판매하지 않을 책을 폐기 하고
 * 5. 이 서점에서 파는 책 목록안내 
 * 
 * 하는 등의 작업을 진행
 * -----------------------------------------------------
 * 전제 조건 : 북 매니저는 책장이 어디있는지, 무엇인지 
 *             알고 있어야 한다. 
 * -----------------------------------------------------
 * 
 * @author 304
 *
 */
public class BookManager {
	
	BookShelf bookShelf;
	
	BookManager() {
		bookShelf = new BookShelf();
	}
	
	BookManager(BookShelf bookshelf) {
		this.bookShelf = bookshelf;
	}
	
	public void add(Book book) {
		this.bookShelf.add(book);
	}
	
	public void remove(Book book) {
		this.bookShelf.remove(book);
	}
	
	public Book get(Book book) {
		return this.bookShelf.get(book);
	}
	
	public void set(Book book) {
		this.bookShelf.set(book);
	}
	
	public Book[] getAllBooks() {
		return bookShelf.getAllBooks();
	}
	
}
