package control.loop;
/**
 * 0 ~10 까지 출력하느 ㄴ클래스
 * 
 * while 구문을 사용해서 
 * 반복 출력을 수현 한다.
 * 
 * @author Administrator
 *
 */
public class PrintToTen {

	public static void main(String[] args) {
		// 1.선언, 2.초기화
		int number = 0;
		
		//3.반복구문
		while(number <= 10) {
			System.out.printf("number=%d%n", number++);
			 
		
		}

	}

}
