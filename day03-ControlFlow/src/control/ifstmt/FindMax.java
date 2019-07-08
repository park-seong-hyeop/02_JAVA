package control.ifstmt;

import java.util.Scanner;

public class FindMax {

	public static void main(String[] args) {
		// 1.선언 : 입력받은 변수, 작은값을 저장할 변수
				int x;
				int y;
				int max = 0;
				Scanner scan; // ctrl + shift + o
				
				
				// 2. 초기화
				scan = new Scanner(System.in);
				
				// 입력을 알리는 안내 메시지가 필요
				System.out.println("두정수를 입력(space bar 로 분리)");
				// 스캐너 사용한 정수 입력(초기화)
				x = scan.nextInt();
				y = scan.nextInt();

				
				//3. 사용 : 입력된 두값을 비교(IF)
				if(x < y) {
					max = y;
				}
				
				if(y < x) {
					max = x;
				}
			   
				System.out.printf("입력된 두 값 x=%d, y=%d 중 큰 값은 %d%n", x, y, max);
				
				
				if (y == x) {
					max = x;
				}
				
		
				
			}

		}
