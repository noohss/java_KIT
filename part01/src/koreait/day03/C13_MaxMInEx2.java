package koreait.day03;

import java.util.Scanner;

public class C13_MaxMInEx2 {
	public static void main(String[] args) {
	
// 작성자 : 박상훈
		int n1;
		int n2;
		int n3;
		int max;
		int min;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("n1 >>> ");
		n1 = sc.nextInt();
		System.out.print("n2 >>> ");
		n2 = sc.nextInt();
		System.out.print("n3 >>> ");
		n3 = sc.nextInt();
		System.out.printf("n1=%d\t n2=%d\t n3=%d\n", n1, n2, n3);
		
		if(n1 > n2) {
			max = n1;		// max는 임시값
			min = n2;
		}else {
			max = n2;		// max는 임시값
			min = n1;
		}
		
		if(max < n3) max = n3;	// 임시 max값 보다 남은 1개 n3이 더 클 때만
		if(min > n3) min = n3;	// 임시 min값 보다 남은 1개 n3이 더 작을 때만
		
		//위와 동일
//		if(max < n3) {
//			max = n3;	// 임시 max값 보다 남은 1개 n3이 더 클 때만
//		}else if(min > n3) {
//			min = n3;
//		}
		
		System.out.println("max = " + max + ", min = " + min);

	}
}
