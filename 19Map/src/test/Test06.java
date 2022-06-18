package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {

		List<Person> mans = new ArrayList<>();
		
		Scanner scan = new Scanner(System.in);
	
		while(true) {
		
			System.out.println("1: �Է� 2: ��� 3: ���� 4: ����");
			int work = scan.nextInt();
			
			if(work == 1) {
				System.out.print("�̸��� �Է��ϼ��� : ");
				String name = scan.next();
				System.out.println("���� ������ �Է��ϼ��� : ");
				int birth = scan.nextInt();
			
				mans.add(new Person(name, birth));
				
			}
			
			if(work == 2) {
				if(mans.size() > 0) {
					System.out.println(mans);
				} else {
					System.out.println("��� �ֽ��ϴ�.");
				}
			}
			
			if(work == 3) {
				System.out.print("������ �̸��� �Է��ϼ��� : ");
				String name = scan.next();
				
				Iterator<Person> iter = mans.iterator();
				
				while(iter.hasNext()) {
					Person remove = iter.next();
					if(name.equals(remove.getName())) {
						iter.remove();
						System.out.println();
					}
				}
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

