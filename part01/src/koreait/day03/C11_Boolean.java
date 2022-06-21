package koreait.day03;

import java.util.Scanner;

public class C11_Boolean {
	public static void main(String[] args) {
		boolean result;
		
		result = 10 > 5;
		System.out.println("10 > 5 결과 : " + result);
		
		System.out.println("9 != 9 결과 : " + (9 != 9));
		System.out.println("9 == 9 결과 : " + (9 == 9));
		System.out.println("---논리연산 결과 확인하기 : and---");
		System.out.println(" true and true = " + (true && true));
		System.out.println(" true and false = " + (true && false));
		// 아래의 2개 논리식은 첫번째 값이 false이므로 두번째 값은 보지 않고 결과 출력
		System.out.println(" false and true = " + (false && true));
		System.out.println(" false and false = " + (false && false));
		System.out.println("---논리연산 결과 확인하기 : or---");
		// 아래의 2개 논리식은 첫번째 값이 true이므로 두번째 값은 보지 않고 결과 출력
		System.out.println(" true or true = " + (true || true));
		System.out.println(" true or false = " + (true || false));
		System.out.println(" false or true = " + (false || true));
		System.out.println(" false or false = " + (false || false));
		System.out.println("---논리연산 결과 확인하기 : not---");
		System.out.println(" not true = " + !true);    //true 값을 반대(not)값으로 바꿈
		System.out.println(" not false = " + !false);
		System.out.println();
		
		int korean, math;	// 국어 점수, 수학 점수
		
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 점수 입력 -> ");
		korean = sc.nextInt();
		
		System.out.print("수학 점수 입력 -> ");
		math = sc.nextInt();
		
		// 국어 점수와 수학 점수 모두 80점 이상인가? -> 모범 학생
		System.out.println("모범 학생 ? " + (korean >= 80 && math >= 80));
		
		// 국어 점수 또는 수학 점수 중 90점 이상이 있는가? -> 특기 학생
		System.out.println("특기 학생 ? " + (korean >= 90 || math >= 90));
		
		// 국어 점수가 20~80점이 아닌(not) 학생들은?	-> 특이 학생
		System.out.println("특이 학생 ? " + !((korean >= 20) && (korean <= 80)));
		
		// !(korean >= 20 && korean <= 80)과 같은 조건식은 korean < 20 || koran > 80
		sc.close();
	}
}

/*
 *  데이터의 기본 형식 : boolean은 true 또는 false 값을 갖는 형식. (Boolean 래퍼 클래스 있음)
 *  
 *  관계 연산 	==(동등, 같다), !=(같지 않다), >, <, >=, <= 이 연산의 결과 값은 boolean 형식
 *  논리연산 &&(and, 그리고), ||(or, 또는), !(not) 이 연산의 결과 값은 boolean 형식
 *  
 *  참고 : if, for문에서 필요한 조건식에 관계 연산 사용
 *  
 */