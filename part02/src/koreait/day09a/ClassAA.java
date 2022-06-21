package koreait.day09a;

public class ClassAA extends ClassA {	// super(부모) 클래스는 ClassA
	
	// ClassAA의 인스턴스 메소드
	// name 필드를 상속받은 것으로 여기서 선언하지 않음
	void test() {
		setName("나연");
		System.out.println("name = " + name);
	}

}
