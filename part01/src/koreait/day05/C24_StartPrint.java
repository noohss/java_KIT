package koreait.day05;

import java.util.Scanner;

public class C24_StartPrint {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("[[��ȭ���� �ı�]]");
		System.out.print("������ �� �� �ֽðڽ��ϱ�? (1~5) -> ");
		int count = sc.nextInt();
		
		System.out.println("���1)");
		for(int i = 0; i < count; i++) {
		System.out.print("��");
		}
		System.out.println();
		
		System.out.println("���2)");
		for(int i = 0; i < count; i++) {
			System.out.print("��");
		}
		for(int i = 0; i < (5 - count); i++) {
			System.out.print("��");		// ���Ƚ���� 5 - count
		}
		System.out.println();
		
		System.out.println("���2_)");
		
		for(int i = 0; i < 5; i++) {		// 3��
			if(i<count) {
				System.out.print("��");
			}else {
				System.out.print("��");	// 2��
			}
		}
		System.out.println();
		
		System.out.println("���2__)");
		int k = 0;	// loop counter ������ main�޼ҵ��� ��������
		for(k = 0; k < count; k++) {	// count = 3;
			System.out.print("��");
		}
//		System.out.println("k = " + k);	// k = 3;, ���� for���� ���ᰡ�Ǵ� k 
		for(;k<5;k++) {
			System.out.print("��");
		}
	}
}
