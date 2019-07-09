package control.ifstmt;

import java.util.Scanner;

/**
 *  입력된 정수에 대해서 2의 배수인지 판별하는 클래스
 *  
 *  입력된 정수를 input 변수에 저장하고
 *  입력된 값이 2의 배수인지 판단하는 조건을 작성하시오
 *  
 *  -(1)-------------------------------------------------------
 *  2의 배수 일때 : "입력값 4 은(는) 2의 배수입니다.
 *  2의 배수가 아닐때 : "입력값 5은(는) 2의 배수가 아닙니다.
 *  -(2)-------------------------------------------------------
 *  나머지는 int mod에 저장하여 사용하시오.
 *  
 *  2의 배수일때 : "입력값 4은(는) 2의 배수입니다.
 *  2의 배수가 아닐때 :
 *    "입력값 5은(는) 2의 배수가 아닙니다."
 *    "나머지가 1입니다."
 *  ------------------------------------------------------------
 * @author Administrator
 *
 */
public class MultipleOfTwo {

	public static void main(String[] args) {
		// 1.선언
		int input;
		int mod;
		String result;
		Scanner scan;
		//2.초기화
		scan = new Scanner(System.in);
		System.out.println("입력값을 입력하세여");
		input = scan.nextInt();
		//3. 사용
		System.out.println("===== (1) =====");
		if (input % 2 == 0) { 
			// 위의 () 안의 연산은 연산자 우선순위에 의해 
			// input % 2 의 연산이 먼저 수행되고 난뒤
			// 그 결과가 0과 같은지 == 연산산이 수행됩니다.
			result = "배수입니다.";
		} else {
			result = "배수가 아닙니다.";
		}
		System.out.printf("입력값 %d (은)는 2의 %s%n", input, result);
		// (2) ---------------------------------------------
		System.out.println("===== (2) =====");
		mod = input % 2; 
		if (input % 2 == 0) { 
			// "input % 2 == 0" 여기에 연산자가 2개 들어가있음  : %, ==
			// 위의 () 안의 연산은 연산자 우선순위에 의해 
			// input % 2 의 연산이 먼저 수행되고 난뒤
			// 그 결과가 0과 같은지 == 연산산이 수행됩니다.
			System.out.printf("입력값 %d (은)는 2의 %s%n", input, result); 
		} else { 
			System.out.printf("입력값 %d (은)는 2의 %s%n", input, result);
			System.out.printf("나머지가 %d 입니다.", mod);
		}
		// 사용한 scan 객체 닫기
		scan.close();
	}

}
