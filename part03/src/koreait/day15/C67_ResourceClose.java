package koreait.day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class C67_ResourceClose{
	public static void main(String[] args) {
		
		String filename = "/Users/parksanghoon/Desktop/psh_std/자바테스트2.txt";
		
		try (Scanner sc = new Scanner(new File(filename))){
				
			while(sc.hasNext()) {	
				System.out.println(sc.nextLine());
			}
			System.out.println("파일 읽기가 완료되었습니다.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
// java.lang.AutoCloseable 인터페이스 구현해야함.
// Scanner 클래스도 AutoCloseable 인터페이스가 구현되어 있다.
