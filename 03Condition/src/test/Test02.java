package test;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// 1. �� ���� �հ�
		
		/*
		System.out.print("�� ������ �Է��ϼ��� : ");
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		if(num1 > 70 && num2 >70) {
			System.out.println("�հ� �Դϴ�.");
		}
		*/
		
		// 2. ����� ���ϱ�
		/*
		System.out.print("���� �Է��ϼ��� : ");
		int number = scan.nextInt();

		if(number%2 == 0 && number%3 == 0) {
			System.out.println(number + "�� 2�� 3�� ����� �Դϴ�.");
		}
		*/
		
		// 3. ����
		System.out.print("1~10 ������ ���� �Է� �ϼ��� : ");
		int number = scan.nextInt();
		
		if(number < 1 || number > 10) {
			System.out.println("�߸� �Է� �ϼ̽��ϴ�");
		}
		
	}

}
