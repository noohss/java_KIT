package koreait.day05;

import java.util.Arrays;
import java.util.Scanner;

// 작성자 : 박상훈
public class C28_IntArrayEx {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int[] nums = new int[5];
		double avg;
		
		System.out.println("[[ 배열 요소 ]]");
		for(int i = 0; i < nums.length; i++) {
			System.out.print("[" + i + "]번째 값 입력 >>> ");
			nums[i] = sc.nextInt();
			sum += nums[i];
		} 
		System.out.println("nums = " + Arrays.toString(nums));
		System.out.println();
		
		
		System.out.println("합계 = " + sum);
		avg = sum / nums.length;
		System.out.println("평균 = " + avg);
		System.out.println();
		
		int max = maxOfArray(nums);
		System.out.println("배열 nums 최대값 max = " + max);
		int min = minOfArray(nums);
		System.out.println("배열 nums 최대값 min = " + min);
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
	
	/*	1. int 배열크기 5를 선언 이름은 nums
	 * 	2. 배열 요소의 값은 사용자 입력으로 저장
	 *  ↓
	 * 	3. 입력된 값의 합계, 평균 구하기 -> 합계는 2번에서 입력받는 for문 안에서 수식 작성하세요.
	 *  ↓
	 * 	4. 입력된 값의 최대값, 최소값을 구하는 메소드 만들기
	 * 			ㄴ maxOfArray, minOfArray : 인자는 int 배열, 반환값 형식 int
	 */
	
	// max, min 변수를 각각 배열의 0번 요소값으로 초기화 한다.
	// 배열요소 1번부터 마지막 요소까지 max, min과 순서대로 비교해서 
	// max가 그 값보다 작으면 (min이 그 값보다 크면) max(min) 값을 배욜요소값으로 변경
	// -> 비교가 끝나면 최종 max, min 결정
}
