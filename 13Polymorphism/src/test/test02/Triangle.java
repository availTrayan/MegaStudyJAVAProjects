package test.test02;

public class Triangle extends Shape {

	public Triangle(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void calculSize() {
		System.out.println("�ﰢ���� ���̴� " + ((getWidth() * getHeight()) / 2) + "cm^2 �Դϴ�." );

	}

	
}
