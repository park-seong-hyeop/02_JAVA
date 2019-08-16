package mybatis.member.test;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import mybatis.emp.MybatisClient;
import mybatis.member.vo.Member;

/**
 * EMP 테이블에서 1건, 전체조회를
 * Mybatis 를 사용하여 실행하는 테스트 클래스
 * 
 * @author 304
 *
 */
public class SelectMemberTest {

	public static void main(String[] args) {
		// 1. factory 얻기
		SqlSessionFactory factory = MybatisClient.getFactory();
		
		// 2. 세션 얻기
		SqlSession session = factory.openSession();
		
		try {
			// 3. 세션을 통해 쿼리 실행
			// (1) 전체 조회 쿼리 아이디 : 
			//     mybatis.emp.mapper.EmpMapper.selectAll
			List<Member> Members = 
					session.selectList("mybatis.member.mapper.MemberMapper.selectAll");
			
			// 조회 결과 foreach 출력
			for (Member member: Members) {
				// 맵의 모든 데이터 출력
//				System.out.println(Member);
				// 사번, 이름만 맵에서 추출
				System.out.println(member);
			}
			
			System.out.println("==============================");
			
			// (2) 직원 1명 조회
			//     mybatis.Member.mapper.MemberMapper.selectEmp
			Member Member = 
					session.selectOne("mybatis.member.mapper.MemberMapper.selectMember", "M001");
			
			// 직원 1명 결과 출력
			System.out.println(Member);
			
		} finally {
			// 4. 닫기
			if (session != null)
				session.close();
		}
	}

}
