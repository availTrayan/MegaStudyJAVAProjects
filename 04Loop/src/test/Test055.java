package test;

import java.util.Scanner;

public class Test055 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է��ϼ��� : ");
		int num = sc.nextInt();
	
		boolean isPrime = true;
		
		for(int i = 2; i < num; i++) {
			if(num % i == 0) {
				System.out.println("�Ҽ��� �ƴմϴ�.");
				isPrime = false;
				break;
			} 
		}
		if(isPrime) {
			System.out.println("�Ҽ� �Դϴ�.");
		}
		
	}

}
