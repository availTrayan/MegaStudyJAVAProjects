package test.test022;

public class Test022 {

	public static void main(String[] args) {
		
		Shape[] shapes = new Shape[3];
		

		shapes[0] = new Circle(12);
		shapes[1] = new Rectangle(7, 13);
		shapes[2] = new Triangle(8, 10);
		
		for(int i = 0; i < shapes.length; i++) {
			
			
		//	System.out.println(shapes[i].getName() + "�� ���̴� " + shapes[i].calculateArea());
			shapes[i].printArea(); //Shape�� calculateArea�� ȣ��Ǿ ��ü���� �����ǵȰɷ� ����
		}
	}

}
