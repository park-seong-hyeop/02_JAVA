package calc.result;

public class DoubleResultValueBean {
	
	/**
	 * 패키지 : calc.result
	 * 실수형 멤버변수 result 한 개를 갖는 
	 	* 클래스 DoubleResultValue 클래스를 자바빈즈 규격의 클래스로 작성
	 * **/

	// 1. 멤버변수 선언
	private Double result;
	
	
	// 2. 생성자 선언
	public DoubleResultValueBean() {
		
	}
	
	//get,set메소드
	public Double getResult() {
		return result;
	}

	public void setResult(Double result) {
		this.result = result;
	}
	
	@Override
	public String toString() {
		return "= [" + result + "]";
	}
}
