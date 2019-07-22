package school;


public class Student extends Person {
	
		private String major;
		
		public Student(String id, String name, int age) {
			super(id, name, age);
		}
		
		public Student(String id, String name, int age, String major) {
			this(id, name, age);
			this.major = major;
		}
	
		public String getMajor() {
			return major;
		}
		
		public void setMajor(String major) {
			this.major = major;
		}
		@Override
		public String toString() {
			return major + super.toString();
		}

}
