package ex.ex02;

public class Ex02 {

	public static void main(String[] args) {

		Rectangle rect1 = new Rectangle();
		rect1.width = 4;
		rect1. height = 2;
		
		int area = 0;
		area = rect1.calculateArea(8); // �簢���� ���̿� ������ ���ϴ� override
		System.out.println(area);
		rect1.printInfo();
		
	}

}
