package api.iter;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 컬렉션에서 각 데이터 요소(Element) 를
 * 순회 검색할 수 있는 타입으로 변경하는
 * Iterator 인터페이스 테스트 클래스
 * 
 * foreach 제공 전에는
 * 컬렉션의 데이터 요소를 
 * 추출 및 검색하기 위해서
 * 사용되던 인터페이스이나 현재는 
 * 많이 사용되지는 않는 상태
 * 
 * @author 304
 *
 */
public class ieratorTest {

	public static void main(String[] args) {
		// 1. Set, Iterator 변수 선언
		Set<Integer> set;
		Iterator<Integer> iter;
		
		// 2. Set 초기화 : HashSet 으로 생성
		set = new HashSet<>();
		
		/* Iterator 인터페이스 객체를 얻어내려면
		 * new Iterator().. 는 불가능
		 * 대신 Collection 인터페이스에는 
		 * Iterator 타입의 인스턴스를 리턴하는
		 * iterator() 메소드가 제공됨
		 * 
		 * Collection 참조 변수에 iterator() 메소드를
		 * 적용하여 Iterator 타입을 얻어냄.
		 */		 
		
		// set 이 초기화만 되어서 엘리먼트 추가 안된 상황
		// while 을 통해 반복 처리 시도 해도 
		// 출력되는 결과가 없음
		System.out.println("1====================");
		printSet(set);
		
		// set 에 엘리먼트 10개 추가 0 ~ 9 
		for (int idx = 0; idx < 10; idx++) {
			set.add(idx);
		}
		
		System.out.println("2====================");
		printSet(set);
		
	} // end main method

	/**
	 * method refactoring 을 통해 추출한 메소드
	 * 반복 알고리즘, 반복 로직 처리를 위한 메소드는
	 * private 으로 추출하여 
	 * 메소드 호출로 처리할 수 있도록 한다.
	 * @param set
	 */
	private static void printSet(Set<Integer> set) {
		Iterator<Integer> iter;
		iter = set.iterator();
		
		while (iter.hasNext()) {
			int number = iter.next();
			System.out.println("number=" + number);
		}
	}

}





