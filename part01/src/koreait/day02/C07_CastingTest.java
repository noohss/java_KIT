package koreait.day02;

// ���� : �ڹ� ���α׷��� ������ Ŭ���� �̸��� ���ϸ��� �����ϰ� �Ѵ�.
public class C07_CastingTest {
	public static void main(String[] args) {
//		���Թ� : ������ ��(���ͷ�)/����/������ ���� ������ ����. ���Ŀ� ���Ǵ� ������ ������ �����ϴ�.
//				������� +, -, *, /(��), %(������, ���� ���꿡���� ���)
//				���迬�� ==(����), !=(���� �ʴ�), >, <, >=, <=
//				������ &&(and, �׸���), ||(or, �Ǵ�), !(not)
//		���� : ++, --, +=, -+, -=, *=, /= �� ���� ��� ������
		
		// ���� ������ ������ int
		
		int a = 123, b = 13;
		double c = 10.99;	
		
		// ���꿡 ���Ǵ� �ǿ�����(123, 13)�� ��� �����̸� ����� ����
		// 			    �ǿ����ڰ� ����, �Ǽ� ����� ����� �Ǽ�
		//			-> �������� ������ �����Ҷ� ������ ������ ����մϴ�.
		
		int isum;
		double dsum;
		
		isum = a + b;
		dsum = a + c;
		
		System.out.println("a + b = " + isum);
		System.out.println("a + c = " + dsum); 
		
//		isum = a + c;		// ���� : ����� �Ǽ��̹Ƿ� �������� ������ ���� ����
		
		// ����ȯ(Casting) : ���� + �Ǽ� ����� �� ���� ������ �����ؾ� �Ѵٸ�, �Ǽ��� ������ ��ȯ�ؼ� ����
		// 		-> ���α׷��Ӱ� �����ؼ� ������ ����ȯ -> ()�ȿ� ��ȯ��ų ���� �ۼ�
		
		isum = a + (int)c;		// c�� �Ǽ� ���� ������ ��ȯ(��ȯ�� �Ҽ��� �Ʒ� ����, �ݿø� x)
		System.out.println("a + (int)c = " + isum);
		
		b = 10;
		System.out.println("a / b = " + (a / b));	// �������� ������ ��� ����
		System.out.println("a % c = " + (a % b));	
		
		System.out.printf("%d / %d = %d\n", a, b, a/b);
		System.out.printf("%d %% %d = %d\n", a, b, a%b); // �������� ��� printf������ %�� �ΰ� ���
		
		// ���� ����ȯ(Casting) ���� : �������� ������ ����� �Ǽ��� ���ϴ� ó�� �����϶�.
		// 			-> ���� 1���� �Ǽ��� ��ȯ
		
		System.out.println("����/ ���� = �Ǽ� ���� ������ ���մϴ�.");
		System.out.printf("%d / %d = %f\n", a, b, a/(double)b);	// �Ǽ� ���� ���� %f, �⺻ �Ҽ������� 6�ڸ�
		
		b = 11;
		System.out.printf("%d / %d = %.2f\n", a, b, a/(double)b);  // �Ҽ��� ���� 2�ڸ��� ����(�ݿø�)
		
		double test = 12.3456127456789;
		System.out.println("test = " + test);
		System.out.printf("test = %f\n", test);
		System.out.printf("test = %.15f\n", test);
	}
}
