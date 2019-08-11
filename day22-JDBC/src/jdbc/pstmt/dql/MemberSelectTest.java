package jdbc.pstmt.dql;

public class MemberSelectTest {

	public static void main(String[] args) {
		
		// 멤버 조회 기능을 가지고 있는 클래스 
		// 인스턴스 생성
		MemberSelect memSelect = new MemberSelect();
		
		//                  전체 멤버 조회하는 메소드 호출
		//                  결과 목록을 받음
		for (Member member: memSelect.getAllMembers()) {
			System.out.println(member);
		}
		
	}

}