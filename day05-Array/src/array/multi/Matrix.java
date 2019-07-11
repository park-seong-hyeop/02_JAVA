package array.multi;
/**
 * 수학의 행렬을 나타낼수 있는 
 * 2차원 배열을 선언 하고 초기화 후
 * 출력해보는 클래스
 * @author Administrator
 *
 */
public class Matrix {

	public static void main(String[] args) {
		// 1. 선언, 2. 배열 초기화 목록으로 초기화
		int[][] matrix  = {{0, 1, 0}, {1, 1 ,1}, {0, 0, 0}};
//		int[]   numbers = {10, 20, 30};
//		int[]   matrix[0] = {0, 1, 0};
		
		// 3. 출력 (for : index 를 사용)
		for (int idx = 0; idx < matrix.length; idx++) {
			for (int ind = 0; ind < matrix[idx].length; ind++) {
				// matrix[0].length
				// matrix[1].length ==> matrix[idx].length
				// matrix[2].length
				System.out.printf("matrix[%d][%d]=%d\t", idx, ind, matrix[idx][ind]);
			}
			System.out.println(); // new line(Enter Key)
		} // end outter for
		
//		int[][] matrix  = {{0, 1, 0}, {1, 1 ,1}, {0, 0, 0}};
		// 4. 출력 (foreach)
		for (int[] numbers : matrix) {
			for (int num : numbers) {
				System.out.printf("%d\t", num);
			}
			System.out.println();
		}
		
	}

}

