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
		
		System.out.println("[[사각형 도형의 넓이 구하기]]");
		System.out.print("가로 입력 -> ");
		width = sc.nextInt();
		System.out.print("세로 입력 -> ");
		height = sc.nextInt();
		boxArea = width*height;
		
		System.out.println("가로 : " + width + " ㎝");
		System.out.println("세로 : " + height + " ㎝");
		System.out.println("넓이를 구했습니다. : " + boxArea + " ㎠");
		System.out.println();
		
		System.out.println("[[원 도형의 넓이와 둘레 구하기]]");
		
		System.out.print("반지름 입력 -> ");
		harf = sc.nextDouble();
		round = 2 * PI * harf;
		circleArea = PI * harf * harf;
		System.out.printf("반지름 : %.3f ㎝\n", harf);
		System.out.printf("둘레를 구했습니다. : %.3f ㎝\n", round);
		System.out.printf("넓이를 구했습니다. : %.3f ㎝\n", circleArea);
		
		sc.close();
	}
}
