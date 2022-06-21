package koreait.day10;

import java.util.Arrays;

// ��� Ŭ������ �ֻ��� super(�θ�)Ŭ������ java.lang.Object Ŭ�����Դϴ�.
//  -> Object Ŭ������ �޼ҵ带 ��ӹ޾� ����� �� �ֽ��ϴ�.
public class Person {
	
	private String name;
	private int age;
	private double idCode;
	private String[] hobbies;
	
	
	
	
	@Override		// �θ� Object Ŭ������ toString()�޼ҵ� ������
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", idCode=" + idCode + ", hobbies=" + Arrays.toString(hobbies)
				+ "]";
	}
	
	// getter, setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getIdCode() {
		return idCode;
	}
	public void setIdCode(double idCode) {
		this.idCode = idCode;
	}
	public String[] getHobbies() {
		return hobbies;
	}
	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}
	
	
	

}
