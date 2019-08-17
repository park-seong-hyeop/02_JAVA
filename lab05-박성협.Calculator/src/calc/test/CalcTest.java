package calc.test;

import calc.input.DoubleInputValueBean;
import calc.input.IntInputValueBean;

public class CalcTest {

	public static void main(String[] args) {
		
		// 선언 및 기본 생성자로 초기화
		IntInputValueBean intput2 = new IntInputValueBean(); 
		DoubleInputValueBean intput3 = new DoubleInputValueBean();
		Calculator calc = new Calculator();
	
		//값 설정
		intput2.setX(100);
		intput2.setY(10);
		intput3.setX(5);
		intput3.setY(0.2);
		
		
		// 연산
		calc.add(intput2);
	
		calc.sub(intput2);

		calc.mult(intput2);
		
		calc.div(intput2);
		
		calc.mod(intput2);
		
		calc.add(intput3);
		
		calc.sub(intput3);

		calc.mult(intput3);
		
		calc.div(intput3);
		
		calc.mod(intput3);
		
		//  출력문 실행
		System.out.println("====정수 연산====");
		System.out.println("덧셈 연산" + calc.add(intput2));
		System.out.println("뺄셈 연산" + calc.sub(intput2));
		System.out.println("곱셈 연산" + calc.mult(intput2));
		System.out.println("나눗셈 연산" + calc.div(intput2));
		System.out.println("나머지 연산" + calc.mod(intput2));
		
		System.out.println("====실수 연산====");
		System.out.println("덧셈 연산" + calc.add(intput3));
		System.out.println("뺄셈 연산" + calc.sub(intput3));
		System.out.println("곱셈 연산" + calc.mult(intput3));
		System.out.println("나눗셈 연산" + calc.div(intput3));
		System.out.println("나머지 연산" + calc.mod(intput3));
		
	}

}
