package koreait.day09a;

/*
 *  Ŭ������ ���
 *  -> Ŭ���� ���� �θ�(����Ŭ����, super) - �ڽ�(����Ŭ����)���谡 ���������.
 *  -> �θ��� Ŭ���� ������Ҹ� �ڽ��� ����� �� �ְ� �ȴ�. ��ӵǴ� ��� �ʵ�, �޼ҵ�
 *  -> extends�� Ű���� ����Ͽ� �θ� Ŭ������ ����
 *  -> private ���� �����ڴ� ��� �Ұ�
 *  -> protected�� �ٸ� ��Ű���� �ڽ�Ŭ������ ��ӹ��� �� �ֵ��� �Ѵ�.
 *  -> ���� ���迡�� �ݷ����� ���� �. ������ ������ ���ؼ� Ŭ������ ����. 
 *     ������ ���� ��, �����, �ܽ���, ������, �䳢, �����... -> �ϳ��� �׷����� Animal Ŭ���� �����ϰ� �������� ��Ҹ� ����
 *  -> ��������Ұ� �ƴѰ��� ��ü���� Ŭ������ ����(�������, Cat, Dog, Rabbit...) �׸��� Animal Ŭ������ ��ӹ޴´�.
 */
public class ClassA {		// �θ�Ŭ����
	int ab;
	String name;
	protected String title;	
	// protected�� ����Ʈ �����������̳� �ڽ�Ŭ������ ���ܷ� ���
	
	void print() {
		System.out.println("ab = " + ab);
		System.out.println("name = " + name);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}


}
