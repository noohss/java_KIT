package koreait.day11.test;

public class Crow extends Animal{
	
	protected int wings;	// ����Ʈ ������ + �ٸ� ��Ű�� �ڽ�Ŭ����

	public Crow() {
		System.out.println("���ο� ���� ������ crow");
		type = Animal.CROW;
	}
	
	public void fly() {
		setName("���");
		setColor("������");
		System.out.println("Ư¡ : ����");
	}
	@Override
	public void act() {
		System.out.println("Crow �ൿ : �Ϸ����� ����ٴϱ�");
	}
	
	@Override
	public String eat(Object object) {
		return "���̴� ������" + object + " �Դϴ�.";
	}
}
