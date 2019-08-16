package Book1;

public class BookStoreTest {

	public static void main(String[] args) {
		
		Book[] books = new Book[0];
		
		BookShelf bookShelf = new BookShelf(books);
		
		BookManager manager = new BookManager(bookShelf);
		
		BookStore kyobo = new BookStore(manager);
		
		System.out.println(" 1. ==== 신간 도착 책 생성 ====");
		Book vegetarian = new Book(1, "9788936433598", "채식주의자"
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
		
		System.out.println(" 2. ===== 신간 입고 =====");
		kyobo.add(vegetarian);
		kyobo.add(littlePrince);
		kyobo.add(noDaap);
		kyobo.add(dduk);
		kyobo.add(ax);
		
		System.out.println(" 3. ===== 신간 확인 =====");
		Book[] allBooks = kyobo.getAllBooks();
		for (Book book : allBooks) {
			book.print();
		}
		
		System.out.println(" 4. ===== 채식주의자 정보 변경 =====");
		
		Book vegetarian2 = 
				new Book(1, "9788936433598", "채식주의자"
						  , "한강", "창비", 247, 10000, 7);
		
		kyobo.set(vegetarian2);
		
		System.out.println(" 5. ===== 채식주의자 변경 확인 =====");
		
		Book seqBook = new Book(1);
		Book findBook = kyobo.get(seqBook);
		findBook.print();
		
		System.out.println(" 6. ===== 책은 도끼다 삭제 =====");
		
		Book rmBook = new Book(5);
		kyobo.remove(rmBook);
		
		System.out.println(" 7. ===== 책은 도끼다 삭제 후 전체 목록 확인 =====");
		for (Book book : kyobo.getAllBooks()) {
			book.print();
		}
	}

}