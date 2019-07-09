package control.ifstmt;

import java.util.Scanner;

public class CalcBMI {

	public static void main(String[] args) {
		// 1.선언
		double weight;
		double height;
		double bmi;
		Scanner scan;

		// 2.초기화
		scan = new Scanner(System.in);
		weight = scan.nextDouble();
		height = scan.nextDouble();
		bmi = weight / height * height;
		System.out.printf("몸무게, 키를 입력하세요");
		// 3.사용
		if(bmi > 40) {
			System.out.printf("당신의 몸무게는 %d 이고 체중은 %d 이며%n 당신은 병적인 비만 입니다.",weight ,height, bmi);
	   } else if (bmi <= 40) {
			System.out.printf("당신의 몸무게는 %d 이고 체중은 %d 이며%n 당신은 비만 입니다.",weight ,height, bmi);
	   } else if (bmi <= 27.5) {
			System.out.printf("당신의 몸무게는 %d 이고 체중은 %d 이며%n 당신은 과체중 입니다.",weight ,height, bmi);
	   } else if (bmi < 23) {
			System.out.printf("당신의 몸무게는 %d 이고 체중은 %d 이며%n 당신은 정상 입니다.",weight ,height, bmi);
       } else if (bmi < 18.5) {
		System.out.printf("당신의 몸무게는 %d 이고 체중은 %d 이며%n 당신은 저체중 입니다.",weight ,height, bmi);
       } else {
    	   System.out.printf("당신의 몸무게는 %d 이고 체중은 %d 이며%n 당신은 병적인 저체중 입니다.",weight ,height, bmi);
       }

	}

}
