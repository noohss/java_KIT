package koreait.day14;

import java.util.Random;

public class C61_FunctionATest {
	public static void main(String[] args) {
		
		// 1) �͸�Ŭ���� : �߻�޼ҵ��� ���� �������.
		FunctionA fa = new FunctionA() {
			
			@Override
			public int methodA(int a, int b) {
				return a*b;
			}
		};
		
		System.out.println(fa.methodA(23, 11));
		
		// 2) ���ٽ� : �߻�޼ҵ尡 1���� ���� ����. �� �Լ��� �������̽������� ǥ�� ����.(�޼ҵ� �̸��� ������ ����)
		fa = (int a, int b) -> {
				return a+b;
		};
		
		System.out.println(fa.methodA(23, 11));
		
		fa = (int max, int min) -> {
			// min~ max ������ ������ ���� �����մϴ�.
			Random r = new Random();
			System.out.print("���� =");
			return r.nextInt(max-min+1)+min;
		};
		System.out.println(fa.methodA(99, 11));
	}
}
