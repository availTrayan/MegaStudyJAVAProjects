package test.test02;

public class Rectangle extends Shape {


	public Rectangle(double width, double height) {
		super(width, height);
	}
	
	@Override
	public void calculSize() {
		System.out.println("�簢���� ���̴� " + (getWidth() * getHeight()) + "cm^2 �Դϴ�." );
	}

}
