package koreait.day15;

import java.util.Scanner;

// Throwable Ŭ������ ����Ŭ����
// : Error -> �������� ���α׷� �ܺ��� ����. �ý��ۻ��� ����(HW,OS,JVM...)
// : Exception ->
public class C62_ExceptionTest {
	public static void main(String[] args) {


//Exception ����1 : jaca.lang.NullPointerException(��ü ������ null�̸� �޼ҵ� ���� �Ұ�.)
		String message = null;
		char temp = message.charAt(0);     //message ���ڿ����� ù��°(0) ���� 1�� �����ɴϴ�.

		
//Exception ����2 : java.lang.ArrayIndexOutOfBoundsException
		int[] nums = new int[5];		//�迭���� : ��� 5���Դϴ�.
		nums[5] =100;
				
//Exception ����3 
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� >>> ");
//				int a = sc.nextInt();			//Ű�����Է��� ������ ��ȯ�ؼ� ������ �����մϴ�.
		// ���� �ܿ� �ٸ� ���ڸ� �Է��ϸ� Exception �߻� : java.util.InputMismatchException 
		
		int a = Integer.parseInt(sc.nextLine());
		// ���� �ܿ� �ٸ� ���ڸ� �Է��ϸ� 
		System.out.println("����� �Է��� �� : " + a);

				
		
	}
}
/*
���� ���� : int a = 4.1;�� ���� ������ ��ü�� �Ұ���.
Exception ��� : ���������� �ƴմϴ�. �����ϸ鼭 �߻��ϴ� ���� �Դϴ�.(�߻����ɼ��� ����ؼ� ���α׷����ؾ��մϴ�.)
	-> ���ο� ���� �ٸ��̸�XXXXException�� �߻��ϰ� �̵��� Exception Ŭ������ �ڽ� Ŭ�����Դϴ�.
	-> Exception�� �����߿� �߻��ϸ� �� ���Ĵ�?.... ���α׷��� �� �������� �ߴ� �˴ϴ�.
	����, Exception�� �����ϰ� ���α׷��� �ߴܵ��� �ʵ��� ���α׷� ������ �ؾ��մϴ�.
*/