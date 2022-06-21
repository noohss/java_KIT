package koreait.day02;

public class C04_DoubleData {
	public static void main(String[] args) {
		
		System.out.println("Float ���� ������ -------------");
		System.out.println("�޸� ũ�� : " + Float.BYTES);
		System.out.println("Float ������ �ּҰ� : " + Float.MIN_VALUE);
		// 1.4E-45�� 1.4 * 10�� -45��, 3.44028235E38�� 10�� 38�� 
		System.out.println("Float ������ �ִ밪 : " + Float.MAX_VALUE);
		System.out.println();
		
		System.out.println("Double ���� ������ -------------");
		System.out.println("�޸� ũ�� : " + Double.BYTES);
		System.out.println("Double ������ �ּҰ� : " + Double.MIN_VALUE);
		System.out.println("Double ������ �ִ밪 : " + Double.MAX_VALUE);
	}
}

/* �Ǽ� �����ʹ� ��ǻ�� �������� �ε��Ҽ��� �������� �ٷ��. 
 * ���� ��� 1.23 * 10�� 23�¿��� 1.23(����)�� 23(����)�� ���� � ũ�⸸ŭ �Ҵ��ϴ��Ŀ� ����
 * ���� ǥ�������� ���е�(������ �Ҽ����� Float�� 7�ڸ�, Double�� 16�ڸ�)�� �����ȴ�.
 * 
 * �Ǽ� ������ �⺻ ���� : float ,double 
 * 	   Wrapper Ŭ������ Float, Double
 * 		�ڡ� 1.234�� double ����. �ڡ�	
 */

