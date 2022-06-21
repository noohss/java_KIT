package koreait.day12;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

// C43�� ���� ����Ʈ�� �����ϱ� // �ۼ��� : �ڻ���
public class C48_MathList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int size = 5;
		
		ArrayList<MathProblem> problem = new ArrayList<>();
		
		int ans;
		int cnt = 0;
		System.out.println("------------------------------------------");
		System.out.println("������ ���� 2�ڸ� ���� ���� Ǯ��");
		System.out.println("------------------------------------------");
		System.out.println("�����մϴ�.");
		for(int i = 0; i < size; i++) {
			MathProblem temp = new MathProblem('+');
			temp.makeProb();
			
			System.out.print("����" + (i+1) + ". " + temp.problem() + " �� �Է� -> ");
			ans = sc.nextInt();
			if(ans == temp.showAnswer()) {
				cnt++;
				temp.setCorrect(true);
			}
			problem.add(temp);
		}
		System.out.println("------------------------------------------");
		System.out.println("ä�� �մϴ�. ���� ���� " + cnt + " ( " + (cnt*100/size) + " ��)"); // 100/size�� 1������ ����
		System.out.println("::::: Ʋ�� ���� ���� ���� :::::");
		
		for(int i = 0; i < problem.size(); i++) {
			if(problem.get(i).isCorrect() == false)
				System.out.println("����" + (i+1) + ". " + problem.get(i).problem() + problem.get(i).showAnswer());
		}
	}
}
