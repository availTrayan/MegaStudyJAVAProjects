package test;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		
		// 1. �ڸ��� �ɰ���
		/*
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�Է�");
		int num = scan.nextInt();
		
		// 1234
		int result = num / 1000;
		System.out.println(result);
		
		// 234
		num = num % 1000;
		result = num /100;
		System.out.println(result);
		
		// 34
		num = num % 100;
		result = num /10;
		System.out.println(result);
		
		result = num % 10;
		System.out.println(result);
		*/
		
		// 2. �ڸ��� �ɰ��� ����
		// 1234
		/*
		int result = num % 10;
		System.out.println(result);
		
		// 123
		num = num / 10;
		result = num % 10;
		System.out.println(result);
		
		// 12
		num = num / 10;
		result = num % 10;
		System.out.println(result);
		
		result = num / 10;
		System.out.println(result);
		*/
		
		// 3. �ڸ��� �� ���ϱ�
		/*
		Scanner scan = new Scanner(System.in);
		System.out.println("���ڸ� ���� �Է��ϼ���");
		int number = scan.nextInt();
		
		int sum = 0;
		
		while(number != 0) {
			
			sum += number % 10;
			number /= 10;
		}
		System.out.println("�հ�� " + sum + "�Դϴ�.");
		*/
		
		// 4. ���� ���
		
		Scanner scan = new Scanner(System.in);
		System.out.println("���ڸ� ���� �Է��ϼ���");
		int number = scan.nextInt();
		// 123
		System.out.print(number % 10); // 3
		// 123
		number = number / 10; // 12
		System.out.print(number % 10); // 2
		// 12
		number = number / 10; // 1
		System.out.print(number % 10); // 1
		
	}

}
