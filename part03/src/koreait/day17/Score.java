package koreait.day17;

import java.util.Scanner;

public class Score {
	private String name;
	private int korean;
	private int english;
	private int science;
	private String grade;
	
	public Score() {
	}
	
	public Score(String name, int korean, int english, int science) {
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.science = science;
	}
	
	

	@Override
	public String toString() {
		return "Score [name=" + name + ", korean=" + korean + ", english=" + english + ", science=" + science
				+ ", grade=" + grade + "]";
	}
	
	// 인스턴스 메소드
	public int sum() {
		int result = this.korean + this.english + this.science;
		return result;
	}
	
	public double average() {
		return (double)sum() / 3;
	}
	
	// setter 변경 : 실행내용. 필요에 따라서는 접근한정자를 private로도 할 수 있다.
	private void setGrade() {
		if(average() >= 90)
			this.grade = "A";
		else if(average() >= 80)
			this.grade = "B";
		else if(average() >= 70)
			this.grade = "C";
		else if(average() >= 60)
			this.grade = "D";
		else
			this.grade = "F";
	}	
	
	String getGrade() {
		setGrade();
		return grade;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKorean() {
		return korean;
	}

	public void setKorean(int korean) {
		this.korean = korean;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getScience() {
		return science;
	}

	public void setScience(int science) {
		this.science = science;
	}

	

	
}
