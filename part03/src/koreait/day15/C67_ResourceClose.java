package koreait.day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class C67_ResourceClose{
	public static void main(String[] args) {
		
		String filename = "/Users/parksanghoon/Desktop/psh_std/�ڹ��׽�Ʈ2.txt";
		
		try (Scanner sc = new Scanner(new File(filename))){
				
			while(sc.hasNext()) {	
				System.out.println(sc.nextLine());
			}
			System.out.println("���� �бⰡ �Ϸ�Ǿ����ϴ�.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
// java.lang.AutoCloseable �������̽� �����ؾ���.
// Scanner Ŭ������ AutoCloseable �������̽��� �����Ǿ� �ִ�.
