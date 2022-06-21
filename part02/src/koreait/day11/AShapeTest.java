package koreait.day11;

public class AShapeTest {
// main �޼ҵ�� Ŭ������ ������� ���ø����̼�. �߻�Ŭ������ �ϼ��� ���ø����̼ǿ��� ���ο� �߻�޼ҵ带 �߰��ϸ�?
//				
	public static void main(String[] args) {
		Triangle tri = new Triangle(100, 84);
		tri.shapeName = "�����ﰢ��";
		System.out.println(tri);
		System.out.println("���� = " + tri.getArea());
		
		Circle cir = new Circle();
		cir.shapeName = "��";
		cir.setRadius(89);
		System.out.println(cir);
		System.out.println("���� = " + cir.getArea());
	}
}
/*
 * ���� : �޼ҵ� �������� �� ����������
 * �θ� public -> �ڽ� default : �Ұ���
 * �θ� default -> �ڽ� public : ����
 * 
 */

abstract class AShape{
	protected String shapeName;
	protected int width;
	protected int height;
	
	public AShape() {	// AShape()�� ��ü�� ���� ������� �ڽ� ��ü ������� �� ����.
		System.out.println("AShape ����Ʈ ������ �����մϴ�");
	}
	
	// �߻�Ŭ������ Ŀ���� ������ ���� ?
	public AShape(int width, int height) {
		System.out.println("AShape Ŀ���� ������ �����մϴ�");
		this.width = width;
		this.height = height;
	}
	
	public abstract double getArea();	// ������ ����

	// �߻�Ŭ������ �ν��Ͻ� �޼ҵ� �����ؼ� �ڽ� Ŭ������ ������ �� �� �ִ�.
	public Object explain() {		// ���ø����̼� �Ϸ� �� �߻�޼ҵ� �߰��ϸ� ���� �߻��ϹǷ� �ν��Ͻ� �޼ҵ带 �߰�.
		return null;
	}
	
	@Override
	public String toString() {
		return "AShape [��������=" + shapeName + ", width=" + width + ", height=" + height + "]";
	}
}

class Triangle extends AShape{		// width*height/2

	public Triangle(int width, int height) {
		super(width,height);
//		this.width = width;
//		this.height = height;
	}
	@Override
	public double getArea() {
		return width*height/2;
	}
}

class Circle extends AShape{	// ������*������*3.14
	private int radius;	// ������
	
	@Override
	public double getArea() {
		return radius*radius*3.14;
	}
	
	@Override
	public String toString() {
		return "Circle [������=" + radius + ", ��������=" + shapeName + ", width=" + width + ", height=" + height
				+ "]";
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
}

class Retangle extends AShape{
	@Override
	public double getArea() {
		return width*height;
	}						// width*height
}
