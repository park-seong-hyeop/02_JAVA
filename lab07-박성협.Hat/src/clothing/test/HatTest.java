package clothing.test;

import java.util.ArrayList;
import java.util.List;

import clothing.Hat;

public class HatTest {

	public static void main(String[] args) {
		// 변수선언 , 초기화
		Hat cap   =  new Hat("HT001", "야구모자", "천", 00, "검정", 12900, 20, 'U' );
		Hat fedora = new Hat("HT002", "페도라", "천", 45, "노랑" , 21900, 60, 'M' );
		Hat sunCap = new Hat("HT003", "썬캡", "플라스틱", 50, "빨강" , 9980, 50, 'F' );
		
		//배열선언
		List<Hat>hats = new ArrayList<>();
		
		// 삽입
		hats.add(cap);
		hats.add(fedora);
		hats.add(sunCap);
		
		// 출력
		for(Hat hat : hats) {
			System.out.println(hat);
			System.out.println(hat.discount(3000));
		}
	

	}

}
