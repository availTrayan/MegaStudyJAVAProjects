package test.test04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class Test04 {

	public static void main(String[] args) {

		List<ProductManage> manage = new ArrayList<>();
		
		// 1. ��ǰ �߰�
		ProductManage pm = new ProductManage("�����", 1200, 150);
		manage.add(pm);
		pm = new ProductManage("������", 850, 30);
		manage.add(pm);
		pm = new ProductManage("�Ŷ��", 800, 15);
		manage.add(pm);
		pm = new ProductManage("õ��ǥ ����", 1500, 0);
		manage.add(pm);
		
		System.out.println(manage);
		
		// 2. ��ǰ ����
			Iterator<ProductManage> iter = manage.iterator();
			
			while(iter.hasNext()) {
				
				ProductManage item = iter.next();
				if(item.getRemain() == 0) {
					iter.remove();
				}
				
			}
		System.out.println(manage);
	  
		// 3. ��ǰ �Ǹ�
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("��ǰ�� : ");
		String soldName = scan.nextLine();
		
		System.out.print("���� : ");
		Integer soldCount = scan.nextInt();
		int sumPrice = 0;
		
		iter = manage.iterator();
		
		while(iter.hasNext()) {
			ProductManage item = iter.next();
			
			if(soldName.equals(item.getName())) {
			  sumPrice = item.getPrice() * soldCount;
			  item.setRemain(item.getRemain() - soldCount);
			}
		}
		System.out.println("���� : " + sumPrice + "��");
		System.out.println(manage);
	
	
	// 4. ��� ����
		
	iter = manage.iterator();
	while(iter.hasNext()) {
		ProductManage item = iter.next();
		
		if(item.getRemain() < 30) {
			System.out.println("��ǰ�� : " + item.getName() + " ���� : " + item.getPrice() + " ��� : " + item.getRemain());
		}
	}
		
	}
}
