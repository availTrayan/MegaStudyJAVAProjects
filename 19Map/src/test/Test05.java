package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {

		List<String> fruits = new ArrayList<>();
		
		Scanner scan = new Scanner(System.in);
		
			while(true) {
			
			System.out.println("1: �Է� 2: ��� 3: ���� 4: ����");
			int work = scan.nextInt();
			
				if(work == 1){
					System.out.print("���� �̸��� �Է��ϼ��� : ");
					String fruitName = scan.next();
					fruits.add(fruitName);
					
					if(fruits.contains(fruitName)) {	
					System.out.println("�Է� ����");
					}
				}	
				
				if(work == 2) {
					if(fruits.size() > 0) {
						System.out.println(fruits);
					} else {
						System.out.println("��� �ֽ��ϴ�.");
					}
				}
			
				if(work == 3) {
					System.out.println("������ ���� �̸��� �Է��ϼ��� : ");
					String removeName = scan.next();
					fruits.remove(removeName);
					System.out.println("���� ����");
				}
			
				if(work == 4) {
					System.out.println("�����մϴ�.");
					break;
				}
				
				if(work != 1 && work != 2 && work != 3 && work != 4 ) {
					System.out.println("�߸� �Է��߽��ϴ�.");
				}
			}
		}
}
	


