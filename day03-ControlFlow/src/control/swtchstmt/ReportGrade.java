package control.swtchstmt;

import java.util.Scanner;

/**
 * 다중 선택 if 구문 사용하여
 * 다음의 가준으로 학점을 계산 하는 클래스
 * switch 구문 사용
 * ---------------------------
 * A : 90점 이상
 * B : 80 ~ 89점
 * C : 60 ~ 79점
 * D : 40 ~ 59점
 * F : 이하 나머지
 * ------------------------------
 * printf 로 출력
 * @author Administrator
 *
 */
public class ReportGrade {

	public static void main(String[] args) {
				// 1.선언
				int score;
				char grade;
				Scanner scan;
				// 2.초기화
				scan = new Scanner(System.in);
				System.out.println("0~100 사이의 점수를 입력.");
				score = scan.nextInt();
				// 3.switch 에서 학점 판별
				 switch (score / 10) {
				 case 10 : case 9 : 
					 grade = 'A';
					 break;
				 case 8 :
					 grade = 'B';
					 break;
				 case 7 : case 6 :
					 grade = 'C';
					 break;
				 case 5 : case 4 :
					 grade = 'D';
					 break;
				 default :
					 grade = 'F';
					 break;

				 }
					 System.out.printf("점수는 : %d, 학점 : %c%n", score, grade);
				 
			}

		}
