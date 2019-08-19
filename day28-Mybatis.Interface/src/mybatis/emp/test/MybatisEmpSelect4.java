package mybatis.emp.test;

import java.util.List;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import mybatis.emp.MybatisClient;
import mybatis.emp.mapper.EmpMapper;
import mybatis.emp.vo.Emp;

/**
 * EMP  테이블에서 1건, 전체조회를 
 * Mybatis 를 사용하여 실행하는 테스트 클래스
 * @author Administrator
 *
 */
public class MybatisEmpSelect4 {
	
	public static void main(String[] args) {
		// 1. factory 얻기
		SqlSessionFactory factory = MybatisClient.getFactory();
		
		// 2. 세션 얻기
		SqlSession session = factory.openSession();
		
		try {
			// 3. 매퍼 인터페이스의 메소드를 사용한 쿼리 실행
			// (1) empMapper 타입의 인스턴스 얻기
			 EmpMapper mapper = session.getMapper(EmpMapper.class);
			
			// (2) 전체 조회 메소드 호출 
			Emp inputEmp = new Emp();
			inputEmp.setEmpno(7698);
			
			// 동적 쿼리 메소드 호출 & 출력
//			System.out.println(mapper.select(inputEmp));
		
		    System.out.println("== 직원 사번으로 조회 == ");
			for(Emp emp : mapper.select(inputEmp)) {
				System.out.println(emp);
			}
			
			System.out.println("== 이름에 J 가 들어가는직원 조회 == ");
			for(Emp emp : mapper.selectByName("J")) {
				System.out.println(emp);
			}
			
			System.out.println("== 이름에 J 가 들어가는 직원 조회시 null==");
			for(Emp emp: mapper.selectByName(null)) {
				System.out.println(emp);
			}
			
		}finally {
			// 4. 닫기
			if(session != null) {
				session.getClass();
			}
		
		}
		
		
		
	}
}
