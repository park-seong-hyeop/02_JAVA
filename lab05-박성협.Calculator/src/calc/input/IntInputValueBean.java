package calc.input;

public class IntInputValueBean {

	/**
	 * 1.  패키지 : calc.input
     * 정수형 멤버변수 x, y 두 개를 갖는    
     * 클래스 IntInputValue 클래스를 자바빈즈 규격의 클래스로 작성
	 * */
	// 1. 멤버변수 선언
	private int x;
	private int y;
	
	// 2. 생성자 선언
	public IntInputValueBean() {
		
	}
	
	//get,set메소드
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
	

}
