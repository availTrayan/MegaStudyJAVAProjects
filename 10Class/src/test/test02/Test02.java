package test.test02;

public class Test02 {

	public static void main(String[] args) {

		ProductManage product = new ProductManage();
		
		product.name = "�����";
		product.price = 1300;
		product.expiration = "2021-03-02";
		
		product.printInfo();
		
		/*
		 * if(product.availableSale("2022-06-02")){ System.out.println("�ǸŰ��� ��ǰ"); }
		 * else { System.out.println("�ǸźҰ� ��ǰ"); }
		 */
		
	}
	
}