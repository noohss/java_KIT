package koreait.day03;

import java.util.Scanner;

public class C10_KeyInput {
	public static void main(String[] args) {
		// sc�� ������. �⺻�� ������ �ƴ� Ŭ���� Ÿ���� ���� -> ������ ����
//				�� new �������� ����� ��ü�� Ŭ���� �̸��� ���� �̸����� ���� ����
		Scanner sc = new Scanner(System.in);		
		// Ű���� �Է��� ���� ���� ����. - ǥ�� �Է����� Scanner ��ü�� ����� ���� sc�� ����
		
		int data;
		
		System.out.print("���� �� �Է�. -> ");		// �Է� �ȳ� �޼���
		
		data = sc.nextInt();
		// ����ڰ� ���ڸ� �Է����� �ʾ��� ���� ������ ��ȯ���� ���ϰ� ���� �߻�
		System.out.println("�Էµ� ���� " +  data + "�Դϴ�.");
		
		double point;
		System.out.print("�Ǽ� �� �Է� -> ");
		
		point = sc.nextDouble();
		System.out.println("�Էµ� ���� " + point + "�Դϴ�.");
		
	}
}

/*
 * 	ǥ�� ��� : System.out	(out�� System Ŭ������ ������ �ʵ��̰� �޼ҵ� println()�� ���´�.)
 *  ǥ�� �Է� : System.in     -> in�� System Ŭ������ ������ �ʵ�
 *  					   -> Scanner Ŭ������ �̿��ؼ� �Է°��� Ư�� �⺻�������� ��ȯ���Ѵ� ��� ���.
 * 						   -> �⺻ ��Ű���� Ŭ������  �ƴϹǷ� import �� �ʿ��մϴ�.	
 * 						* ���� : �⺻��Ű�� java.lang�� import ���� ���
 */
