package koreait.day13;

public class C56_Anonymous {
// 인터페이스 구현체를 익명 내부 클래스로 생성하기 : 1회용 클래스(익명 클래스는 현재파일에서만 사용할 수 있다.)
	public static void main(String[] args) {
		
		InterfaceA ia = new InterfaceA() {
			
			@Override
			public int methodB(int num) {
				System.out.println("i am anonymous.!!");
				return 1234;
			}
			
			@Override
			public void methodA() {
				System.out.println("익명 InterfaceA methodA");
			}
		};
		
		InterfaceB ib = new InterfaceB() {
			
			@Override
			public String name(String name) {
				return "익명 내부 클래스 : " + name;
			}
		};
		
		ia.methodA();
		ia.methodD("하이~ 인터페이스");
		InterfaceA.methodC();
		System.out.println("상수 : " + InterfaceA.SIZE);
		
		System.out.println(ib.name("테스트"));
	}
}
