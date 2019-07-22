package school;


public class Employee extends Person {
	
		private String dept;
		
		public Employee(String id, String name, int age) {
			super(id, name, age);
		}
		
		public Employee(String id, String name, int age, String dept) {
			this(id, name, age);
			this.dept = dept;
		}
		
		public String getDept() {
			return dept;
		}
		
		public void setDept(String dept) {
			this.dept = dept;
		}
		@Override
		public String toString() {
			return dept + super.toString();
		}

}
