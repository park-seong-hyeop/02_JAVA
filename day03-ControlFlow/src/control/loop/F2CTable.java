package control.loop;

import java.util.Scanner;

public class F2CTable {

	public static void main(String[] args) {
		//상수 선언
		final int FROM = 0;
		final int TO = 100;
		final int STEP = 10;
		
		//온도 변수 선언
		double fah;
		double cel;
		
		// 변환테이블 for loop
		for (fah = FROM; fah <= TO; fah += STEP) {
	         cel = 5.0 / 9.0 * (fah - 32);
	         System
	         .out.printf("%5.1f F = %5.1f C%n", fah, cel);	         
		}
	}
}