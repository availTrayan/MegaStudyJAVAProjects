package test;

import java.util.Random;
import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		
		// 1. ���ĺ� ���
				/*
				// ascii �ڵ带 �̿��ϴ� ���
				for(char i = 'A'; i <= 'Z'; i++) {
					System.out.print(i + " ");
				}
				System.out.println();
				*/
				
				// 2. �� ���ϱ�
				/*
				Scanner sc = new Scanner(System.in);
				System.out.print("���� �Է� �ϼ��� : ");
				int num = sc.nextInt();
				int sum = 0;
				for(int i = 1; i <= num; i++) {
					sum += i;
					
					if(sum > 100) {
						break;
					}
					
				}
				System.out.print(sum);
			}
			*/
		
				// 3. ��������
				/*
				Scanner sc = new Scanner(System.in);
				System.out.print("������ ���� �Է��ϼ��� : ");
				int a = sc.nextInt();
				int d = sc.nextInt();
				int n = sc.nextInt();
				
				// �ݺ� Ƚ���� ���ؾ��ϴ� ������ ���ں��� 1 ������ϹǷ�
				for(int i = 1; i <= n - 1; i++) {
					a += d;
				}
				System.out.println(a);
				*/
				
				// 4. �Ҽ� �Ǻ�
				/*
				Scanner sc = new Scanner(System.in);
				System.out.print("���� �Է��ϼ��� : ");
				int num = sc.nextInt();
				boolean isPrime = true;
				
				// 1�� ������ �������� ������ 2���� ����
				
				for(int i = 2; i < num; i++) {
				// ������ ��ŭ ���ص� ���� 
				// for(int i = 2; i <= math.sqrt(num); i++)	
					if(num % i == 0) {
						System.out.println("�Ҽ��� �ƴϴ�!");
						isPrime = false;
						break;
					}
				}
				
				if(isPrime) {
					System.out.println("�Ҽ� �Դϴ�.");
				}
				*/
				
				// 5. ���� ������ ���
				// ��ǻ�Ϳ��� �������� ���� �������. �� ���� 3������
	
				Scanner sc = new Scanner(System.in);
				Random random = new Random();
				
				int youWin = 0;
				int computerWin = 0;
				
			for(int i = 0; i < 5; i++) {
				// 1 2 3 �� ����ϱ� ���� 0 1 2�� + 1
				int computer = random.nextInt(3) + 1 ;
				System.out.print("����(1) ����(2) ��(3)!! : ");
				
				int number = sc.nextInt();
				
				System.out.print("computer: (" + computer + ")");
				
				if(computer == number) {
					
					System.out.println("�����ϴ�!");
					
				} else if (number == 1 && computer == 3 
						|| number == 2 && computer == 1 
						|| number == 3 && computer == 2) {
					
						System.out.println(" �̰���ϴ�!");
						youWin++;
						
				} else {
					
					System.out.println(" �����ϴ�!");
					computerWin++;
				}
				
				if(youWin == 3 || computerWin == 3) {
		            break;
		        }
			}	
				
			System.out.print("�������: " + youWin + ":" + computerWin + "�� ");	
			if(youWin > computerWin) {
				System.out.println("����� �̰���ϴ�.");
			} else if (youWin < computerWin) {
				System.out.println("����� �����ϴ�. ");
			} else {
				System.out.println("�����ϴ�.");
			}
	}
	}
