package koreait.day08;

public class MemberTest {
	public static void main(String[] args) {
		
		Member momo = new Member();	// 같은 패키지 안에 있어서 import 필요 없음
		
		Member nana = new Member("최나나", "nana@gamil.com");
		System.out.println("nana name = " + nana.getName());
		nana.setAge(26);
		System.out.println("naan age = " + nana.getAge());
	}
}
