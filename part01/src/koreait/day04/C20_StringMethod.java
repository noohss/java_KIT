package koreait.day04;

public class C20_StringMethod {
	public static void main(String[] args) {
		
		String message = "hello~";		// java.lang.String (기본 패키지 클래스)
		
	
// 메소드 오버로딩(overloading) : 메소드 이름과 리턴 형식은 같고 인자값의 갯수와 형식이 다르게 정의된 것		
		int len = message.length();
		char temp = message.charAt(3);
		boolean isState = message.equals("Hello~");
		
		System.out.println("length() = " + len);	// 6
		System.out.println("charAt(3) = " + temp);	// 1
		System.out.println("equals(\"Helllo\") = " + isState);	// false
		
		System.out.println("indexOf('e') = " + message.indexOf('e'));	// 인덱스 1번
		System.out.println("indexOf(\"lo\") = " + message.indexOf("lo"));	// 인덱스 3번
		System.out.println("indexOf(\"lo\") = " + message.indexOf("ol"));	// -1 : 찾는 문자열이 없을 때
		String test = "hello~hello~";
		System.out.println("test.indexOf(\"lo\") = " + test.indexOf("lo"));		// 3번
		System.out.println("test.lastIndexof(\"lo\") = " + test.lastIndexOf("lo"));		// 일치하는 마지막 위치 9번
		
		System.out.println("message.substring(2) = " + message.substring(2));	// 부분 추출 llo~
		System.out.println("message.substring(2, 4) = " + message.substring(2, 4));	// ll, 2번부터 2개(4-2)
		// substring에서 지정할 수 있는 숫자는 0부터 ~ 6(length())까지 그 외의 값을 쓰면 IndexOutOfBounds 오류 발생
		
		System.out.println("message.substring(1, 4) = " + message.substring(1, 4));	// ell, 2번부터 2개(4-1)
	
		System.out.println("message.replace(\"11\", \"*@\") = " + message.replace("11", "*@*"));	// 치환 : he*@*o~
		System.out.println("startWith(\"H\") = " + message.startsWith("H"));	// false
		System.out.println("endWith(\"~\") = " + message.endsWith("~"));	// true
	}
	// "를 출력할 때는 \(역슬래쉬) 사용 -> " 기호는 문자열 시작으로 해석되기 때문
}

// String 클래스의 메소드는 많다. 다 외우지 않고 메소드의 이름, 인자, 리턴 형식을 참조해서 사용
/*		message.length();		// public int length() : 길이
		message.charAt(0);		// public char charAt(int index) 

		message.equals("Hello~");	// public boolean equals(Object anObject), Object는 모든타 입 가능
*/									// message가 String 타입이므로 Object는 String으로 해석		

//리턴값 형식은?
/*		message.indexOf('e');		// int
		message.indexOf("lo");	
		message.substring(2);		// String
		message.substring(2, 4);	
		message.replace("11", "*@");	// String
*/	