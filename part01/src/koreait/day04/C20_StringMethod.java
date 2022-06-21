package koreait.day04;

public class C20_StringMethod {
	public static void main(String[] args) {
		
		String message = "hello~";		// java.lang.String (�⺻ ��Ű�� Ŭ����)
		
	
// �޼ҵ� �����ε�(overloading) : �޼ҵ� �̸��� ���� ������ ���� ���ڰ��� ������ ������ �ٸ��� ���ǵ� ��		
		int len = message.length();
		char temp = message.charAt(3);
		boolean isState = message.equals("Hello~");
		
		System.out.println("length() = " + len);	// 6
		System.out.println("charAt(3) = " + temp);	// 1
		System.out.println("equals(\"Helllo\") = " + isState);	// false
		
		System.out.println("indexOf('e') = " + message.indexOf('e'));	// �ε��� 1��
		System.out.println("indexOf(\"lo\") = " + message.indexOf("lo"));	// �ε��� 3��
		System.out.println("indexOf(\"lo\") = " + message.indexOf("ol"));	// -1 : ã�� ���ڿ��� ���� ��
		String test = "hello~hello~";
		System.out.println("test.indexOf(\"lo\") = " + test.indexOf("lo"));		// 3��
		System.out.println("test.lastIndexof(\"lo\") = " + test.lastIndexOf("lo"));		// ��ġ�ϴ� ������ ��ġ 9��
		
		System.out.println("message.substring(2) = " + message.substring(2));	// �κ� ���� llo~
		System.out.println("message.substring(2, 4) = " + message.substring(2, 4));	// ll, 2������ 2��(4-2)
		// substring���� ������ �� �ִ� ���ڴ� 0���� ~ 6(length())���� �� ���� ���� ���� IndexOutOfBounds ���� �߻�
		
		System.out.println("message.substring(1, 4) = " + message.substring(1, 4));	// ell, 2������ 2��(4-1)
	
		System.out.println("message.replace(\"11\", \"*@\") = " + message.replace("11", "*@*"));	// ġȯ : he*@*o~
		System.out.println("startWith(\"H\") = " + message.startsWith("H"));	// false
		System.out.println("endWith(\"~\") = " + message.endsWith("~"));	// true
	}
	// "�� ����� ���� \(��������) ��� -> " ��ȣ�� ���ڿ� �������� �ؼ��Ǳ� ����
}

// String Ŭ������ �޼ҵ�� ����. �� �ܿ��� �ʰ� �޼ҵ��� �̸�, ����, ���� ������ �����ؼ� ���
/*		message.length();		// public int length() : ����
		message.charAt(0);		// public char charAt(int index) 

		message.equals("Hello~");	// public boolean equals(Object anObject), Object�� ���Ÿ �� ����
*/									// message�� String Ÿ���̹Ƿ� Object�� String���� �ؼ�		

//���ϰ� ������?
/*		message.indexOf('e');		// int
		message.indexOf("lo");	
		message.substring(2);		// String
		message.substring(2, 4);	
		message.replace("11", "*@");	// String
*/	