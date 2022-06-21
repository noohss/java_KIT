package koreait.day12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

import day13re.Word;


// �ۼ��� : �ڻ���
public class C52_MyDictionary {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		TreeMap<String, String> map = new TreeMap<>();	// ���� �˻��� ������ Map�� ���� : ������ �Ǵ� Map
		List<Word> mywords = new ArrayList<>();
		String select, eng, kor;
		int level;
		System.out.println("���� ��� -> 1. �ܾ�����    2. �ܾ�˻�     3. �ܾ��庸��    4. ���α׷� ������");
		boolean run = true;
		
		while(run) {
			System.out.print("���� -> ");
			select = sc.nextLine();
			switch (select) {
			case "1":
				System.out.print("English -> ");
				eng = sc.nextLine();
				System.out.print("korean -> ");
				kor = sc.nextLine();
				System.out.println("���� -> ");
				Word temp = new Word(eng, kor);
				level = Integer.parseInt(sc.nextLine());
				temp.setLevel(level);
				mywords.add(temp);
				continue;

			case "2":
				System.out.print("�˻� �ܾ� English -> ");
				eng = sc.nextLine();
				System.out.println("�ܾ��� �˻��߽��ϴ�. ��� => " + map.get(eng));
				continue;
			
			case "3":
				System.out.println("�ܾ��� ��ü���� :" + map);
				continue;
			
			case "4":
				run = false;
				break;
			default :
				System.out.println("�߸� �Էµ� �����Դϴ�. 1 ~ 4�� �����ϼ���.");
				break;
			}
		}
		System.out.println("���α׷��� �����մϴ�.");
	} // ���� : ���� ������ �Է��� �޾ƾ��Ѵٸ� ���ڿ� nextLine() �޾Ƽ� ������ ��ȯ.
	  // 	int score = Integer.parseInt(sc.nextLine());
	  // 	���� : nextInt()�� ���͸� ó������ �ʾƼ� ������ ������ nextLine()���� ���޵Ǿ� �Է� �帧�� ���ذ� ��.
	  // 	��� : �� �ҽ� ���Ͽ��� nextInt()�� ��� �Ǵ� nextLine()�� ����Ѵ�.
}
