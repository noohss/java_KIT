package koreait.day05;

import java.util.Arrays;

public class C27_IntArray {
	public static void main(String[] args) {
		
		// �迭����
		int[] arr1 = {67,45,98,12,45,66,95};	// �ʱⰪ ����
		int[] arr2 = new int[7];				// �迭�� ũ�⸸ ����
		
		
		// �迭 ��Ұ� 1�� ���
		System.out.println("\n�迭 ��Ұ� 1�� ���(�ε��� 3��)");
		System.out.println("arr1[3] = ? " + arr1[3]);	// 12
		System.out.println("arr2[3] = ? " + arr2[3]);	// 0
		
		System.out.println("\n�迭 ��Ұ� 1�� ����(�ε��� 3��)");
		arr1[3] = 999;
		arr2[3]	 = 999;
		
		// ����� �迭�� ���� ��� ����� �� �ִ� ���ڿ��� ��ȯ��Ű�� �޼ҵ�
		String temp = Arrays.toString(arr1);	// toString�� static �޼ҵ�, �޼ҵ��� ��������
		System.out.println();		
		System.out.println("arr1 : " + temp);
		System.out.println("arr2 : " + Arrays.toString(arr2));
		System.out.println();
		
		// ��¿��� : arr1[0] = 67 �������� ��� ���� ����ϰ� �ʹ�. -> for��
		System.out.println("for������ �迭��Ұ� ���(arr1)");
		for(int i = 0; i < 7; i++) {
			System.out.println("arr1["+ i +"] = " + arr1[i]);
		}
		System.out.println();
		
		System.out.println("for������ �迭��Ұ� ���(arr2)");
		for(int i = 0; i < arr2.length; i++) {		// *** �迭�� �迭����� ����(ũ��)�� ���� �ִ� �ʵ� length�� �ִ�.
			String t = String.format("arr2[%d] = %d", i, arr2[i]);	// format�� �����ؼ� ���ڿ��� ����
			System.out.println(t);
//			System.out.printf("arr2[%d] = %d\n", i, arr2[i]);
		}
		System.out.println();
		
		System.out.println("�迭�� ũ��(����Ʈ)");
		System.out.println("arr1 �迭 : " + arr1.length * Integer.BYTES+ "����Ʈ");
		System.out.println("arr1 �迭 : " + arr2.length * Integer.BYTES+ "����Ʈ");
		System.out.println();
		
		System.out.println("���� ���� �޼ҵ�� �迭�� ���");
		arrayPrint(arr1, "arr1");
		System.out.println();
 		arrayPrint(arr2, "arr2");

	}
	
	public static void arrayPrint(int[] array, String name) {	// ���� : int �迭, String
		// int �迭�� ���ڷ� ���޹޾Ƽ� arr1[0] = 67 �������� ���� ���
		
		for(int i = 0; i < array.length; i++) {		// *** �迭�� �迭����� ����(ũ��)�� ���� �ִ� �ʵ� length�� �ִ�.
			String t = String.format("%s[%d] = %d", name, i, array[i]);	// format�� �����ؼ� ���ڿ��� ����
			System.out.println(t);
		}
	}
	
}
