package test;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		
		// 1. ���� ��� �Ǻ�
		/*
		Scanner scan = new Scanner(System.in);
		System.out.println("������ �Է� �ϼ��� : ");
		int num = scan.nextInt();
		
		if (num >0) {
		System.out.println("��� �Դϴ�.");

	} else {
		System.out.println("���� �Դϴ�.");
	}
		 */
		
		// 2. ���� ���
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է� �ϼ��� : ");
		int score = sc.nextInt();
		
		if (score >= 90) {
			System.out.println("A");
		} else if (score >= 80 && score <90) {
			System.out.println("B");
		} else if (score >= 70 && score < 80) {
			System.out.println("C");
		} else if (score >= 60 && score < 70) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		
	}
}