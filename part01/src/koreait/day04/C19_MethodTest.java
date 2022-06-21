package koreait.day04;

public class C19_MethodTest {
	
	// main �޼ҵ� : ������ ������. ���α׷� ������ ���ؼ��� �� �־���� �޼ҵ�. static
	public static void main(String[] args) {
		 	
		System.out.println("�޼ҵ带 ���� �����ؼ� ����غ��ϴ�.");
		System.out.println("���α׷��� main �޼ҵ��� ��ɹ��� ������� �����ϰ� �߰��� �޼ҵ� ȣ���� ������ �޼ҵ尡 ���ǵ� ������ ����");
		System.out.println("��� �̵��մϴ�. �޼ҵ� ������ ����Ǹ� �ٽ� main �޼ҵ�� ��� ���ƿɴϴ�.");
		System.out.println("1. ");
		methodA();		// �޼ҵ� ȣ��(����) . �ʿ��� �� ȣ��
		System.out.println("2. ");
		methodB(11, 33);	// **11,33�� �޼ҵ� ���࿡ �ʿ��� ����**
		methodB(929, 121);
		System.out.println("3. ");
		methodC(929, 12.1);
		methodC(929, 121);
		System.out.println("4. ");
		methodD();		// ��ȯ���� �ִ� �޼ҵ������� main �޼ҵ忡�� ��ȯ�� ������ ���߽��ϴ�.
		System.out.println("return = " + methodD());		// ��ȯ���� �޾Ƽ� ����ϴ� ����.
		int temp = methodD();				// ��ȯ���� �޾Ƽ� ������ �����ϴ� ����
		System.out.println("return = " + temp);
		System.out.println("5. ");
		// ���� ���ù� - ���ϰ��� �ִ� �޼ҵ�� �� ���� Ȱ���ؾ� �Ѵ�.
		double result = methodE(314, 3.14);
		System.out.println("return = " 	+ result);
		System.out.println('6');
		System.out.println(methodF('i',4));
		
		char ch = 'a';
		int val = 3;
		ch = methodF(ch,val);
		System.out.println("return = " + ch);
	}

	 /* String Ŭ������ �޼ҵ带 �����ϱ� ���ؼ�, ���� �޼ҵ��� ���� ����
	  *	    �� �޼ҵ��� ���� ����
	  *
	  * �޼ҵ��� �ֿ� ��� : ��ȯ��(����), ����(argument)�Ǵ� �Ű�����(parameter), �޼ҵ� �̸�, public �Ǵ� static ���� ����
	  * 	�� ��ȯ�� : �޼ҵ� ���� �Ϸ�Ǹ� ������� ��� �� - ��ȯ ������ ��� Ÿ��, ��ȯ���� ������ void
	  * 	�� ���� : �޼ҵ� ������ ���ؼ� �ʿ��� ������(���İ� ������ ���� �ʿ�) - ������ ������ ������ �پ���
	  * 	�� �޼ҵ� �̸� : �ĺ���
	  * 	�� public : ���� ������, static : ���� ���
	  */
	
	
	// static�� main���� ������ �޼ҵ�� �����ϰ� static�̾�� �մϴ�.
	// �޼ҵ� ����(����)
	public static void methodA() {
		System.out.println("##ù��° �޼ҵ� ���� �����Դϴ�.##");
		
	}
	
	public static void methodB(int a, int b) {	// **int a, int b�� ���ڰ��� ���޹޴� �Ű�����(��������)**
		System.out.println("##�ι�° �޼ҵ� ���� �����Դϴ�.##");
		System.out.println("���޹��� �� a = " + a + " , b = " + b);
	}
	
	public static void methodC(int a, double b) { 
		System.out.println("##����° �޼ҵ� ���� �����Դϴ�.##");
		System.out.println("���޹��� �� a = " + a + " , b = " + b);
	}
	
	public static int methodD() {		// ��ȯ���� �ִ� ���� : ��ȯ���� int ������, �ݵ�� return�� �ʿ��մϴ�.
		System.out.println("##�׹�° �޼ҵ� ���� �����Դϴ�.##");
		return 999;
	}
	
	public static double methodE(int a, double b) {
		System.out.println("##�ټ���° �޼ҵ� ���� �����Դϴ�.##");
		return a + b;		// ���ڷ� ���޹��� ������ �����ϰ� ó����� ����
	}
	
	public static char methodF(char ch, int size) {
		System.out.println("##������° �޼ҵ� ���� �����Դϴ�.##");
		return (char)(ch + size);
	}
		
	
}
