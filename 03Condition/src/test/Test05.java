package test;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		
		// 1. ¦�� ���ϱ�
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("������ ���� �Է� �ϼ��� : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		if (num1%2 == 0) {
			System.out.println(num1 + "�� ¦�� �Դϴ�.");
		} 
		if (num2%2 ==0) {
			System.out.println(num2 + "�� ¦�� �Դϴ�.");
		} 
		if (num3%2 == 0) {
			System.out.println(num3 + "�� ¦���Դϴ�.");
		}
		 */
		
		// 2. �񸸵� ���ϱ�
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print ("bmi ��ġ�� �Է��ϼ��� : ");
		int bmi = sc.nextInt();
		if (bmi >20 ) {
			System.out.println("��");
		} else if (bmi <= 20 && bmi >10) {
			System.out.println("��ü��");
		} else {
			System.out.println("����");
		}
		*/
		
		// 3. ��� �հ� ���ϱ�
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ������ �Է� �ϼ��� : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if ((num1 + num2)/2 >= 70) {
			System.out.println("�հ��Դϴ�");
		} else {
			System.out.println("���հ��Դϴ�.");
		}
		*/
		
		// 4. ū�� ���ϱ�
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ���� �Է� �ϼ��� : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		/*
		if (num1 > num2 && num1 > num3) {
			System.out.println(num1);
		} else if (num2 > num1 && num2 > num3) {
			System.out.println(num2);
		} else if (num3 > num1 && num3 > num2){
			System.out.println(num3);
		}
		*/
		
		// ���� ������ŭ if���� �÷��ָ� �Ǵ� ȿ���� �ڵ�
		// �񱳴� ù��° �Էº��� �����ϴϱ�
				int max = num1; 
				if (max < num1) {
					max = num1;
				}
				if (max < num2) {
					max = num2;
				}
				if (max < num3) {
					max = num3;
				}
		
		// 5. ���� ���ϱ�
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է��ϼ��� : ");
		int month = sc.nextInt();
		
		switch (month) {
		case 3 : 
		case 4 :
		case 5 :
			System.out.println("��");
			break;
		case 6 : 
		case 7 :
		case 8 :
			System.out.println("����");
			break;
		case 9 : 
		case 10 :
		case 11 :
			System.out.println("����");
			break;	
		case 1 : 
		case 2 :
		case 12 :
			System.out.println("�ܿ�");
			break;
		}
		*/
	}
}
