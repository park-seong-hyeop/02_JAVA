package clothing;

public class Hat {
	
		//멤버 변수
		private String hatID;
		private String type;
		private String material;
		private double size;
		private String color;
		private double price ;
		private int quantity;
		private char gender;
		
		// 생성자
		public Hat() {
			
		}
		
		public Hat(String hatID) {
			this();
			this.hatID = hatID;
		}
		
		public Hat(String hatID, String type) {
			this(hatID);
			this.type = type;
		}
		
		public Hat(String hatID, String type, String material) {
			this(hatID, type);
			this.material = material;
		}
		
		public Hat(String hatID, String type, String material, double size) {
			this(hatID, type, material);
			this.size = size;
		}
		
		public Hat(String hatID, String type, String material, double size, String color) {
			this(hatID, type, material, size);
			this.color = color;
		}
		
		public Hat(String hatID, String type, String material, double size, String color, double price) {
			this(hatID, type, material, size, color);
			this.price = price;
		}
		
		public Hat(String hatID, String type, String material, double size, String color, double price, int quantity) {
			this(hatID, type, material, size, color, price);
			this.quantity = quantity;
		}
		
		public Hat(String hatID, String type, String material, double size, String color, double price, int quantity, char gender) {
			this(hatID, type, material, size, color, price, quantity);
			this.gender = gender;
		}
		
		// 메소드
		/**
		 *  할인 가격을 입력하면 입력한만큼 할인해주는 메소드
		 *  단 제품가격보다 할인해줄수은 없음  
		 * @param amount
		 */
		public double discount(int amount) {
			
			//선언
			double result = price;
			
			//로직
			if(this.price - amount >= 0) {
				result = price - 0;
			} else {
				System.out.println("제품 가격보다 크게 할인할 수 없습니다.");
			}
			// 리턴
			return price;
		}
		
		/***
		 * 모자의 색을 염색하는 메소드
		 * @param color
		 */
		public void dye(String color) {
			
			this.color = color;
		}
		
		/***
		 * 모자를 판매시 수량을 줄이는 메소드
		 * 0보다 작아질수는 없음
		 * @param amount
		 * @return
		 */
		public int sell(int amount) {
			
			//로직
			if(this.quantity  - amount >= 0) {
			   this.quantity -= amount;	
			} else {
				System.out.println("보유 재고 수량이 부족합니다.");
			}
			
			//리턴
			return quantity;
		}
		
		/***
		 * 모자를 추가하여 재고를 늘리는 메소드
		 * @param amount
		 * @return
		 */
		public int buy (int amount) {
			
			//로직
			quantity += amount;
			
			//리턴
			return quantity;
		}

		// 접근자, 수정자
		public String getHatID() {
			return hatID;
		}

		public void setHatID(String hatID) {
			this.hatID = hatID;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getMaterial() {
			return material;
		}

		public void setMaterial(String material) {
			this.material = material;
		}

		public double getSize() {
			return size;
		}

		public void setSize(double size) {
			this.size = size;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public int getQuantity() {
			return quantity;
		}

		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}

		public char getGender() {
			return gender;
		}

		public void setGender(char gender) {
			this.gender = gender;
		}
	
		
		// equal, hash 재정의
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((hatID == null) ? 0 : hatID.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Hat other = (Hat) obj;
			if (hatID == null) {
				if (other.hatID != null)
					return false;
			} else if (!hatID.equals(other.hatID))
				return false;
			return true;
		}
		
		// toString 재정의
		@Override
		public String toString() {
			return "모자 정보 [보자 번호=" + hatID + 
				 ", 종류=" + type + 
				 ", 재질=" + material + 
				 ", 크기=" + size + 
				 ", 색="	+ color + 
				 ", 가격=" + price + 
				 ", 수량=" + quantity + 
				 ", 성별=" + gender + 
				 "]";
		}

	
}
