package Book1;
/**
 * 책 한 권의 정보를 담는 클래스
 * ----------------------------
 * 일련번호  : sequence  : int
 * ISBN      : isbn      : String
 * 제목      : title     : String
 * 저자      : author    : String
 * 출판사    : company   : String
 * 페이지 수 : totalPage : int
 * 가격      : price     : int
 * 재고수량  : quantity  : int
 * ----------------------------
 * 생성자 중복정의
 * (기본생성자 명시, 매개변수 생성자 중복정의)
 * ----------------------------
 * 메소드 :
 * -- 기능 메소드 
 * void print() : 책의 정보를 출력하는 메소드
 * void buy(int amount)  : amount 만큼 책의 재고를 늘리는 메소드
 * void sell(int amount) : amount 만큼 책의 재고를 줄이는 메소드
 * 
 * -- 각 필드를 설정하는 메소드
 * -- 자바 빈즈(Java Beans) 규격에 의한 접근자/수정자 메소드
 * -- getter/setter
 * 
 * getter 작성시 메소드 이름 규격
 *  ==> get으로 시작하고 멤버변수필드의 첫글자를 대문자로 조합
 *      매개변수는 없음.
 *      리턴타입이 해당 멤버변수 필드의 타입과 맞춤
 * 
 * 예) sequence 필드의 getter 는 다음의 규격을 갖는다.
 * int getSequnece() {
 * 		return this.requence;
 * }
 * 
 * setter 작성시 메소드 이름 규격
 *  ==> set으로 시작하고 멤버변수 필드의 첫글자를 대문자로 조합
 *      매개변수는 해당 멤버변수 필드와 같은 타입과 변수로 받는다.
 *      리턴값이 없이 작성
 * void setSequence(int sequence) {
 *      this.sequcne = sequence;
 * }
 * 
 * 만약 멤버변수 필드가 boolean 타입이라면 getter의 이름은
 * get으로 시작하지 않고 is로 시작한다.
 * 
 * 
 * @author 304
 *
 */
public class Book {
	
	int sequence;
	String isbn;
	String title;
	String author;
	String company;
	int totalPage;
	int price;
	int quantity;
	
	Book() {
		
	}
	
	Book(int sequence) {
		this();
		setSequence(sequence);
	}
	
	Book(int sequence, String isbn) {
		this(sequence);
		setIsbn(isbn);
	}
	
	Book(int sequence, String isbn, String title) {
		this(sequence, isbn);
		this.title = title;
	}
	
	public Book(int sequence, String isbn, String title, String author, String company, int totalPage, int price, int quantity) {
		super();
		this.sequence = sequence;
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.company = company;
		this.totalPage = totalPage;
		this.price = price;
		this.quantity = quantity;
	}
	
	public int getSequence() {
		return sequence;
	}
	
	public void setSequence(int sequence) {
		this.sequence = sequence;
	}
	public String getIsbn() {
		return isbn;
	}
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
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

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public void print() {
		String message = "책정보[일련변호:%d, ISBN:%s, 제목:%s, 저자:%s, 출판사:%s, 페이지:%d, 가격:%d, 재고:%d]%n";
		
		System.out.printf(message, sequence, isbn, title, author, company, totalPage, price, quantity);
	}
	
	

}
