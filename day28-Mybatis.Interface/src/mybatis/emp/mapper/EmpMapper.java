package mybatis.emp.mapper;

import java.util.List;
import java.util.Map;

import mybatis.emp.vo.Emp;

/**
 * EmpMapper.xml 에 정의되어 있는
 * 각 쿼리 아이디를 메소드 이름으로 하는 
 * 
 * 추상 메소드들을 매핑하는 인터페이스
 * @author Administrator
 *
 */
public interface EmpMapper {

	/**
	 * 1 건 혹은 전체 조회 결과를 내는 동적 쿼리를 수행하는 메소드
	 * @param emp
	 * @return
	 */
	public abstract List<Emp> select(Emp emp); // <-- 1건이 나올 수 도 있고, 리스트로 나올수 도 있어서 List 로 받아야 한다.
	
	/**
	 * keyword 에 의한 이름 유사 검색 조회 결과를 내거나
	 * keyword 가 생략(null) 인 경우 전체 검색 결과를 내는
	 * 동적 쿼리 결과 메소드
	 * @param keyword
	 * @return
	 */
	public abstract List<Emp> selectByName(String keyword);
	
	
	
	/**
	 * Emp 전체 목록 조회
	 * Emp 한 사람의 정보를 Map 의 List 형태로 만들어서
	 * 그 Map 의 목록(List) 으로 리턴하는 메소드
	 * @return Emp map 의 List 
	 */
	public abstract List<Map<String, Object>> selectAll();
	
	/**
	 * 매개변수로 입력된 사번(empno) 에 해당하는
	 * 직원 한명의 모든 정보를 조회
	 * @param empno : int : 조회할 직원의 사번
	 * @return 직원 1명의 상세 정보 :(Map) 타입
	 */
	public abstract Map<String, Object> selectEmp(int empno);
	
	
	/**
	 * 직원 정보 1건을 삽입하는 메소드
	 * @param empMap : Map : 추가할 직원의 정보가 담긴 Map 객체
	 * @return 주가에 성공한 행의 개수
	 */
	public abstract int insert(Map<String, Object> empMap);

	/**
	 * 직원의 정보 1건을 수정
	 * @param empMap : Map : 수정할 직원의 정보가 담긴 Map 객체
	 * @return 수정에 성공한 행의 개수
	 */
	public abstract int update(Map<String, Object> empMap);

	/**
	 * 직원의 정보 1건을 사번을 사용하여 삭제하는 메소드
	 * 
	 * @param empno : int : 삭제할 직원의 사번
	 * @return 삭제에 성공한 행의 개수
	 */
	public abstract int delete(int empno);

	
	/**
	 * Emp 전체 직원 목록 조회하는 메소드
	 * 
	 * @return 직원 전체 목록을 Emp 타입의 목록(List) 으로 리턴함
	 */
	public abstract List<Emp> selectAll2();

	/**
	 * empno 의 사원 1명을 조회하는 메소드
	 * 입력값으로 Emp 타입의 객체를 받아서 조회한다.
	 * 이 때, 매개변수로 받은 Emp 타이
	 * @param empno : 직원 한명의 번호 
	 * @return 직원 한명의 정보를 조회
	 */
	public abstract Emp selectEmp2(Emp empno);
	
	/**
	 * 수정할 컬럼을 if 구문으로 동적으로 지정할수 있는 동적 update 쿼리를 실행하는 메소드
	 * @param emp : Emp : 수정할 값이 담긴 객체
	 * @return 수정(update)에 성공한 행의 개수
	 */
	public abstract int insert2(Emp empMap);

	/**
	 * 수정할 직원의 전체 정보가 담겨있는 Emp 타입의 객체
	 * emp 를 매개변수로 받아 update 를 수행하는 메소드
	 * 
	 * @param empMap 업데이트 할 직원 정보
	 * @return 업데이트에 성공한 행의 갯수
	 */
	public abstract int update2(Emp empMap);
	
	/**
	 * 수정할 직원의 전체 정보가 담겨있는 Emp 타입의 객체
	 * emp 를 매개변수로 받아 update 를 수행하는 메소드
	 * 
	 * @param empMap 업데이트 할 직원 정보
	 * @return 업데이트에 성공한 행의 갯수
	 */
	public abstract int update3(Emp empMap);
	
	/**
	 * 직원의 정보 1건을 delete 하기 위한 메소드
	 * @param empno 삭제하려는 직원의 사원 번호
	 * @return 삭제 성공한 행의 갯수
	 */
	public abstract int delete2(Emp empno);
	
}
