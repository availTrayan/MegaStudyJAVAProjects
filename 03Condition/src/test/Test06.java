package test;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		
		// 1. ���� ���� �հ� ����
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����1 : ");
		int score1 = sc.nextInt();
		
		System.out.print("����2 : ");
		int score2 = sc.nextInt();
		
		// ��,���� ��� ���� ���� ����ص���
		// double average = (socre1 + score2) /2.0;
		
		if (score1 <= 50 || score2 <= 50){
			System.out.println("����");
		} else if ((score1 + score2)/2 >= 60) {
			System.out.println("�հ�");
		} else if ((score1 + score2)/2 < 60) {
			System.out.println("���հ�");
		}
		*/
		
		// 2. ���� ���ϱ�
		// 4�� 100 ������ ������ ���� 400 ������ ������ ������ϴ� ������ �� ���ؾȵ˴ϴ�.
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int year = sc.nextInt();
		
		if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)) {
			System.out.println("����");
		} else {
			System.out.println("���");
		}
		*/
		
		
		// 3. ���� ���� �� ����
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ���� : ");
		int attack1 = sc.nextInt();
		System.out.print("ö�� ���� : ");
		int attack2 = sc.nextInt();
		
		if ((attack1 == 1 && attack2 == 2 ) || (attack1 == 3 && attack2 == 1) || (attack1 == 2 && attack2 == 3)) {
			System.out.println("ö���� �̰��.");
		} else if ((attack1 == 2 && attack2 == 1) || (attack1 == 3 && attack2 == 2) || (attack1 == 1 && attack2 == 3)){
			System.out.println("���� �̰��.");
		} else {
			System.out.println("����!");
		}
		*/
		
		// 4. 45����
		// ���ǹ� ��������� ã�� ���߽��ϴ�.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�ð� �� �Է� : ");
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		
		minute -= 45;
		
		if(minute < 0) {
			hour--;
			//-15
			minute = 60 + minute;
			
			if(hour < 0) {
				hour += 24;
			}
		}
		
		System.out.println(hour + "�� " + minute + "��");
		}
		
	
		// 5. ������
		/*
	Scanner sc = new Scanner(System.in);
	System.out.print("�� ���¸� �Է��ϼ��� : ");
	int yut1 = sc.nextInt();
	int yut2 = sc.nextInt();
	int yut3 = sc.nextInt();
	int yut4 = sc.nextInt();
	
	int sum = 0;
	sum = yut1 + yut2 + yut3 + yut4;
	
	switch (sum) {
	
	case 1 :
		System.out.println("��");
		break;
	case 2 :
		System.out.println("��");
		break;
	case 3 :
		System.out.println("��");
		break;
	case 4 :
		System.out.println("��");
		break;
	default :
		System.out.println("��");
	}
	*/
}
