package koreait.day08b;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGame {
	public static void main(String[] args) {
		
		Random r = new Random();	// 난수 입력 받기
		Scanner sc = new Scanner(System.in);	// 생각한 숫자 입력 받기
		int max = 10;	// 시도횟수
		int[] triallst = new int[max];	// 10개의 정수를 저장하는 배열 선언
		
		System.out.println("숫자 맞추기 게임 시작합니다. 나 컴퓨터는 숫자를 결정했습니다.");
		System.out.println("너, 휴먼은 맞춰보세요. (101 ~ 299)");
		int numComputer = r.nextInt(199) + 101;	// 101 ~ 299 난수 받기
		int numHuman;
		int i = 0;	// 배열의 index
		
		do {
			System.out.println("생각한 숫자 입력(기회 : " + (max - i) + " +) ->"); // 기회는 10번 입력할 때마다 i만큼 빼기
			numHuman = sc.nextInt();	// 생각한 숫자 입력하기
			if(numComputer > numHuman) {	// numComputer가 받은 난수가 생각한 숫자보다 클때
				triallst[i] = numHuman;	// 입력받은 숫자를 배열에 저장
				i++;					// i는 1씩 증가
				System.out.println("아닙니다. 더 큰 값입니다.");
			}else if(numComputer < numHuman) {
				triallst[i] = numHuman;
				i++;
				System.out.println("아닙니다. 더 작은 값입니다.");
			}
			
			if(i == max) break;
			
		} while (numComputer != numHuman);
		// numComputer == numHuman이면 답을 맞춘것. -> do~while 종료
		
		if(i == max) {
			System.out.println("너 휴먼 입력 내용 : " + Arrays.toString(triallst));
			System.out.println("주어진 기회를 다 쓰셨습니다. 게임을 다시 시작하세요.!! [답은 " + numComputer + "]");
		}else {
			System.out.println("딩동댕~ 맞추셨습니다. 성공까지 시도 횟수 : " + (i+1));
		}
		sc.close();
	}
}
