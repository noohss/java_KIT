package koreait.day15;

import java.io.File;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class C66_FlieReadTest {
	public static void main(String[] args) {
		
//		String filename = "/Users/parksanghoon/Desktop/psh_std/자바테스트.txt";
		String filename = "/Users/parksanghoon/Desktop/psh_std/자바테스트.txt";
		
		File file = new File(filename);
		
		// PrintWriter : 출력 기능을 갖는 클래스
// Unhandled exception type FileNotFoundException : 오류의 가능성이 있으므로 try ~ catch 필요
		Scanner sc = null;
		try {
			sc = new Scanner(file);	
//			System.out.println("파일에서 읽은 내용 : " + sc.nextLine());
//			System.out.println("파일에서 읽은 내용 : " + sc.nextLine());
//			System.out.println("파일에서 읽은 내용 : " + sc.nextLine());
			
			
			while(sc.hasNext()) {	// 구분자 엔터를 기준으로 다음 데이터가 있으면 true
				System.out.println(sc.nextLine());
			}
			System.out.println("파일 읽기가 완료되었습니다.");
		} catch (FileNotFoundException e) {
			// 입력기능에는 파일이 없으면 Exception이 발생합니다.
			System.out.println("사용자 오류 발생 : " + e.getMessage());
		}finally {
			if(sc!=null) sc.close();
		}
	}

}
// try ~ catch 자원해제 방법을 finally 안쓰고 java 7 버전부터 다른 구문 형식이 가능.
//		ㄴ 관련된 인터페이스가 무엇인지도 찾아보기
