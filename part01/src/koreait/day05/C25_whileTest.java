package koreait.day05;

import java.util.Scanner;

public class C25_whileTest {
	public static void main(String[] args) {
		
		// ��
		for(int i = 0; i < 5; i++) {
			System.out.println("hello! (" + (i + 1) + ")");
		}
		
		// while�� ����
		// loop counter ���� ���� & �ʱⰪ
		int j = 0;
		while(j < 5) {	// ���ǽ�
			System.out.println("hello! (" + (j + 1) + ")"); 
			j++;		// ������
		}
		// ���� : for���� 1���� 100���� ���ϴ� �������� ���� ������� �Ҷ� ����
		//		while ���� ���� �������� ���� ������ ������� �Ҷ� ����
		//		�ݺ����� �Բ� ����ϴ� ��ɹ� - break, continue(continue ���� ��ɵ� �������� �ʰ� ó������ ���ư�)
		int k = 0, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("�Է��� ������ ��� ���ϴ� ���� �Դϴ�. (����  : -1)");
		while(k != -1) {
			System.out.print("���� �Է� >> ");
			k = sc.nextInt();
			if(k != - 1) {
			sum += k;	// sum = sum + k;
			}
		}
		
		System.out.println("sum = " + sum);
		System.out.println();
		
		sum = 0;
		k = 0;
		System.out.println("�Է��� ������ ��� ���ϴ� ���� �Դϴ�. [ver2.0] (���� : -1)");
		
		do {
			sum += k;
			System.out.print("���� �Է� >>> ");
			k = sc.nextInt();
			
		}while(k != -1);	// ������ �ڿ��� �˻��ϴ� ��ɹ�
		System.out.println("sum = " + sum);
		System.out.println();
		
		sum = 0;
		System.out.println("�Է��� ������ ��� ���ϴ� ���� �Դϴ�. [ver2.1] (���� : -1)");
		
		while(true) {
			System.out.print("���� �Է� >>> ");
			k = sc.nextInt();
			
			if(k == -1) {		// �׻� ���϶�, Ż��(����) ���ǰ� break ���.
				break;
			}
			sum += k;
		}
		System.out.println("sum = " + sum);
		System.out.println();
		
		sum = 0;
		System.out.println("�Է��� ������ ��� ���ϴ� ���� �Դϴ�. [ver2.2] (���� : -1)");
		boolean isState = true;
		while(isState) {
			System.out.print("���� �Է� >>> ");
			k = sc.nextInt();
			
			if(k == -1) {
				isState = false;	// boolean ������ Ȱ��. ���� ���ǰ��� �� boolean������ false
			}else {
				sum += k;
			}
			
		}
		System.out.println("sum = " + sum);
		System.out.println();
		
		// continue ���� : �Էµ� ���� 10�� ����̸� sum�� ������ �ʰ� �ٽ� �Է¹ޱ�
		sum = 0;
		System.out.println("�Է��� ������ ��� ���ϴ� ���� �Դϴ�. [����] (���� : -1)");
		while(true) {
			System.out.print("���� �Է� >>> ");
			k = sc.nextInt();
			
			if(k == -1) {
				break;
			}
			if(k % 10 == 0) {
				continue;	// �Ʒ� ��ɾ� �������� �ʰ� �ٽ� �ݺ� ó������
			}
			sum += k;
		}
		System.out.println("sum = " + sum);
		
		sc.close();
	}
}
