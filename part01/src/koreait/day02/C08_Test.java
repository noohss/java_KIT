package koreait.day02;

public class C08_Test {
	public static void main(String[] args) {
		int width = 23;
		int height = 19;
		int boxArea = width*height;
		
		System.out.println("[[�簢�� ������ ���� ���ϱ�]]");
		System.out.println("���� : " + width + " ��");
		System.out.println("���� : " + height + " ��");
		System.out.println("���̸� ���߽��ϴ�. -> " + boxArea + " ��");
		System.out.println();
		
		
		double harf = 23.230;
		double round = 2 * 3.14 * harf;
		double circleArea = 3.14 * harf * harf;
		System.out.println("[[�� ������ ���̿� �ѷ� ���ϱ�]]");
		System.out.printf("������ : %.3f ��\n", harf);
		System.out.printf("�ѷ��� ���߽��ϴ�. -> %.3f ��\n", round);
		System.out.printf("���̸� ���߽��ϴ�. -> %.3f ��\n", circleArea);
		
		
		// final �׽�Ʈ 
//				���� ���� �տ� final(������) Ű���带 ���̸� ���� �������� ���Ѵ�.
		
		final int test = 123;	// ���� ���� ���ϴ� ����Դϴ�.
		System.out.println("test = " + test);
		
//		test = 456;	// ���� : final�� �����.
	}
}
