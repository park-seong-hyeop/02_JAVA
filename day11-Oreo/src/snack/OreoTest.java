
package snack;

/**
 * Oreo 쿠키가 3개 들어있는 oreoBox 라는 변수를 Oreo 배열타입으로 선언하고
 * 
 * oreoBox[0] ~ [2] Oreo 쿠키를 입력 크림의 종류는 바닐라, 초코, 딸기, 말차 중 하나로 입력할 것.
 * 
 * foreach를 사용하여 oreoBox 에서 하나의 쿠키의 상태를 출력
 * 
 * for 를 사용하여 모든 쿠키의 크림을 바닐라로 변경
 * 
 * foreach를 사용해서 모든 쿠키의 크림 변경 상태 확인을 위한 출력
 * 
 * @author Administrator
 *
 */
public class OreoTest {

 public static void main(String[] args) {
  // 1. 선언, 2. 초기화
  Oreo[] oreos = new Oreo[0];

  OreoBox box = new OreoBox(oreos);

  Oreo choco = new Oreo(1, "초코");
  Oreo strawberry = new Oreo(2, "딸기");
  Oreo greentea = new Oreo(3, "말차");

  // 3. 사용
  // add 기능 테스트
  box.add(choco);
  box.add(strawberry);
  box.add(greentea);

  // 생성 직후 상태 출력
  for (Oreo oreo : box.getAllOreos()) {
   oreo.print();
  }

  // 초코 쿠키 (1번 쿠키)를 바닐라로 변경 : set
  choco.changeCream("바닐라");
  box.set(choco);
  // 변경된 초코쿠키 (1번 쿠키) :get
  box.get(choco);
  // 전체 크림 변경
  for (Oreo oreo : box.getAllOreos()) {
   oreo.changeCream("바닐라");
  }

  System.out.println("===========================");

  // 바닐라 크림 변경 후 출력
  for (Oreo oreo : box.getAllOreos()) {
   oreo.print();
  }
  System.out.println("===========3번삭제=========");
  // 3번 쿠키 삭제 : remove
  box.remove(greentea);
  // 전체 목록 출력
  for (Oreo oreo : box.getAllOreos()) {
   oreo.print();
  }
 }

}
 
