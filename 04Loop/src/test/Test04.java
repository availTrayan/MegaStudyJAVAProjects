package test;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		
		// 1. �� ���ϱ�
		
		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * System.out.print("���� �Է��ϼ��� : "); int num = sc.nextInt();
		 * 
		 * int sum = 0;
		 * 
		 * for(int i = 0; i <= num; i++) { sum += i; } System.out.println("�� : " + sum);
		 */
		
		// 2. �հ� ��� ���ϱ�
		
		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * int sum = 0; double average = 0;
		 * 
		 * for(int i = 1; i <= 5; i++) { System.out.println(i + "��° ���� �Է� �ϼ���. : "); int
		 * num = sc.nextInt(); sum += num; average = sum / i; }
		 * 
		 * System.out.println("���� : " + sum + " ��� : " + average);
		 */
		
		// 3. ���丮��
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� �ϼ��� : ");
		int num = sc.nextInt();
		int factorial = 1;
		int i = 2;
		while(i <= num) {
			
			if(num > 10){
				break;
			}
			factorial *= i;
			i++;
		}
		System.out.println(num + "!" + " = " + factorial);
		*/
		
		// 4. �ּҰ�
		/*
		Scanner sc = new Scanner(System.in);
		
		int min = 1000;
		// min�� ������ �������� �ʾ��� ��� ù���簪�� min���� �����ϸ��
		for(int i = 1; i <= 5; i++) { 
			
			System.out.print(i + "��° ���� �Է� �ϼ��� : "); 
			int num = sc.nextInt(); 
			
			if(num > 1000) {
				break;
			}
			
			if(num < min) {
				min = num;
			}
		}
		System.out.println("�ּҰ��� " + min + "�Դϴ�.");
		*/
		
		// 5. ��� ���ϱ�
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			
			if(num % i == 0) {
				System.out.print(i + " ");
			}
		}
	
		}
	}
