package koreait.day14;

import java.util.Arrays;

public class C57_ArraySortEx {
	// ���� �˰���(��������)
	public static void main(String[] args) {
		int[] nums = {34,77,19,56,45,9};
		
		for(int i = 0; i < nums.length-1; i++) { // ������ i = nums.length-2
			for(int k = i+1; k < nums.length; k++) {
				if(nums[i] > nums[k]) {
					int temp = nums[i];
					nums[i] = nums[k];
					nums[k] = temp;
				}
			}
		}
		for(int i = 0; i < nums.length; i++) {
			System.out.printf("%5d", nums[i]);
		}
	}
}
