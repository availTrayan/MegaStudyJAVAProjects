package test;

import java.util.Scanner;

public class Test022 {
	
	
	public static boolean isPrimeNum(int num) {
		
	
		for(int i = 2; i < num; i++) {
			if(num % i == 0) {
				return false;
				
			}
		}
		System.out.println("�Ҽ��Դϴ�.");
		return true;
		
	}
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		System.out.println(isPrimeNum(num));
		
	}

}
