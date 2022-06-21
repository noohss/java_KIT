package koreait.day07;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class C42_Day07Exam {
	public static void main(String[] args) {
		
		int[] num1 = new int[5];
		int[] num2 = new int[5];
		int[] answer = new int[5];
		Random r = new Random();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-------------------------------");
		System.out.println("빨간펜 수학 2자리 덧셈 문제 풀기");
		System.out.println("-------------------------------");
		System.out.println("시작합니다.");
		
		int i;
		for(i = 0; i < num1.length; i++) {
			num1[i] = 10 + r.nextInt(90);
		}
		
		for(i = 0; i < num2.length; i++) {
			num2[i] = 10 + r.nextInt(90);
		}
		
		for(i = 0; i < answer.length; i++) {
			System.out.print("문제" + (i+1) + ". " + num1[i] + "+ " + num2[i] + " = " + " 답 입력 -> ");
			answer[i] = sc.nextInt();
		}
		System.out.println("-------------------------------");
		
	}
}


// koreait.sec2020@gmail.com 월욜까지