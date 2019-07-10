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
		
		for (int idx = 0; idx < salaries.length; idx++) {
			System.out.printf("salaries[%d]=%d%n",idx , salaries[idx]);		
		}
		System.out.println("==for loop 로 입력==");
		Scanner scan = new Scanner(System.in);
		for (int idx = 0; idx < salaries.length; idx++) {
			System.out.prinln("정수를 입력하세요");
			salaries[idx] = scan.nextInt();
			
			System.out.printf("salaries[%d]=%d%n", idx, salaries[idx]);
			
		}

	}

}
