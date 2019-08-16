package calc;

/**
 * 덧셈결과:133
 * 뺄셈결과:67
 * 곱셈결과:3300
 * 나눗셈결과:3
 *
 * @author 304
 *
 */
public class CalcTest {

	public static void main(String[] args) {

		// TODO 1 : IntInput 타입 변수 input 선언 및 기본 생성자로 초기화
		IntInput intput = new IntInput(); 
		// TODO 2 : 1에서 생성한 input 객체에 x=100, y=33 값 설정
		intput.setX(100);
		intput.setY(33);
		
		// TODO 3 : Calculator 타입 변수 calc 선언 및 기본생성자로 초기화 
		Calculator calc = new Calculator();
		// TODO 4.1 int 타입의 변수 addResult 에 
		//          Calculator 클래스의 add 메소드 호출결과 저장
		int addResult = calc.add(intput);
		// TODO 4.2 int 타입의 변수 subResult 에 
		//          Calculator 클래스의 add 메소드 호출결과 저장
		int subResult = calc.subtract(intput);
		// TODO 4.3 int 타입의 변수 multResult 에 
		//          Calculator 클래스의 add 메소드 호출결과 저장
		int multResult = calc.multiply(intput);
		// TODO 4.4 int 타입의 변수 divResult 에 
		//          Calculator 클래스의 add 메소드 호출결과 저장
		int divResult = calc.divide(intput);
		// 5 : 아래의 출력문 실행
		System.out.println("덧셈결과:" + addResult);
		System.out.println("뺄셈결과:" + subResult);
		System.out.println("곱셈결과:" + multResult);
		System.out.println("나눗셈결과:" + divResult);
		
	
	
	}

}
