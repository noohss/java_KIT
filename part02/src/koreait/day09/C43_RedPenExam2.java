package koreait.day09;

import java.util.Random;
import java.util.Scanner;

// C42번을 MathProblem 클래스를 사용하는 것으로 바꾸기 : 연산은 덧셈.
public class C43_RedPenExam2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int size = 5;	// 문제 갯수
		int max_size = MathProblem.max_size;	// size 변수 값이 max_size를 초과하는지 검사 추가.
		
		MathProblem[] problems = new MathProblem[size];
		// 모든 문제 번호 저장
		
		// 배열의 타입은 MathProblem 객체 참조형 : n1, n2, op, isCorrect
		
		int ans;		
		int cnt = 0;
		System.out.println("------------------------------------------");
		System.out.println("빨간펜 수학 2자리 덧셈 문제 풀기");
		System.out.println("------------------------------------------");
		System.out.println("시작합니다.");
		for(int i = 0; i < size; i++) {
			MathProblem temp = new MathProblem('+');
			temp.makeProb();		// n1, n2값이 객체의 필드로 생성.
			
//			System.out.print("문제" + (i+1) + ". " + temp.getN1() + "+ " + temp.getN2() + " = 답입력 -> ");
			System.out.print("문제" + (i+1) + ". " + temp.problem() + " 답 입력 -> ");
			ans = sc.nextInt();
			if(ans == temp.showAnswer()) {	// 맞은 갯수 count
				cnt++;		
				temp.setCorrect(true);
			}
			problems[i] = temp;
		}
		System.out.println("------------------------------------------");
		System.out.println("채점 합니다. 맞은 갯수 " + cnt + " ( " + (cnt*100/size) + " 점)"); // 100/size는 1문제당 점수
		System.out.println("::::: 틀린 문제 정답 보기 :::::");
/*	
		for(int i = 0; i < problems.length; i++)
//			if(problems[i].isCorrect() == false) // 틀렸을 때
			if(!problems[i].isCorrect()) // problems[i].isCorrect()이 거짓이면 !연산으로 참으로 바뀐다.
				System.out.println("문제" + (i+1) + ". " + problems[i].problem() + problems[i].showAnswer());
*/
// 향상된 for(for each)으로 변경
		for(MathProblem temp : problems)
			if(!temp.isCorrect())
				System.out.println(temp.problem() + temp.showAnswer());


// 추가 : 사용자가 입력한 ans를 저장해서 오답 출력시 같이 보여주고 싶다면?
	}
}
