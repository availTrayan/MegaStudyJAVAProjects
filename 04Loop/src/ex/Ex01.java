package ex;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
	
		int weight = 76;
		
		// �����԰� 70���ϰ� �ɶ����� ����Ѵ�.
		// �����԰� 70 �ʰ��� ���� ��Ѵ�!
		
		while(weight > 70) {
			System.out.println("���X���X");
			weight = weight -= 2; // weight = weight - 2;
		}
		
		// Ƚ�� �ݺ� : 5�� Hello World ���
		int i = 0;
		// i�� 5���� ���� ���� �ݺ�
		while(i <5) {
			System.out.println("Hello World!");
			i++;
		}
		
		// Ƚ�� �ݺ� : 5 ~ 1
		i=5;
		while(i>0) {
			System.out.println(i);
			i--;
		}
		
		// ������ ���� Ƚ������
		Scanner sc = new Scanner(System.in);
		System.out.print("Ƚ���Է� : ");
		int count = sc.nextInt();
		i =0;
		while(i<count) {
			System.out.println("�ȳ�!");
			i++;
		}
		
		// ���� ����
		// 1���� 10���� �ձ��ϱ�
		i=1;
		int sum = 0;
		while(i <= 10) {
			// 1 2 3 4 5 6 7 8 9 10
			sum += i; // sum = sum + i;
			i++ ;
		}
		// ���� ����� �ݺ��� ���� �ۿ���
		System.out.println("�� : " + sum);
		
		i = 0;
		while(i<5) {
			System.out.println("�Ϳ�");
			i++;
		}
		
	}

}
