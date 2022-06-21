package koreait.day04;

import java.util.Scanner;

public class C18_ReviewEx {
	public static void main(String[] args) {
		
		String best;	// 특기 과목명 참조할 변수
		int korean;
		int english;
		int science;
		int max;
		
		System.out.println("[[성적 집계 : 평균과 총점 구하기]]");
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 -> ");
		korean = sc.nextInt();
		System.out.print("수학 -> ");
		english = sc.nextInt();
		System.out.print("과학 -> ");
		science = sc.nextInt();
		System.out.println();
		System.out.println(">> 처리되었습니다.");
		
		int sum = korean + english + science;
		double avg = (double)sum / 3;
		int subject = 3;
		
		System.out.println("총점 : " + sum);
		System.out.printf("평균 : %d %.2f , 과목수 : %d\n", (int)avg, avg, subject);
		
		if(korean > english) {
			max = korean;
			best = "국어";
		}else {
			max = english;
			best = "영어";
		}
		if(max < science) {
			max = science;
			best = "과학";
		}
		System.out.printf("이 학생의 특기과목은 . %s (%d) . 입니다.", best, max);	// 3개의 점수중 가장 높은 점수의 과목 출력
		
		sc.close();
	}
}
