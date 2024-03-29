package book.dao;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import book.vo.Book;

/**
 * Map 구조로 구현된 책장 클래스
 * 
 * key   : Book.sequence 필드로 사용
 * value : Book 인스턴스 자체
 * 
 * @author 304
 *
 */
public class MapBookShelf implements BookShelf {
	
	// 1. 멤버변수
	private Map<Integer, Book> books;

	// 2. 생성자
	// (1) 기본생성자
	public MapBookShelf() {
		books = new HashMap<>(); 
	}
	
	// (2) 매개변수 생성자
	public MapBookShelf(Map<Integer, Book> books) {
		this.books = books; 
	}
	
	@Override
	public int add(Book book) {
		int addCnt = 0;
		
		// 키가 존재하지 않는 경우만 신규 추가
		if (!isExists(book)) {
			books.put(book.getSequence(), book);
			addCnt++;
		}
		
		return addCnt;
	}

	@Override
	public int set(Book book) {
		int setCnt = 0;
		
		// 수정할 책의 키가 존재하는 경우만
		if (isExists(book)) {
			books.put(book.getSequence(), book);
			setCnt++;
		}
		
		return setCnt;
	}

	@Override
	public int remove(Book book) {
		int rmCnt = 0;
		
		// 수정할 책의 키가 존재하는 경우만
		if (isExists(book)) {
			books.remove(book.getSequence());
			rmCnt++;
		}
		
		return rmCnt;
	}

	@Override
	public Book get(Book book) {
		Book found = null;
		
		if (isExists(book))	{
			found = books.get(book.getSequence());
		}
		
		return found;
	}

	@Override
	public List<Book> getAllBooks() {
		// Map 에는 값들만 취해서 Collection 에 Generic 이
		// 적용된 형태로 만들어주는 valuse() 메소드가 있으므로
		// 그 메소드를 적용하여 Map 의 값들만 추출
		Collection<Book> collection = books.values();
		
		// Collection 인터페이스에는 컬렉션을 배열로 만들어주는
		// toArray() 메소드가 존재
		// 이 때, 매개변수로 만들 배열의 타입을 지정해서 넣어주면
		// Object[] 이 아닌 특정 타입의 배열로 리턴받을 수 있음.
		Book[] books = collection.toArray(new Book[] {});
		
		// 그렇게 만들어진 배열을 리스트로 변경
		return Arrays.asList(books);
	}
	
	// 필요시 private 메소드 추가
	/**
	 * Map 인터페이스가 가지고 있는 
	 * containsKey() 메소드를 사용하여
	 * 키를 넘기며 그 키가 있으면 true, 
	 * 아니면 false 를 리턴받아
	 * 키 존재 여부를 살피는 메소드
	 * 
	 * @param book
	 * @return
	 */
	private boolean isExists(Book book) {
		return books.containsKey(book.getSequence());
	}

}
