package test.test022;

public class Circle extends Shape {
	
	
	private int radius;

	
	public Circle(int radius) {
		super("��");
		this.radius = radius;
	}
	
	@Override
	public double calculateArea() {
		return radius * radius * 3.14;
	}
	
}
