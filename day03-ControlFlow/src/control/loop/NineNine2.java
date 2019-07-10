package control.loop;

public class NineNine2 {

	public static void main(String[] args) {
		// 1.선언, 2.초기화, 3.사용
		// 외부 for loop : 단을 결정
		for(int stage = 1; stage <= 9; stage++) {
			//단의 제목 출력
			System.out.printf("%n%d 단%n", stage);
			// 내부 for loop : 1 ~ 9 까지 곱해지는 수를 반복
			for (int times = 1; times <= 9; times++) {
				System.out.printf("%d x %d = %2d%n", stage, times, (stage * times));
			}
		}

	}

}