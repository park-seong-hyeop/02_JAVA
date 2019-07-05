package type.primitive;
/**
 * bite : 1bite에 해당하는 범위만큼
 *        정수를 저장하느 타입
 * --------------------------------------
 * 8bit = 2의 제곱
 *      = 256
 *      = 256개의 숫자를 표현 가능
 *      = -128 ~ 0 ~ 127 까지 표현 가능
 * -----------------------------------------      
 * @author Administrator
 *
 */
public class ByreTest {

	public static void main(String[] args) {
		// 1. 선언
		Byte buffer;
		
		// 2. 초기화
		buffer = 0;
		
		// 3.tkdyd
		System.out.println("buffer=" + buffer);
		
		// 4. 값을 변경
		buffer = 127;
		System.out.println("buffer=" + buffer);
		
		buffer = -128;
		System.out.println("buffer=" + buffer);
		
		// 6. 값의 범위를 벗어나는 값을 저장하려고 시도
		buffer = 128; // 
		

	}

}
