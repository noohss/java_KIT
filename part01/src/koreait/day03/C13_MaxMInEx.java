package koreait.day03;

import java.util.Scanner;

public class C13_MaxMInEx {
	public static void main(String[] args) {
	
// 작성자 : 박상훈
		int n1;
		int n2;
		int n3;
	
		Scanner sc = new Scanner(System.in);
		
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		int max, min;
		
		if(n1 > n2) {
			max = n1;
			min = n2;
		}else {
			min = n1;
			max = n2;
		}
		
		if(max < n3) {
			max = n3;
		}else {
			min = n3;
		}
		
		System.out.println("가장 큰 값은 ? " + max);
	}
}
