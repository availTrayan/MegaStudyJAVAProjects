package test;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		
		// 1. ������
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("�ܼ� ������ �Է��ϼ��� : ");
		int dan1 = sc.nextInt();
		int dan2 = sc.nextInt();
		int result;
		
		for(int i = dan1; i <= dan2; i++) {
			for(int j = 1; j <= 9; j++) {
				result = i * j;
				System.out.println(i + " x " + j + " = " + result);
			}
		}
		*/
		
		// 2. �����
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("����� �� ���� �Է��ϼ��� : ");
		int line = sc.nextInt();
		
		for(int i = 1; i <= line; i++) {
			
			for(int j = 0; j < (line - i); j++) {
				System.out.print(" ");
			}
			
			for(int j = 0; j < ((2 * i) - 1); j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		*/
		
		// 3. �𷡽ð� ����ϱ�
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�� ���� �Է��ϼ��� : ");
		int line = scan.nextInt();
		
		
		int half = line / 2;
		
		// ��� ���� ������ ���� ���
		for(int i = 0; i < half + 1; i++) {
			
			// �� `-` ��� 
			for(int j = 0; j < i; j++) {
				System.out.print("-");
			}
			
			// ���μ��� ������� Ȧ�� ���� *+* ������ �ݺ�
			// i�� ����ɼ��� ��� ������ �پ��°��� �˰����� ���������� ��ǥ�� ���� ���ذ� �Ȱ��ϴ�.
			for(int j = 0; j < (half - i) * 2 + 1; j++) { 
				if(j % 2 == 0) { // 2�� ������ �������� ��� * ���
					System.out.print("*");
				} else {  // �׿��� ��� + ��� 
					System.out.print("+");
				}
			}
			
			// �� `-` ���
			for(int j = 0; j < i; j++) {
				System.out.print("-");
			}
			System.out.println();
		}
		
		// �ؿ� ������ �� ��� 
		for(int i = 0; i < half; i++) {
			
			// �� `-` ���
			for(int j = 0; j < half - i - 1; j++) {
				System.out.print("-");
			}
			
			// ���μ��� ������� Ȧ�� ���� *+* ������ �ݺ�
			for(int j = 0; j < (i + 1) * 2 + 1; j++) {
				if(j % 2 == 0) {    // 2�� ������ �������� ��� * ���
					System.out.print("*"); 
				} else {	// �׿��� ��� + ���
					System.out.print("+");
				}
			}
			
			// �� `-` ���
			for(int j = 0; j < half - i - 1; j++) {
				System.out.print("-");
			}
			
			System.out.println();
		}
		
		
		// 4. ���� �ﰢ�� ����ϱ�
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ﰢ���� ũ�⸦ �Է��ϼ���: ");
		int line = sc.nextInt();
			
		for(int i = 1; i <= line; i++) {
			int number = i;
			
			for(int j = 0; j < i; j++) {
				System.out.print(number + " ");
				number += (line - 1) - j;
			}
			System.out.println();
		}
		 */
	}
	}


