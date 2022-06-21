package koreait.day15;

import java.io.File;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class C66_FlieReadTest {
	public static void main(String[] args) {
		
//		String filename = "/Users/parksanghoon/Desktop/psh_std/�ڹ��׽�Ʈ.txt";
		String filename = "/Users/parksanghoon/Desktop/psh_std/�ڹ��׽�Ʈ.txt";
		
		File file = new File(filename);
		
		// PrintWriter : ��� ����� ���� Ŭ����
// Unhandled exception type FileNotFoundException : ������ ���ɼ��� �����Ƿ� try ~ catch �ʿ�
		Scanner sc = null;
		try {
			sc = new Scanner(file);	
//			System.out.println("���Ͽ��� ���� ���� : " + sc.nextLine());
//			System.out.println("���Ͽ��� ���� ���� : " + sc.nextLine());
//			System.out.println("���Ͽ��� ���� ���� : " + sc.nextLine());
			
			
			while(sc.hasNext()) {	// ������ ���͸� �������� ���� �����Ͱ� ������ true
				System.out.println(sc.nextLine());
			}
			System.out.println("���� �бⰡ �Ϸ�Ǿ����ϴ�.");
		} catch (FileNotFoundException e) {
			// �Է±�ɿ��� ������ ������ Exception�� �߻��մϴ�.
			System.out.println("����� ���� �߻� : " + e.getMessage());
		}finally {
			if(sc!=null) sc.close();
		}
	}

}
// try ~ catch �ڿ����� ����� finally �Ⱦ��� java 7 �������� �ٸ� ���� ������ ����.
//		�� ���õ� �������̽��� ���������� ã�ƺ���
