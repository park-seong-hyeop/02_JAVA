package book;

import java.util.List;
import java.util.Map;

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
	
	// (2) 매개변수 생성자
	
	
	@Override
	public int add(Book book) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int set(Book book) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int remove(Book book) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Book get(Book book) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return null;
	}
	
	// 필요시 private 메소드 추가

}