package koreait.day02;

// 변수 : Variable
public class C05_IntegerVar {
	public static void main(String[] args) {		// main메소드 시작
		/* 1. main 메소드 안에서만 사용하는 지역변수를 선언합니다.
		 * 2. 기본형 (primitive) 데이터 타입 : 정수형식
 		 * 		byte, short, int, long 키워드(역할이 정해진 단어)
		 */
		
		byte n1;		// byte 형식의 데이터를 저장할 공간
		short n2;		
		int n3;			
		long n4;		
		
		// 변수 선언 동시에 값을 대입
		byte m1 = 100;
		short m2 = 100;
		int m3 = 100;
		long m4 = 100;
		
//		System.out.println(n1);	// 오류 : 값이 없는 변수
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
		
		// 값의 대입(=)
		n1 = 123;	// 대입문 : 오른쪽 값/수식/변수가 왼쪽 변수로 대입.	
					// 123은 4바이트 리터럴. byte와 short는 별도 리터럴 표기 방식이 없다.
					// 자동으로 값이 넘치지 않으면 1바이트 또는 2바이트로 크기가 바뀌어 저장.
		n1 = 99;
//		n1 = 999;	// 오류 : + 127보다 큰 값
		n2 = 29999;
//		n2 = - 40000;	// 오류 : - 32767보다 작은 값
		n3 = - 40000;		
		n3 = 123456789;
//		n3 = 1234567890123;	// 오류 : + 2147483647보다 큰 값
//		n4 = 1234567890123;	// 오류 : 1234567890123 리터럴은 int 리터럴이므로 표현 오류
		n4 = 123;			// 오류 x : 123 리터럴은 int 리터럴 표현 범위.
		n4 = 1234567890123L;	// long 리터를 표시 : 값 뒤에 L 또는 l
		
		System.out.println("변수 n1 = " + n1);
		System.out.println("변수 n2 = " + n2);
		System.out.printf("변수 %s = %d \n","n3", n3);
		System.out.printf("변수 %s = %d \n","n4", n4);
		
		
	}	// main 메소드 끝
	// 대입문 또는 리터럴을 표시할 때 값의 범위가 넘어가면 overflow(오버플로우)
}

/* 변수 : 메모리에 저장된 값 중에서 변경할 수 있는 데이터를 말합니다.
 *    변수는 프로그램이 실행되는 동안에 임시로 사용하는 메모리 공간입니다.
 *	    데이터가 저장된 메모리에 접근하기 위해서 변수명(식별자 - 중복된 이름 사용 안됨)을 부여합니다.
 *    변수 선언한다 (변수명과 데이터 형식을 지정하는 것.) -> 메모리에 공간 할당 됩니다.
 */
