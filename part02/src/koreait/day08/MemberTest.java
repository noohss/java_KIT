package koreait.day08;

public class MemberTest {
	public static void main(String[] args) {
		
		Member momo = new Member();	// ���� ��Ű�� �ȿ� �־ import �ʿ� ����
		
		Member nana = new Member("�ֳ���", "nana@gamil.com");
		System.out.println("nana name = " + nana.getName());
		nana.setAge(26);
		System.out.println("naan age = " + nana.getAge());
	}
}
