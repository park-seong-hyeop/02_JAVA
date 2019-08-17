package calc.result;

public class IntResultValueBean {
	
	/**
	 * 3.  패키지 : calc.result
	 * 정수형 멤버변수 result 한 개를 갖는 
	 * 클래스 IntResultValue 클래스를 자바빈즈 규격의 클래스로 작성
	 * **/
	
	// 1. 멤버변수 선언
	private int result;
	
	
	// 2. 생성자 선언
	public IntResultValueBean() {
		
	}
	
	//get,set메소드
	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}
	
	@Override
	public String toString() {
		return "= [" + result + "]";
	}

}
