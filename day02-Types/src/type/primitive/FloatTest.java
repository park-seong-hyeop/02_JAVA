package type.primitive;
/**
 * float, duble : 실수형(소주점 표현가능) 데이터를
 *                표현, 저장할수 있는 타입
 *-------------------------------------------
 * float 타입의 변수에 값을 할당할때는 
 * 값의 뒤에 대문자 F, 소문자 f를 접미사로 붙인다.
 * 
 * 
 * @author Administrator
 *
 */
public class FloatTest {

	public static void main(String[] args) {
		// 1. 선언
		float pi1;
		double pi2;
		
		// 2.초기화
		pi1 = 3.14F;
		pi2 = 3.14;
		
		// 3.사용 : 변수 값 출력
		System.out.println("float pi=" + pi1);
		System.out.println("double pi=" + pi2);
		System.out.println("================================");
		
		pi1 = 3.141592653589793238462643383279502884197169399375F;
		pi2 = 3.141592653589793238462643383279502884197169399375;
		System.out.println("float pi=" + pi1);
		System.out.println("double pi=" + pi2);

		
	}

}
