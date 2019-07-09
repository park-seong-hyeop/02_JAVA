package control.loop;

public class SumOfEvens {

	public static void main(String[] args) {
	int num = 2, sum = 0;
		
		while (num <= 100) {
			sum += num;
			num += 2;
		}
		System.out.printf("1부터 100사이 짝수의 합은 %d입니다. %n", sum);
		
	}

}
