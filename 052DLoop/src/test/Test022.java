package test;

import java.util.Scanner;

public class Test022 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("�𷡽ð� ũ�⸦ �Է��ϼ��� : ");
		
		int line = scan.nextInt();
		
		int half = line / 2;
		
		// ��
		for(int i = 0; i < half + 1; i++) {
			
			for(int j = 0; j < i; j++) {
				System.out.print("-");
			}
			
			for(int j = 0; j < (half - i) * 2 + 1; j++) {
				
				if(j % 2 == 0) {
				System.out.print("*");
				} else {
					System.out.print("+");
				}
			}
			
			for(int j = 0; j < i; j++) {
				System.out.print("-");
			}
			
			System.out.println();
		}
		
		// �ؿ� ������ �� ��� 
		for(int i = 0; i < half; i++) {
			
			for(int j = 0; j < half - i - 1; j++) {
				System.out.print("-");
			}
			
			for(int j = 0; j < (i + 1) * 2 + 1; j++) {
				
				if(j % 2 == 0) {
				System.out.print("*");
				} else {
					System.out.print("+");
				}
			}
			
			for(int j = 0; j < half - i - 1; j++) {
				System.out.print("-");
			}
			
			System.out.println();
		}
	}
  }

