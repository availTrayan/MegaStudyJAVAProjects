package test;

import java.util.Scanner;

public class Test01 {
	
	// 1. 2�� ���� �Լ�
	
	public static int getSquared(int x) {
		
		int result = x * x;
		return result;
	}
	
	// 2. ��� ���ϱ� �Լ�
	
	public static double getAverage(int score1, int score2, int score3, int score4) {
		double result = (score1 + score2 + score3 + score4) / 4;
		return result;
	}
	
	// 3. ��� ������ ��� �Լ�
	public static void printQuotientRemainder(int number1, int number2) {
		int quotient = number1 / number2;
		int remainder = number1 % number2;
		System.out.println("�� : " + quotient);
		System.out.println("������ : " + remainder);
	}
	
	// 4. Ȧ¦ �Լ�
	public static int oddevenCaculator(int x) {
		if(x % 2 == 0) {
			return 0;
		} else {
			return 1;
		}
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�������� ���� ���ڸ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		System.out.println(num + "�� ������ " + getSquared(5) + "�̴�.");
		
		System.out.print("������ �Է��ϼ��� : ");
		int score1 = sc.nextInt();
		int score2 = sc.nextInt();
		int score3 = sc.nextInt();
		int score4 = sc.nextInt();
		System.out.println("����� " + getAverage(score1, score2, score3, score4));
		
		System.out.print("���ڸ� ���� ���� �Է��ϼ��� : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		printQuotientRemainder(num1, num2);
		
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int number = sc.nextInt();
		System.out.println(oddevenCaculator(number));
	}
	
	

}
