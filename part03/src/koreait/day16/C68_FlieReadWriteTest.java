package koreait.day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

// Exception ó�� ����� ���� �޼ҵ忡�� ���ǵ� �� �ٸ� ��� : 1) 2)
public class C68_FlieReadWriteTest {
	// main �޼ҵ尡 throws Exception�Ѵٸ� jvm���� �ѱ�. ó�������� printStackTrace����� ����
	public static void main(String[] args) throws FileNotFoundException{
		
		String filename = "/Users/parksanghoon/Desktop/psh_std/�ڹ��׽�Ʈ0617.txt";
		
		try {
			fileWrite2(filename);
//			filename = "/Users/parksanghoon/Desktop/psh_std/�ڹ��׽�Ʈ0618.txt";	// ���� ���� �׽�Ʈ�� 
			fileRead(filename);
			
		} catch (FileNotFoundException e) {
			System.out.println("����� ���� ���� : " + e.getMessage());
			System.out.println("������ �����ϴ��� Ȯ���ϼ���.");
		}
		
	}
	public static void fileWrite(String filename) {
		
		File file = new File(filename);
		
		PrintWriter pw = null;
// ������ �޼ҵ� java.io.PrintWriter.PrintWriter(File file) throws FileNotFoundException
		try {
			pw = new PrintWriter(file);
			pw.println("��� 90 89 82");
			pw.println("���� 89 90 82");
			pw.println("���� 82 89 90");
			System.out.println("���� ����� �Ϸ�Ǿ����ϴ�.");	
		} catch (FileNotFoundException e) {
			// ��� ��ɿ��� ������ ������ �ڵ����� ������ ���������.
			System.out.println("����� ���� �߻� : " + e.getMessage());
		}finally {
			pw.close();
		}
	}
	// ���2 : throws Ű����� �ش� Exception ó���� ȣ���� ������ �ѱ��.(���ѱ��)
	//		  throws �ڿ�, �� �����ؼ� �������� ������ �� �ֽ��ϴ�.
	//		  Exception ó���ؾ� �� �޼ҵ尡 ���� ���ǵǰ� ���� �� �Ѱ����� ��� ó���� �� �ֽ��ϴ�.
	public static void fileWrite2(String filename) throws FileNotFoundException {
		
	File file = new File(filename);
		
		PrintWriter pw = null;
		pw = new PrintWriter(file);
			pw.println("��� 90 89 82");
			pw.println("���� 89 90 82");
			pw.println("���� 82 89 90");
			System.out.println("���� ����� �Ϸ�Ǿ����ϴ�.");	
			pw.close();
	}
	
	public static void fileRead(String filename) throws FileNotFoundException{
		
		File file = new File(filename);
		Scanner sc = new Scanner(file);
		while(sc.hasNext()) {
			System.out.println(sc.nextLine());
		}
		sc.close();
	}
		
		
}
