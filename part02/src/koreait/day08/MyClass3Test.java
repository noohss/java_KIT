package koreait.day08;

import java.util.Calendar;

public class MyClass3Test {
	public static void main(String[] args) {
		
//		MyClass3 my3 = new MyClass3Test();	// ���� : ������ private ������
		MyClass3 my3 = MyClass3.getINstance();		// �̸� ������� ��ü�� ����...
		my3.test();		// ��ü�� �ν��Ͻ� �޼ҵ�
		MyClass3.staticTest();	// static �޼ҵ�
		
		Calendar today = Calendar.getInstance();
		System.out.println(today);
	}
}
