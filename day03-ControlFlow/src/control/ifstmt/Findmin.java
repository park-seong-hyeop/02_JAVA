package control.ifstmt;

import java.util.Scanner;

public class Findmin {

	public static void main(String[] args) {

		//1.선언 : 입력 받을 변수, 작은 값을 저장할 변수
			int x;
			int y;
			int min = 0;
			Scanner scan;
			
			//2. 초기화
			scan = new Scanner(System.in);
			
			//입력을 알리는 안내 메시지
			System.out.println("두 정수를 입력(space bar로 분리");
			// 스케너 사용한 정수 입력(초기화)
			x = scan.nextInt();
			y = scan.nextInt();
			
			//3.사용 : 입력된 두 값을 비교(if)
			if(x < y) {
				min = x;
				System.out.printf("입력된 두 값 x=%d, y=%d 중 " + "작은 값은 %d%n", x, y, min); 
	}
			if (y < x) {
				min = y;
				System.out.printf("입력된 두 값 x=%d, y=%d 중" + "작은 값은 %d%n", x, y, min);		}
			if (x == y) {
				System.out.printf("입력된 두 값 x=%d, y=%d 이 동일합니다.%n", x, y);
			}
		
		}}