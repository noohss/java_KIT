package koreait.day07;

// C39 ��ȣ ����
public class Student {
	
	int no;
	String name;
	int grade;
	Score score;		// Score Ŭ���� ��ü�� �ʵ�(�������)�� ���� ��.
	
	// ���ڷ� ���޹��� ���� ��������(�ʵ� - ��ü�� Ư���� ��Ÿ���� �������)�� ����.
	void setData(String name, int grade) {
		this.name = name;
		this.grade = grade;
	}
	
	
	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", grade=" + grade + ", score=" + score + "]";
			// score�� score.toString()
	}
	
	
}
