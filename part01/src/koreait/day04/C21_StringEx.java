package koreait.day04;

import java.util.Scanner;

public class C21_StringEx {
	public static void main(String[] args) {
	// spring0100@gmail.com	(O), spring0100@abcgmail.com (X)
		/*  ���� �̸��� ������ üũ�ϴ� ��� ���� 
		 *  1. @ ��ȣ�� 1�� ���ԵǾ�� �մϴ�.	(�޽��� : �̸��� ������ �ƴմϴ�.)
		 *  		�� indexof �� -1�� �ƴϰ� indexof �� lastindexof �� ���� ���ΰ�?
		 *  
		 *  2. 1���� ���� �� @ �ڿ��� gmail.com �̾�� �մϴ�. (�޽��� : ������ �̸��� Ʋ���ϴ�.)
		 *  		�� '@' �� indexof �� ���ؼ� �� �ں��� ������ substring ������ ���ڿ��� equals ��
		 *  
		 *  3. 2���� ���� �� @ �ձ����� ���ڿ�(�����̸�)�� �����մϴ�.
		 *  		�� '@' �� indexof �� ���ؼ� ó�� ���� '@' ���� ������ ���ڿ� substring ����
		 *  
		 *  4. 3���� �����̸��� 6���� �̻��̾�� �մϴ�.
		 *  		�� 3���� ���ڿ��� length() �� 6���� ��
		 *  
		 *  5. 3���� �����̸����� Ư����ȣ $,%�� ���ԵǸ� �ȵ˴ϴ�. 
		 *   		�� indexof('$') , indexof('%') �� ��� -1�� �ƴϸ� �����ϴ� ��ȣ ����
		 */

		
		Scanner sc = new Scanner(System.in);
		String email;
		boolean isValid = true;
		
		System.out.print("����� �̸��� �Է��ϼ���. >>> ");
		email = sc.nextLine();		// ���ڿ� �Է�
		
		// �Է��� email�� ó�� ���� 1, 2, 4, 5�� �ش����� ������ �޽��� ����ϰ� isValid ������ false�� ��. --> isValid ���
		int idx = email.indexOf('@');
		String account = email.substring(0, '@');
		String domain = email.substring('@', 20);
		System.out.println(idx);
		System.out.println(account);
		System.out.println(domain);
		
		if(email.indexOf('@') != -1 && email.indexOf('@') == email.lastIndexOf('@')) {
		}else {
			System.out.println("�̸��� ������ �ƴմϴ�.");
			isValid = false;
		}
		
	}
}

// �⺻�� ����������, ��¹�, if, String Ŭ���� ,�޼ҵ�

