package book.test;

import book.Book;
import book.BookManager;
import book.BookShelf;
import book.BookStore;

/**
 * 서점에서 할 수 있는 여러 기능들
 * 책찾기, 책수정, 신간추가, 책 폐기 
 * 등의 기능을 테스트하는 클래스
 * 
 * @author 304
 */
public class BookStoreTest {

	public static void main(String[] args) {
		
		// 1. 매니저에게 전달할 책장안에 들어갈 배열
		Book[] books = new Book[0];
		
		// 2. 배열로 구성되는 책장을 만든다.
		BookShelf bookShelf = new BookShelf(books);
		
		// 3. 배열로 구성된 책장을 관리할 매니저를 고용
		BookManager manager = new BookManager(bookShelf);
		
		// 4. 책장을 관리한 매니저와 함께 서점을 오픈 
		BookStore kyobo = new BookStore(manager);
		
		// --------------------------------------------
		// 1. 서점에 신간이 도착
		System.out.println(" 1. ===== 신간 도착 책 생성 =====");
		Book vegetarian = 
				new Book(1, "9788936433598", "채식주의자"
						  , "한강", "창비", 247, 10800, 10);
		
		Book littlePrince = 
				new Book(2, "9791159039690", "어린왕자(초판본)"
						  , "생텍쥐페리", "더스토리", 150, 8820, 5);
		
		Book noDaap = 
				new Book(3, "9791190182645", "제 인생에 답이 없어요"
						  , "선바", "위즈덤하우스", 192, 10800, 3);
		
		Book dduk = 
				new Book(4, "9791196394509", "죽고 싶지만 떡볶이는 먹고 싶어"
						  , "백세희", "흔", 208, 12420, 2); 
		
		Book ax = 
				new Book(5, "9788956055466", "책은 도끼다"
						  , "박웅현", "북하우스", 348, 14400, 2);
		
		
		// 2. 서점에 도착한 신간 입고
		System.out.println(" 2. ===== 신간 입고 =====");
		kyobo.add(vegetarian);
		kyobo.add(littlePrince);
		kyobo.add(noDaap);
		kyobo.add(dduk);
		kyobo.add(ax);
		
		// 3. 입고된 신간들 모두 확인
		System.out.println(" 3. ===== 신간 확인 =====");
		kyobo.getAllBooks();
		
		// 4. 채식주의자 가격할인:set
		System.out.println(" 4. ===== 채식주의자 정보 변경 =====");
		// (1) 가격할인된 채식주의자 책 정보를 새로 생성
		Book vegetarian2 = 
				new Book(1, "9788936433598", "채식주의자"
						  , "한강", "창비", 247, 10000, 7);
		
		// (2) 변경된 책 정보를 담은 책 객체를 넘겨서 수정처리
		kyobo.set(vegetarian2);
		
		// 5. 채식주의 가격 할인 적용 결과 확인:ㅠ
		System.out.println(" 5. ===== 채식주의자 변경 확인 =====");
		// (1) 해당 책의 시퀀스 번호만 알면 조회가능
		//     시퀀스 번호만 들어있는 Book 객체를 생성
		Book seqBook = new Book(1);
		kyobo.get(seqBook);
		
		// 6. 책은 도끼다 폐기:remove
		System.out.println(" 6. ===== 책은 도끼다 삭제 =====");
		// (1) 폐기할 책의 시퀀스 번호만 알면 폐기가능
		//     시퀀스 번호만 들어있는 Book 객체를 생성
		Book rmBook = new Book(5);
		kyobo.remove(rmBook);
		
		// 7. 폐기 확인을 위해 전체 목록 재 조회:getAllBooks
		System.out.println(" 7. ===== 책은 도끼다 삭제 후 전체 목록 확인 =====");
		kyobo.getAllBooks();
	}

}