package koreait.day04;

import java.util.Scanner;

public class C18_ReviewEx {
	public static void main(String[] args) {
		
		String best;	// Ư�� ����� ������ ����
		int korean;
		int english;
		int science;
		int max;
		
		System.out.println("[[���� ���� : ��հ� ���� ���ϱ�]]");
		Scanner sc = new Scanner(System.in);
		System.out.print("���� -> ");
		korean = sc.nextInt();
		System.out.print("���� -> ");
		english = sc.nextInt();
		System.out.print("���� -> ");
		science = sc.nextInt();
		System.out.println();
		System.out.println(">> ó���Ǿ����ϴ�.");
		
		int sum = korean + english + science;
		double avg = (double)sum / 3;
		int subject = 3;
		
		System.out.println("���� : " + sum);
		System.out.printf("��� : %d %.2f , ����� : %d\n", (int)avg, avg, subject);
		
		if(korean > english) {
			max = korean;
			best = "����";
		}else {
			max = english;
			best = "����";
		}
		if(max < science) {
			max = science;
			best = "����";
		}
		System.out.printf("�� �л��� Ư������� . %s (%d) . �Դϴ�.", best, max);	// 3���� ������ ���� ���� ������ ���� ���
		
		sc.close();
	}
}
