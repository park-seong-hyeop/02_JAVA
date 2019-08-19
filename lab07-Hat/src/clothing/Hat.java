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
		/***
		 *   1. public voi discount(int amount) : 
     	 *		amount 만큼 할인한 가격을 리턴.
     	 *		원래 가격보다 큰 값 할인은 불가능하도록 설정.
     	 *		할인가가 원래 제품가격보다 크면 "제품 가격보다 크게 할인할 수 없습니다." 내용 출력
         *
  		 *	 2. public void dye(String color) : 모자 색상을 입력된 color 로 염색하여 색상을 변경
         *
  		 *	 3. public int sell(int amount) : amount 만큼 판매(재고를 줄임). 
  		 *	         원래 수량보다 많이 판매 불가
         *
  		 *	 4. public int buy(int amount) : amount 만큼 구매(재고를 늘림)
		 * @param amount
		 */
		public void discount(int amount) {
			
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
			return "Hat [hatID=" + hatID + 
				 ", type=" + type + 
				 ", material=" + material + 
				 ", size=" + size + 
				 ", color="	+ color + 
				 ", price=" + price + 
				 ", quantity=" + quantity + 
				 ", gender=" + gender + 
				 "]";
		}

	
}
