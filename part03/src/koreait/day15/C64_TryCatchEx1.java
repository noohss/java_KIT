package koreait.day15;

import java.util.Scanner;

public class C64_TryCatchEx1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			
			String message = null;
			int cnt = message.length();
			System.out.print("���� �Է� >>> ");
//			int n = sc.nextInt();		
			int n = Integer.parseInt(sc.nextLine());
			System.out.println("����� �Է��� �� : " + n);
//		} catch (Exception e) {	// ���� ���ο� ���� Exception ������ �˻��Ѵ�.
//		} catch (NullPointerException e){
				// | ��ȣ�� bit���� or���� : Exception�� ��Ʈ������ ��
		} catch (NullPointerException | NumberFormatException e) {
			// �߻��� ���� ������ Exception ��ü�� �����ϰ� �̿� ���� ���������� e�̴�.
			System.out.println("���� �߻� : " + e.getMessage());
			System.out.println("����� ��ɿ� ������ �߻��߽��ϴ�.");

		}finally {
			sc.close();
		}
		
		System.out.println("���α׷� ��!!");
	}
}
