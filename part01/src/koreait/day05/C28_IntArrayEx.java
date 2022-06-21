package koreait.day05;

import java.util.Arrays;
import java.util.Scanner;

// �ۼ��� : �ڻ���
public class C28_IntArrayEx {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int[] nums = new int[5];
		double avg;
		
		System.out.println("[[ �迭 ��� ]]");
		for(int i = 0; i < nums.length; i++) {
			System.out.print("[" + i + "]��° �� �Է� >>> ");
			nums[i] = sc.nextInt();
			sum += nums[i];
		} 
		System.out.println("nums = " + Arrays.toString(nums));
		System.out.println();
		
		
		System.out.println("�հ� = " + sum);
		avg = sum / nums.length;
		System.out.println("��� = " + avg);
		System.out.println();
		
		int max = maxOfArray(nums);
		System.out.println("�迭 nums �ִ밪 max = " + max);
		int min = minOfArray(nums);
		System.out.println("�迭 nums �ִ밪 min = " + min);
	}

	public static int maxOfArray(int[] array) {
		int max = array[0];
		
		for(int i = 0; i < array.length; i++) {
			if(max < array[i]) {
				max = array[i];
			}
		}
		return max;
	}
	
	public static int minOfArray(int[] array) {
		int min = array[0];
		
		for(int i = 0; i < array.length; i++) {
			if(min > array[i]) {
				min = array[i];
			}
		}return min;
	}
	
	/*	1. int �迭ũ�� 5�� ���� �̸��� nums
	 * 	2. �迭 ����� ���� ����� �Է����� ����
	 *  ��
	 * 	3. �Էµ� ���� �հ�, ��� ���ϱ� -> �հ�� 2������ �Է¹޴� for�� �ȿ��� ���� �ۼ��ϼ���.
	 *  ��
	 * 	4. �Էµ� ���� �ִ밪, �ּҰ��� ���ϴ� �޼ҵ� �����
	 * 			�� maxOfArray, minOfArray : ���ڴ� int �迭, ��ȯ�� ���� int
	 */
	
	// max, min ������ ���� �迭�� 0�� ��Ұ����� �ʱ�ȭ �Ѵ�.
	// �迭��� 1������ ������ ��ұ��� max, min�� ������� ���ؼ� 
	// max�� �� ������ ������ (min�� �� ������ ũ��) max(min) ���� ����Ұ����� ����
	// -> �񱳰� ������ ���� max, min ����
}
