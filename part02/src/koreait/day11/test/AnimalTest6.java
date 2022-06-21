package koreait.day11.test;

public class AnimalTest6 {
	public static void main(String[] args) {
		Animal[] animals = new Animal[10];
		animals[0] = new Dog();
		animals[3] = new Frog();
		animals[3].setName("개굴A");
		animals[4] = new Frog();
		animals[4].setName("개굴B");
		animals[6] = new Crow();
		
		for(Animal temp : animals) {
			if(temp != null) {
				temp.act();
			}
		}
			
		// 개구리가 몇마리인지... (Frog();인지 검사)instanceof
			int cnt = 0;	// 카운트 변수
			System.out.println("개구리 먹이주기.............");
			for(Animal temp : animals) {
				if(temp != null && temp instanceof Frog) {
					cnt++;
					System.out.println(temp.eat(100*(cnt+2)));
				}
			}
			System.out.println("개구리는 " + cnt + "마리 살고 있습니다.");
	}
}
