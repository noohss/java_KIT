package koreait.day13a;

// ��ü�� �� �ι�° ��� : 
public class User implements Comparable<User>{
	private String name;
	private int age;
	
	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	// Comparable �������̽� �߻�޼ҵ� ����
	@Override
	public int compareTo(User o) {		// ���簴ü�� age�� ���ڰ� age ��
		Integer o1 = this.age;
		Integer o2 = o.getAge();
		return o1.compareTo(o2) ;	// ��������
	}

	// Object Ŭ���� toStirng() ������
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
	
	
}
