package koreait.day08;
// �ۼ��� : �ڻ���
public class Member {
	private String name;
	private String email;
	private int age;
	private int level;
	
	// Ŀ���� ������ : name, email �ʵ� �ʱ�ȭ
	public Member(String name, String email) {	// ()�ȿ��� �����Ҷ� ���޹��� ����
		this.name = name;
		this.email = email;
	}
	
	/*
	 public Member(String name){	// ������ �޼ҵ� : Ÿ�԰� ���ڰ����� ������ ������ �Ǿ�� �޼ҵ� �����ε�
	 	this.name = name;
	 }
	 
	 public Member(String email){	// ���� : 2�� ���ÿ� ���ǵ� �� ����
	 	this.name = name;
	 }
	 */
	
	//�⺻(default) ������ : ��¹� �߰�
	public Member() {
		System.out.println("name,email,age,level �ʵ�� �⺻���Դϴ�.");
		System.out.println("name = " + this.name);	// this�� �޼ҵ带 �����ϴ� ��ü
		System.out.println("age = " + this.age);
	}
	
	// setter
	public void setName(String name) {
		this.name = name;
	}
	
	// getter
	public String getName() {
		return name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	
	public void setLevel(int level) {
		this.level = level;
	}
	public int getLevel() {
		return level;
	}
}


