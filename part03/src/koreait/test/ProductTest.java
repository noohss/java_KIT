package koreait.test;


// 작성자 : 박상훈
public class ProductTest {
	public static void main(String[] args) {
		
		// [13]
		Product[] cart = new Product[10];
		cart[0] = new Bike(123000, "MTB", 25);
		cart[1] = new Electronics(3500, "USB");
		cart[3] = new Bike(99000, "삼천리", 15);
		cart[5] = new Electronics(117000, "ipad");
		cart[7] = new Electronics(2250000, "lg 냉장고");
		
		// [14]
		Electronics elec = (Electronics)cart[7];
		elec.setKwh(0.9);
		System.out.println(elec.power());
		
		
		// [15]
		for(int i = 0; i < cart.length; i++) {
			if(cart[i] != null && cart[i].price >= 100000)
				System.out.println(cart[i]);
		}
		
		
		// [16] 향상된 for문(for each)
		for(Product temp2 : cart) {
			Bike bike;
			if(temp2 != null) {
				if(temp2 instanceof Bike) {
					bike = (Bike)temp2;
					bike.ride();
				}
			}
		}
		
		// [16] 일반 for문
		for(int i = 0; i< cart.length; i++) {
			Bike bike;
			if(cart[i] != null) {
				if(cart[i] instanceof Bike) {
					bike = (Bike)cart[i];
					bike.ride();
				}
			}
		}
	
		
		
		
		
	}
}
