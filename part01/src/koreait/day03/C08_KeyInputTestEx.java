package koreait.day03;

import java.util.Scanner;

public class C08_KeyInputTestEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int width;
		int height;
		int boxArea;
		double harf, round, circleArea;
		final double PI = 3.14;
		
		System.out.println("[[�簢�� ������ ���� ���ϱ�]]");
		System.out.print("���� �Է� -> ");
		width = sc.nextInt();
		System.out.print("���� �Է� -> ");
		height = sc.nextInt();
		boxArea = width*height;
		
		System.out.println("���� : " + width + " ��");
		System.out.println("���� : " + height + " ��");
		System.out.println("���̸� ���߽��ϴ�. : " + boxArea + " ��");
		System.out.println();
		
		System.out.println("[[�� ������ ���̿� �ѷ� ���ϱ�]]");
		
		System.out.print("������ �Է� -> ");
		harf = sc.nextDouble();
		round = 2 * PI * harf;
		circleArea = PI * harf * harf;
		System.out.printf("������ : %.3f ��\n", harf);
		System.out.printf("�ѷ��� ���߽��ϴ�. : %.3f ��\n", round);
		System.out.printf("���̸� ���߽��ϴ�. : %.3f ��\n", circleArea);
		
		sc.close();
	}
}
