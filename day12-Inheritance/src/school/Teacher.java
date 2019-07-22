package school;


public class Teacher extends Person {
	
		private String subject;
		
		public Teacher(String id, String name, int age) {
			super(id, name, age);
		}
		
		public Teacher(String id, String name, int age, String subject) {
			this(id, name, age);
			this.subject = subject;
		}
		
		public String getSubject() {
			return subject;
		}
		
		public void setSubject(String subject) {
			this.subject = subject;
		}
		@Override
		public String toString() {
			return subject + super.toString();
		}

}
