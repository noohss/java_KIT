package koreait.day17;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

import koreait.day16.Word;
// 작성자 : 박상훈
public class MyDictionaryV2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Scanner ssc = new Scanner(System.in);
		List<Word> mywords = new ArrayList<>();	// ***mydic을 mywords로 바꿔서 구현해보기***
		try {
			System.out.println("파일에 저장 할까요? (y or n)");
			if(ssc.nextLine().equals("y"))
			// 파일에서 기존 내용 일겅오고 그 내용을 mywords 리스트에 저장
				read(mywords, "/Users/parksanghoon/Desktop/psh_std/나의 영한사전.txt");
			else
				System.out.println("파일을 새로 만듭니다.");
		} catch (FileNotFoundException e1) {
			System.out.println("파일 읽는 중에 오류 발생하였습니다. - " + e1.getMessage());
		}
		System.out.println("1.단어저장    2. 단어검색    3. 전체보기    4. 레벨로 검색    5. 프로그램 종료");
		String select;
		String eng,kor;
		int level;
		
		boolean run = true;
		
		
		while(run) {
			System.out.print("선택 -> ");
			select = sc.nextLine();
			switch (select) {
				case "1":
					System.out.print("English -> ");
					eng = sc.nextLine();
					System.out.print("Korean -> ");
					kor = sc.nextLine();
					System.out.print("레벨 -> ");
					Word temp = new Word(eng, kor);
					level = Integer.parseInt(sc.nextLine());
					temp.setLevel(level);
					mywords.add(temp);
					continue;
				case "2":
					System.out.print("검색 단어 English -> ");
					eng = sc.nextLine();
					for(Word w : mywords)
						if(w.getEnglish().equals(eng))
							System.out.println("단어장 검색했습니다. 결과 => " + w);
					break;
				case "3":
//					System.out.println("단어장 전체보기 : " + mywords);
					all(mywords);
					continue;
				case "4":
					System.out.println("검색할 레벨 입력(1~3) -> ");
					int no = Integer.parseInt(sc.nextLine());
					level(mywords,no);
				case "5":
					run = false;
					break;
				default:
					System.out.println("숫자를 잘못 입력했습니다. 1~5중 다시 선택");
					continue;
			}
		}
		
		try {
			System.out.println("파일에 저장 할까요? (y or n)");
				if(ssc.nextLine().equals("y"))
					// mywords 리스트의 내용을 파일에 저장
					save(mywords, "/Users/parksanghoon/Desktop/psh_std/나의 영한사전.txt");
				else
					System.out.println("파일이 저장되지 않았습니다.");
		} catch (FileNotFoundException e) {
			System.out.println("파일 저장 중에 오류가 생겼습니다. - " + e.getMessage());
			
		}	
		System.out.println("단어장을 종료합니다.");
		
	}

	private static void save(List<Word> mywords, String filename) throws FileNotFoundException{
		// 파일에 출력하기		
		File file = new File(filename);
		PrintWriter pw = new PrintWriter(file);
		for(Word w : mywords)
			pw.println(w);
		
		pw.close();
		System.out.println("파일 저장이 완료되었습니다.");
	}

	private static void read(List<Word> mywords, String filename) throws FileNotFoundException {
		File file = new File(filename);
		Scanner sc = new Scanner(file);
		StringTokenizer stk = null;
		while(sc.hasNext()) {
			String temp = sc.nextLine();	// 파일에서 1줄 읽어 온것 저장
			System.out.println(temp.substring(0, temp.indexOf("(")));
			// 위의 결과를 참고로 StringTokenizer로 Word 객체 만들고 mywords 리스트에 추가하기
			stk = new StringTokenizer(temp.substring(0, temp.indexOf("(")));
			
			mywords.add(new Word(stk.nextToken(),	// english 필드값 
					 stk.nextToken(),	// korean 필드값
					 Integer.parseInt(stk.nextToken())));// level 필드값 
		}
		sc.close();
		System.out.println("파일 읽어 오기 완료되었습니다.");
	}

	private static void level(List<Word> mywords, int no) {
		for(Word w : mywords)
			if(w.getLevel() == no)
				System.out.println(w);
	}

	private static void all(List<Word> mywords) {	// mywords의 참조값 전달받아 동일한 객체를 가리킵니다.
		mywords.sort(new Comparator<Word>() {
			
			@Override
			public int compare(Word o1, Word o2) {
				// TODO Auto-generated method stub
				return o1.getEnglish().compareTo(o2.getEnglish());
			}
		});
		
		System.out.println(String.format("%-20s %-20s\t %-10s", "English", "Korean", "Level"));
		System.out.println("------------------------------------------------------------------");
		for(Word w : mywords) {
			System.out.println(String.format("%-20s %-20s\t %-10s", w.getEnglish(), w.getKorean(), w.getLevel()));
		}
	}
}
