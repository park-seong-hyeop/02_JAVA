package book.resp;
/**
 * 북매니저가 
 * @author Administrator
 *
 */

public interface Response {
	/**
	 * 매니저가 특정 작업에 대해 응답하는 메소드
	 * @param object
	 * */

	public abstract String response(Object object);

}
