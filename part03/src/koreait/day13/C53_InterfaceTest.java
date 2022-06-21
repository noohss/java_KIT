package koreait.day13;

public class C53_InterfaceTest {
	public static void main(String[] args) {
		MyClassX x1 = new MyClassX();
		MyClassY y1 = new MyClassY();
		MyClassZ z1 = new MyClassZ();
		
		InterfaceA x2 = new MyClassX();
		InterfaceB y2 = new MyClassY();
		InterfaceA z2 = new MyClassZ();
		InterfaceB z3 = new MyClassZ();
		
// ���� Ÿ�Կ� ���� �޼ҵ� ����(���� ����ü)		: z1,z2,z3�� � �޼ҵ� ���డ������?
		z1.methodA();
		z1.methodB(23);
		z1.name("����");
		
		z2.methodA();
		z2.methodB(23);
//		z2.name("����");	// ���� : InterfaceB�� �߻�޼ҵ�� ���� ����.
		
//		z3.methodA();	// ���� : InterfaceA�� �߻�޼ҵ�� ���� ����.
//		z3.methodB(23);
		z3.name("����");
		
// ĳ����(���� �Ǵ� ���� Ÿ�Ժ�ȯ) : *���� ����ü*�� �������̽� Ÿ�� ĳ����
//			�� MyClassZ�� InterfaceA�� InterfaceB Ÿ������ ��� ������ �� �ִ� ����ü.
		InterfaceB ib = (InterfaceB)z2;
		ib.name("����");
		InterfaceA ia = (InterfaceA)z3;
		ia.methodA();
		
// ������ ���� 
		iAmethod(x2);
//		iAmethod(y2);	// ���� : InterfaceA ����ü �ƴ�.
		iAmethod(z2);
		iAmethod(x1);
		iAmethod(z1);
//		iAmethod(z3);	// ���� : ���� ����Ÿ���� InterfaceB
		
		iBmesthod(y1);
		iBmesthod(y2);
		iBmesthod(z1);
//		iBmesthod(z2); // ���� ����Ÿ���� InterfaceA�̸� ����.
		iBmesthod(z3);
		
	}
	
	// ������ ������ : �޼ҵ� ���� Ÿ���� InterfaceA
	//		InterfaceA ����ü�� ��� ���ڷ� ���� ����.
	public static void iAmethod(InterfaceA ia) {
		ia.methodA();
	}
	
	public static void iBmesthod(InterfaceB ib) {
		System.out.println(ib.name("momo"));
	}
}
