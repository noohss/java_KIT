package koreait.day12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

import day13re.Word;


// 작성자 : 박상훈
public class C52_MyDictionary {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		TreeMap<String, String> map = new TreeMap<>();	// 이진 검색한 구조로 Map을 생성 : 정렬이 되는 Map
		List<Word> mywords = new ArrayList<>();
		String select, eng, kor;
		int level;
		System.out.println("선택 기능 -> 1. 단어저장    2. 단어검색     3. 단어장보기    4. 프로그램 끝내기");
		boolean run = true;
		
		while(run) {
			System.out.print("선택 -> ");
			select = sc.nextLine();
			switch (select) {
			case "1":
				System.out.print("English -> ");
				eng = sc.nextLine();
				System.out.print("korean -> ");
				kor = sc.nextLine();
				System.out.println("레벨 -> ");
				Word temp = new Word(eng, kor);
				level = Integer.parseInt(sc.nextLine());
				temp.setLevel(level);
				mywords.add(temp);
				continue;

			case "2":
				System.out.print("검색 단어 English -> ");
				eng = sc.nextLine();
				System.out.println("단어장 검색했습니다. 결과 => " + map.get(eng));
				continue;
			
			case "3":
				System.out.println("단어장 전체보기 :" + map);
				continue;
			
			case "4":
				run = false;
				break;
			default :
				System.out.println("잘못 입력된 선택입니다. 1 ~ 4중 선택하세요.");
				break;
			}
		}
		System.out.println("프로그램을 종료합니다.");
	} // 참고 : 정수 데이터 입력을 받아야한다면 문자열 nextLine() 받아서 정수로 변환.
	  // 	int score = Integer.parseInt(sc.nextLine());
	  // 	이유 : nextInt()는 엔터를 처리하지 않아서 다음에 나오는 nextLine()에게 전달되어 입력 흐름에 방해가 됨.
	  // 	결론 : 한 소스 파일에서 nextInt()만 사용 또는 nextLine()만 사용한다.
}
