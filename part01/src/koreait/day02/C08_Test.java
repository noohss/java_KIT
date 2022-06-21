package koreait.day02;

public class C08_Test {
	public static void main(String[] args) {
		int width = 23;
		int height = 19;
		int boxArea = width*height;
		
		System.out.println("[[사각형 도형의 넓이 구하기]]");
		System.out.println("가로 : " + width + " ㎝");
		System.out.println("세로 : " + height + " ㎝");
		System.out.println("넓이를 구했습니다. -> " + boxArea + " ㎠");
		System.out.println();
		
		
		double harf = 23.230;
		double round = 2 * 3.14 * harf;
		double circleArea = 3.14 * harf * harf;
		System.out.println("[[원 도형의 넓이와 둘레 구하기]]");
		System.out.printf("반지름 : %.3f ㎝\n", harf);
		System.out.printf("둘레를 구했습니다. -> %.3f ㎝\n", round);
		System.out.printf("넓이를 구했습니다. -> %.3f ㎝\n", circleArea);
		
		
		// final 테스트 
//				변수 선언 앞에 final(최종의) 키워드를 붙이면 값을 변경하지 못한다.
		
		final int test = 123;	// 값을 변경 못하는 상수입니다.
		System.out.println("test = " + test);
		
//		test = 456;	// 오류 : final로 선언됨.
	}
}
