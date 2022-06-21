package koreait.day11.test;

public class AnimalTest5 {
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

		// ����ð� : ms, ns (1970�� 1��1�� ������ �������� �������� ī��Ʈ �� ��.)
		System.out.println("����ð�......");
		System.out.println(System.currentTimeMillis());
		System.out.println(System.nanoTime());

		
			
		// �������� �������... (Frog();���� �˻�)instanceof
			int cnt = 0;	// ī��Ʈ ����
			long start = System.nanoTime();		// ���� �ð��� ns(0.000000001��) ������ ����.
			System.out.println("������ �����ֱ�.............");
			for(Animal temp : animals) {
				if(temp != null && temp instanceof Frog) {
					cnt++;
					System.out.println(temp.eat(100*(cnt+2)));
				}
			}
			long end = System.nanoTime();
			System.out.println("������ �����ִ� �� �ɸ��ð� : " + (end - start) + " ms");
			System.out.println("�������� " + cnt + "���� ��� �ֽ��ϴ�.");
			
			// �������� ������� .... int type �ʵ� �̿��ؼ�
			System.out.println("������ �����ֱ�..............");
			cnt = 0;
			start = System.nanoTime();
			for(Animal temp : animals) {
				if(temp != null && temp.type == Animal.DOG) {
					cnt++;
					System.out.println(temp.eat("���ִ� ����"));
				}
			}
			end = System.nanoTime();
			System.out.println("������ �����ִ� �� �ɸ��ð� : " + (end-start) + " ms");
			System.out.println("�������� " + cnt + "���� ��� �ֽ��ϴ�.");
			
			System.out.println("��Ϳ��� �����ֱ�..............");
			System.out.println(animals[6].eat(animals[3]));
	}
}

class Frog extends Animal{	// ������
	
	protected String mouth;	// ����Ʈ ������ + �ٸ� ��Ű�� �ڽ�Ŭ����

	public Frog() {
		System.out.println("���ο� ���� ������ frog");
		type = Animal.FROG;
	}
	
	public void jump() {
		setName("������");
		setColor("�ʷ�");
		System.out.println("Ư¡ : ����");
	}
	
	@Override
	public void act() {
//		super.act();	// �θ�Ŭ������ act() ����
		System.out.println("Frog �ൿ : ���÷� �����ϱ�");
	}
	
	@Override
	public String eat(Object object) {
		return "unkonw : " + object;
	}
}

class Cat extends Animal{
	
	protected String eyes;
	
	public Cat() {
		System.out.println("���ο� ���� ������ cat");
		type = Animal.CAT;
	}
	
	public void sound() {
		setName("�����");
		setColor("ȭ��Ʈ");
		System.out.println("Ư¡ : �߿˾߿�");
	}
	
	@Override
	public void act() {
		System.out.println("Cat �ൿ : ���÷� �����ϱ�");
	}
	
	@Override
	public String eat(Object object) {
		return null;
	}
}
