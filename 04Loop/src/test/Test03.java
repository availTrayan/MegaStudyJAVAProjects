package test;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		
		// 1. ���ѷ��� Ż��
		/*
		int i = 0;
		while(true) {
			if(i == 8) {
				break;
			}
			System.out.println("Hello World");
			i++;
		}
		*/
		
		// 2. ¦�� ���
		/*
		for(int i = 1; i <= 10; i++) {
			if(i % 2 != 0) {
				continue;
			}
			System.out.print(i + " ");
		}
		*/
		
		// 3. ��� ���
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= 100; i++) {
			if(i % num == 0) {
				System.out.println(i);
			}
		}
		*/
		
		// 4. ���� �Է�
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("���� �Է��ϼ��� : ");
			int num = sc.nextInt();
			
			if(num == 0) {
				break;
		}
		
	}
		System.out.println("��");

}
}