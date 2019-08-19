package calc.input;

public class DoubleInputValueBean {

	/**
	 * 2.  패키지 : calc.input
	 * 실수형 멤버변수 x, y 두 개를 갖는 
   	 * 클래스 DoubleInputValue 클래스를 자바빈즈 규격의 클래스로 작성
   	 * 
   	 * 자바빈즈 
	 * */
	// 1. 멤버변수 선언
	private double x;
	private double y;  
	
	// 2. 생성자 선언
	public DoubleInputValueBean() {
		
	}
	
	//get,set메소드
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}

}
