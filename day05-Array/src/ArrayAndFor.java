import java.util.Scanner;

public class ArrayAndFor {
/**
 * 10칸 짜리  int 배열 number 를 선언,생성(0초기화) 한 후
 * 각 원소의 값을 0번 인덱스부터 9번 인덱스까지
 * 10, 20, 30, ... 100까지 저장 한다.
 * 
 * 배열에 저장된 원소의 합을 int summary; 변수에 누정하여
 * 출력하시오.
 *  
 * @param args
 */
	public static void main(String[] args) {
		// 1. 선언
		int[] number;
		int summery;
		
		// 2. 초기화
		number = new int[10];
		
		//3. 값 저장
		for (int idx = 0; idx < numbers.length; idx++) {
			numbers[idx] = (idx + 1) * 10;
			summery += number[idx];
		}
		// 4. 합산 출력
		System.out.printf("원소의 합 : %d%n", summary);
		

	}

}
