package control.ifstmt;

import java.util.Scanner;

/**
 * 
 * 하나의 정수를 입력받아서
 * 음수인지, 양수인지 판단하는 클래스
 * 
 * 단, 여기서는 0에 대한 판단은 하지않는다.
 * 
 * 입력받은 변수 input을 선언하여 Scanner로 입력받고
 * if ~ elsa 구문으로 부호를 반별한 후 
 * 판별 결과를 저장하는 변수 String result에 저장하여
 * 
 * "입력값 100은 양수입니다"혹은"입력값 -1은 음수입니다"라는 문장을 출력하시오
 * @author Administrator
 *
 */
public class PositiveNegative {

	public static void main(String[] args) {
		// 1.선언
		int input;
		String result;
		Scanner scan;
		
		//2.초기화
		scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요 단 0 제외");
		input = scan.nextInt();
		//3. 사용
		if (input > 0) {
			result = "양수";
		}else {
			result = "음수"; 
		}
		System.out.printf("입력값 %은(는) %s 입니다.", input,result);
		System.out.println("입력값" + input + "은(는)" + result + "입니다.");

	}

}
