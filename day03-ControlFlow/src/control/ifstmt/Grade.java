package control.ifstmt;

import java.util.Scanner;

/**
 * 다중선택 if 구문 사용하여 다음의 기준으로
 * 학점을 계산하는 클래스
 * ---------------------------
 * A : 90점 이상
 * B : 80 ~ 89점
 * C : 60 ~ 79점
 * D : 40 ~ 59점
 * F : 이하 나머지
 * ------------------------------
 * printf 로 출력
 * 
 * @author Administrator
 *
 */
public class Grade {

	public static void main(String[] args) {
		// 1.선언
		int score;
		char grade;
		Scanner scan;
		// 2.초기화
		scan = new Scanner(System.in);
		System.out.println("0~100 사이의 점수를 입력.");
		score = scan.nextInt();
		// 3.사용
		 if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B'; 
		} else if (score >= 60) {
			grade = 'C'; 
		} else if (score >= 40) {
			grade = 'D'; 
		}else {	 
			grade = 'F';
		}
		 System.out.printf("입력하신 %d점은 %c 학점 입니다.%n", score, grade );

	}

}
