package koreait.day09b;

import koreait.day09a.ClassA;

public class ClassAB extends ClassA {
	// 과연 이 클래스가 필드, 메소드 상속 받았을까? - ClassA의 private, default 접근한정자 요소는 상속 못받음.
	
	public void test() {
//		System.out.println("name = " + name); // ((오류)) name필드 접근한정자는 디폴트 : 다른패키지에서 사용 못함
		title = "momo";		// 상속받은 title필드 : 다른 패키지이지만 protected 접근 한정자로 자식클래스는 허용. 
		System.out.println("title = " + title);
		setName("신비");
		System.out.println("name = " + getName());
	}

}
