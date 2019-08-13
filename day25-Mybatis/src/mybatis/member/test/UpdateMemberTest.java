package mybatis.member.test;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import mybatis.emp.MybatisClient;
import mybatis.member.vo.Member;

/**
 * EMP 테이블에서 직원 정보 1건을 수정하는 
 * 쿼리를 Mybatis 로 실행하는 테스트 클래스
 * ----------------------------------------
 * 수정 : 선 조회 - > 후 수정
 * 
 * 1. 직원 사번으로 1명의 정보를 조회
 * 2. 조회된 내용이 맵으로 전달
 * 3. 2의 맵에 수정할 키(컬럼명) 만 새로 put
 * 4. 3에서 변경된 맵 객체로 update 실행
 * 
 * @author Administrator
 *
 */

public class UpdateMemberTest {

   public static void main(String[] args) {
      // 1. 펙토리 얻기
      SqlSessionFactory factory = MybatisClient.getFactory();
      
      // 2. 세션 얻기
      SqlSession session = factory.openSession(true);
      
      try {
         // 3. 세션에서 쿼리 실행
         // (1) 직원 1명 정보 조회
         //mybatis.emp.mapper.EmpMapper.selectEmp
//         Member inputMember =  new Member ();
//         inputMember.setMemberId ("M019");
         Member member =
               session.selectOne("mybatis.member.mapper.MemberMapper.selectMember", "M001");
         
         // 맵 객체인 emp 에 담긴 내용
         // 1111   박준석   SALESMAN      19/08/10         
         System.out.println(member);
         
         // 수정할 컬럼 = 값
         member.setAddress("아산"); // <- 원래 이렇게 해야 되는 데 포장이 일어나서, auto-boxing 이 발생함
         // (2) 조회된 직원 정보 일부 수정
         //mybatis.emp.mapper.EmpMapper.update
         int setCnt = session.update("mybatis.member.mapper.MemberMapper.updateMember", member);
         
         if(setCnt > 0) {

            System.out.printf("%s 직원의 정보가 %d 건 수정되었습니다.%n", member.getMemberId(), setCnt);
         }
         
         // (3) 조회된 정보 재조회

         System.out.println("수정된 맴버 조회");
         System.out.println(member);
         
      
      }finally {
         if(session != null) {
            session.close();
         }
         
      }
      
      // 4. 세션 닫기
   }
}
