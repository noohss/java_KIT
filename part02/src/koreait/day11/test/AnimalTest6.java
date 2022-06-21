package koreait.day11.test;

public class AnimalTest6 {
	public static void main(String[] args) {
		Animal[] animals = new Animal[10];
		animals[0] = new Dog();
		animals[3] = new Frog();
		animals[3].setName("����A");
		animals[4] = new Frog();
		animals[4].setName("����B");
		animals[6] = new Crow();
		
		for(Animal temp : animals) {
			if(temp != null) {
				temp.act();
			}
		}
			
		// �������� �������... (Frog();���� �˻�)instanceof
			int cnt = 0;	// ī��Ʈ ����
			System.out.println("������ �����ֱ�.............");
			for(Animal temp : animals) {
				if(temp != null && temp instanceof Frog) {
					cnt++;
					System.out.println(temp.eat(100*(cnt+2)));
				}
			}
			System.out.println("�������� " + cnt + "���� ��� �ֽ��ϴ�.");
	}
}
