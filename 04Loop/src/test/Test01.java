package test;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		
		// 1. �ݺ� ���
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("Ƚ���� �Է��ϼ��� : ");
		
		int i = 0;
		int num = sc.nextInt();
		while(i < num) {
			System.out.println("�� �ƴϾ�");
			i++;
		}
		*/
		
		// 2. ī��Ʈ �ٿ� �߻�
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("ī��Ʈ �ٿ� �Է��ϼ��� : ");
		
		int count = sc.nextInt();
		int i = count;
		
		while(i >= 0) {
			System.out.println(i);
			i--;
		}
		System.out.println("�߻�");
		*/
		
		// 3. ¦�� �� ���ϱ�
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է��ϼ��� : ");
		
		int i = 1;
		int sum = 0;
		int num = sc.nextInt();
		
		while(num >= i) {
			if (num % 2 == 0) {
				
			sum += num;
			
		}
			num--;
		}
			System.out.println("���� ��� : " + sum);
		*/
		
		// 4. �ݺ� �Է�
		/*
		Scanner sc = new Scanner(System.in);
		int i = 0;

		while(i<5) {
			System.out.print("�Է� : ");
			int num = sc.nextInt();
			System.out.println("��� : " + num);
			i++;
		}
		*/
		
		// 5. ������
		// ���� dan ������ ���� �ʿ䰡 ������
		int dan = 2;
		int i = 1;
		while(i < 10) {
		System.out.println(dan + " x " + i + " = " + dan * i);
			i++;
		}
		
	}
}
