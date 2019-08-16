package mybatis.emp.mapper;

import java.util.List;
import java.util.Map;

import mybatis.emp.vo.Emp;

/**
 * EmpMapper.xml 에 정의되어있는  각 쿼리 Id를 메소드 이름으로 하는
 * 추상 메소드들을 매핑하는 인터페이스
 * 
 * @author Administrator
 *
 */
public interface EmoMapper {
	/**
	 * Emp 전체 목록 조회
	 * Emp 한 사람의 정보를 Map로 만들어서 
	 * 그 Map의 목록(List) 으로 리턴하는 메소드
	 * 
	 * Emp Map의 List
	 * */
	public abstract List<Map<String, Object>> selectAll();
	/**
	 * 매개변수로 입력된 사번(empno)에 해당하는 
	 * 직원 한명의 모든 정보 조회
	 * 
	 * @param empno : int : 조회할 직원의 사번
	 * @return 직원 1명의 상세 정보 : Map
	 * */
	public abstract Map<String, Object> selectEmp(int empno);
	/**직원 정보 1건을 삽입하는 메소드
	   @param empMap : Map : 추가할 직원의 정보가 담긴 Map 객체
	 * @return 추가로 성공한 개수
	 * **/
	public abstract int insert(Map<String, Object> empMap);
	/**직원 정보 1건을 수정
	   @param empMap : Map : 추가할 직원의 정보가 담긴 Map 객체
	 * @return 수정에 성공한 행의 개수
	 * **/
	public abstract int update(Map<String, Object> empMap);
	/**직원 정보 1건을 삭제하는 멧ㅗ드
	   @param empno : int : 삭제할 직원의 사번
	 * @return 삭제에 성공한 행의 개수
	 * **/
	public abstract int delete(int empno);
	/**Emp 전체 직원 목록 조회하는 메소드
	 * 
	 * @return 직원전체 목록을 Emp 타입의 목옥(List)으로 리턴함
	 * */
	public abstract List<Emp> selectAll2();
	/**
	 * 직원 정보 1건을 조회하는 메소드
	 * 입력값으로 EMp 타입의 객체를 받아서 조회한다
	 * 이 떄, 매개변수로 받은 Emp 타입 객체에서 
	 * empno 를 추출하여 PK(empno)와 
	 * @param emp : int : 삭제할 직원의 사번
	 * @return 삭제에 성공한 행의 개수
	 * */
	public abstract Emp selectEmp2(Emp emp);
	/**
	 * 추가직원듸 전체 정보가 담겨있는 Emp 터압우ㅏ 갹ㅌ채
	 * @param
	 * @return
	 * */
	public abstract int insert2(Emp emp);
	/**
	 * @param
	 * @return
	 * */	
	public abstract int update2(Emp emp);
	/**
	 * @param
	 * @return
	 * */
	public abstract int delete2(Emp emp);
	
}
