package koreait.day11;

public class ClassX extends ClassAbs{
	private int num;
	
	// �߻�Ŭ���� ��ӹ��� �ڽ�(����)Ŭ������ �ݵ�� �߻�޼ҵ带 �������ؾ� �Ѵ�.
	@Override
	public void test() {
		System.out.println("ClassX�� test()");
		System.out.println("num = " + num);
	}
	
	public void setNum(int num) {
		this.num = num;
	}
}
