package test;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		
		// ���� ���ϱ�
		Scanner sc = new Scanner(System.in);
		System.out.print("1~7 ������ ��¥�� �Է��ϼ��� : ");
		int day = sc.nextInt();
		
	 switch (day) {
	 case 1 : 
		 System.out.println("������");
		 break;
		 
	 case 2 : 
		 System.out.println("ȭ����");
		 break;
	 case 3 : 
		 System.out.println("������");
		 break;
	 case 4 : 
		 System.out.println("�����");
		 break;
	 case 5 : 
		 System.out.println("�ݿ���");
		 break;
	 case 6 : 
		 System.out.println("�����");
		 break;
	 default :
		 System.out.println("�Ͽ���");
	 }

	}

}
