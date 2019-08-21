package loop;

import java.util.Scanner;

/**
 * 3! 과 같은 수학의 펙토리얼을 계산하는 클래스
 * @author Administrator
 *
 */
public class Factorial2 {
	
	// +factorial(int n) : int
	public int factorial (int num) {
		//멤버변수
		int result = 1;
		
		//로직
		for (int idx = 1; idx <= num; idx++) {
			result *= idx;
		}
		
		//리턴
		return result;
		
	}
	
}	
