package test;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		
		// 1. �ݺ� ���
		/*
		for(int i= 35; i <= 40; i++) {
			System.out.print(i + " ");
		}
		*/
		
		// 2. �ݺ� ���

		for (int i = 5; i <= -5; i--) {
			System.out.print(i + " ");
		}
		
		// 3. Ư�� ���� ���ϱ�
		/*
		for (int i = 1; i <=50; i++) {
			if(i % 3 == 0) {
				System.out.print(i + " ");
			}
		*/
		
		// 4. ���� ����
		/*
		int count = 0;
		
		for(int i = 1; i <= 100; i++) {
			
			if(i % 7 == 0) {
				 count++;
			}
		}
		System.out.println("7�� ����� ������ : " + count);
		*/
		
		// 5. ������
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("�ܼ��� �Է��ϼ��� : ");
		int dan = sc.nextInt();
		
		for(int i = 1; i <= 9; i++) {
			System.out.println(dan + " x " + i + " = " + dan * i);
		}
		*/
		
		// 6. ���� ū ��
		
		Scanner sc = new Scanner(System.in);
		
		int max = 0;
		
		for(int i = 1; i <= 5; i++) {
			
			System.out.print("���� �Է��ϼ��� : ");
				int num = sc.nextInt();
			
			if(num > max) {
				max = num;
			}
		}
		System.out.println("���� ū �� : " + max);
	}
}
