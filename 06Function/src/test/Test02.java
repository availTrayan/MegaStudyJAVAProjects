package test;

import java.util.Scanner;

public class Test02 {
	
	// 1. �ձ��ϱ�
	public static int sumAll(int x) {
		int sum = 0;
		for(int i = 1; i <= x; i++) {
			sum += i;
			
			if(sum > 100) {
				break;
			}
		}
		return sum;
	}
	
// 3. �Ҽ� �Ǻ�
	
	public static boolean isPrimeNumber(int x) {
		
		boolean isPrime = true; //������ true�� �ָ� ��������
		
		for(int i = 2; i < x; i++) {
			
			if(x % i == 0) {
				isPrime = false;
				break;
			} 
		}
		return isPrime;
	}
	
	public static void main(String[] args) {

		// �����Լ�
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է��ϼ��� : ");
		int number = sc.nextInt();
		
		System.out.println(isPrimeNumber(number));
	}

}
