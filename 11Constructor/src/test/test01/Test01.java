package test.test01;

public class Test01 {

	public static void main(String[] args) {

		CircleClass circle = new CircleClass(8);
		
		System.out.println("���� ���� : " + circle.area(8));
		System.out.println("���� �ѷ� : " + circle.girth(8));
		System.out.println("�� 25�� ���� : " + circle.sumArea(25));
		
		ProductMange product = new ProductMange("�����", 1300, "2021-03-02");
		product.printInfo();
		
		if(product.availableSale("2022-06-02")){ 
			System.out.println("�ǸŰ��� ��ǰ"); 
			} else { 
			 System.out.println("�ǸźҰ� ��ǰ"); 
		 }
		
	}

}
