package calc.test;

import calc.input.DoubleInputValueBean;
import calc.input.IntInputValueBean;
import calc.result.DoubleResultValueBean;
import calc.result.IntResultValueBean;

public class Calculator {
	
	/**
	 * 5.  패키지 : calc
	 * IntInputValue, DoubleInputValue 를 각각 
	 * 입력받아 각 클래스 인스턴스의 멤버변수 값을 사용하여 
	 * 사칙연산과 나머지 연산을 수행하는 
	 * add, sub, mult, div, mod(나머지 연산) 메소드가 중복정의된 
	 * 클래스 Calculator 를 작성
	 * **/
	
	IntResultValueBean input2 = new IntResultValueBean();
	DoubleResultValueBean input3 = new DoubleResultValueBean();
	
	
	public IntResultValueBean add(IntInputValueBean input) {
		input2.setResult(input.getX() + input.getY());
		return input2;
		
	}
	
	public DoubleResultValueBean add(DoubleInputValueBean input) {
		input3.setResult(input.getX() + input.getY());
		return input3;
	}

	public IntResultValueBean sub(IntInputValueBean input) {
		input2.setResult(input.getX() - input.getY());
		return input2;
		
	}
	
	public DoubleResultValueBean sub(DoubleInputValueBean input) {
		input3.setResult(input.getX() + input.getY());
		return input3;
	}

	public IntResultValueBean mult(IntInputValueBean input) {
		input2.setResult(input.getX() * input.getY());
		return input2;
		
	}
	
	public DoubleResultValueBean mult(DoubleInputValueBean input) {
		input3.setResult(input.getX() * input.getY());
		return input3;
	}
	
	public IntResultValueBean div(IntInputValueBean input) {
		input2.setResult(input.getX() / input.getY());
		return input2;
		
	}
	
	public DoubleResultValueBean div(DoubleInputValueBean input) {
		input3.setResult(input.getX() / input.getY());
		return input3;
	}

	public IntResultValueBean mod(IntInputValueBean input) {
		input2.setResult(input.getX() % input.getY());
		return input2;
		
	}
	
	public DoubleResultValueBean mod(DoubleInputValueBean input) {
		input3.setResult(input.getX() % input.getY());
		return input3;
	}

}
