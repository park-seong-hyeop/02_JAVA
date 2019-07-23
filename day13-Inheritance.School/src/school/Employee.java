package school;


public class Employee extends Person {
	
		private String dept;
		
		public Employee() {

		}
		
		public Employee(String dept) {
			this.dept = dept;
		}
		
		public Employee(String id, String name, int age, String dept) {
			super(id, name, age);
			this.dept = dept;
		}
	
		@Override
		public String toString() {
			String empStr = String.format(", 부서:%s", dept);
			return String.format("부서 정보[%s%s]", super.toString(), empStr);
		}

}
