package control.ifstmt;

import java.util.Scanner;

public class CalcBMI {

	public static void main(String[] args) {
		double weight;
		double height;
		double bmi;
		String result;
		Scanner scan;

		scan = new Scanner(System.in);
		weight = scan.nextDouble();
		height = scan.nextDouble();
		bmi = weight / ((height /100) * (height /100));
		System.out.println("몸무게와 키를 입력하세요." + "(space bar로 분리)");
		
		if (bmi > 40.0)
		{
			result = "병적인 비만";
		}
		else if (bmi >= 27.5 && bmi < 40.0 )
		{
			result = "비만";
		}
		else if (bmi >= 23.0 && bmi < 27.5 )
		{
			result = "과체중";
		}
		else if (bmi >= 18.5 && bmi < 23.0 )
		{
			result = "정상";
		}
		else if (bmi >= 15.0 && bmi < 18.5 )
		{
			result = "저체중";
		}
		else
		{
			result = "병적인 저체중";
		}
		
		System.out.printf("몸무게 %.2fkg, 키 %.2fcm, bmi는 %.2f 당신은 %s 입니다.", weight, height, bmi, result);
	
	}

}



for (int idx = 0; idx < salaries.length; idx++) {
	System.out.printf("salaries[%d]=%d%n",idx , salaries[idx]);		