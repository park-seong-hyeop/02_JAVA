package loop;

import java.util.Scanner;

public class Factorial2Test {

	public static void main(String[] args) {
		//선언
		int num;
		int facnum;
		
		//초기화
		Factorial2 factorial2 = new Factorial2();
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
//		facnum = factorial2.factorial2(num);
		facnum = factorial2.factorial(num);
		
		// 양의 정수 입력		
		System.out.println("양의 정수를 입력하세요.");
		
		// 결과값 출력
		System.out.printf("양의 정수는 %d이고, Factorial은 %d 입니다", num, facnum);
		

 	}

}
