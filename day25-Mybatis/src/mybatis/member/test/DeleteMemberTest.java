package mybatis.member.test;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import mybatis.emp.MybatisClient;

/**
 * EMP 테이블에서
 * 직원 정보 1건을 삭제하는 클래스
 * Mybatis 를 사용하여 삭제한다.
 * 
 * @author Administrator
 *
 */
public class DeleteMemberTest {

   public static void main(String[] args) {
      // 1. 펙토리 얻기
      SqlSessionFactory factory = MybatisClient.getFactory();
      // 2. 세션 얻기
      SqlSession session = factory.openSession(true);
      
      try {
         // 3. 쿼리 실행 및 결과 받기
         // mybatis.emp.mapper.EmpMapper.delete
         int rmCnt = session.delete("mybatis.member.mapper.MemberMapper.deleteMember" , "M019");
         if(rmCnt > 0) {
            System.out.printf("직원정보 %d 건이 삭제되었습니다. %n", rmCnt);
         }else {
            System.out.println("삭제된 정보가 없습니다.");
         }
         
      }finally {
         // 세션 닫기
         session.close();
      }
      
   }

}