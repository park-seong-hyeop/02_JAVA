package api.collection;

import java.util.HashSet;
import java.util.Set;

/**
 * 객체를 요소(element)로 저장하는 컬랙션 중에
 * 1. 중복허용하지 않음
 * 2. 순서 상관없음
 * 
 * 으로 저장하는 Set 타입에대해 알아보자
 * 
 * @author Administrator
 *
 */
public class SetTest {

	public static void main(String[] args) {
		// 1. Set 선언
		Set set; // java.util 패키지에 있으므로 import 필요
		
		// 2. Set 초기화
		// 	  Set은 인터페이스 타입 이므로 직접 new Set();은 불가능 
		//    대신 구현 클래스인 HashSet()의 생성자로 인스턴스를 생성한다.
		set = new HashSet();
		
		
		// 3. 사용
		// (1) Set에 요소(element) 추가
		//	   Set은 모든 Object 를 다 저장할 수 있다.
		//	   Add(Object) 메소드 : Collection 인터페이스에서 
		//						    물려받은 추상 메소드가 HashSet 클래스에서 구현된 것 사용
		// 문자열 타입 저장
		System.out.println(set.add("1st Item"));
		// 동알 데이터 저장시도
		System.out.println(set.add("1st Item"));
		//autoboxing
		System.out.println(set.add(2)); // autoboxing이 일어난 상황
		//double 타입의 포장객체
		System.out.println(set.add(new Double("3.0")));
		//double 타입의 포장객체
		System.out.println(set.add(new Boolean(true)));
		
		Book vegetarian = 
				new Book(1, "9788936433598", "채식주의자"
						  , "한강", "창비", 247, 10800, 10);
		Book book = new Book(1);
		
		// 사용자 정의 타입인 Book 타입도 set 에 저장 가능
		System.out.println(set.add(vegetarian));
		
		// Set의 내용 출력
		System.out.println("===Set의 내용 출력===");
		// set 클래스는 toString() 재정의 해두었음
		System.out.println(set);
		
		System.out.println("===foreach 로 출력 ===");
		// foreach 에서 : 뒤쪽은 자료구조가 올수 있다.
		// 자료구조 : 배열, 셋, 리스트, 맵
		for (Object obj: set) {
			System.out.println(obj);
		}


	}

}
