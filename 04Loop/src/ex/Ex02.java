package ex;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		// Ƚ�� �ݺ�
		for(int i = 0; i < 5; i++) {
			System.out.println("Hello World!!");
		}

		// 1~10���� ���
		for(int i = 1; i <= 10; i++) {
			System.out.println(i + " ");
			// ���� ���������ε� ���� �߰�ȣ �ȿ����� �ߺ��ȴ�.
		}
		System.out.println();
		
		// 3. ī��Ʈ �ٿ�
		// 10 ~ 0 ���� ���
		for(int i =10; i >= 0; i--) {
			System.out.println(i);
		}
		
		Scanner sc = new Scanner(System.in);
		// ������ ���� �ݺ� Ƚ�� ����
		System.out.println("�ݺ� Ƚ���� �Է��ϼ��� : ");
		int count = sc.nextInt();
		
		for(int i = 0; i < count; i++) {
			System.out.println("Hello");
		}
		// �����Ը� �Է¹ް� 70�̻��� ���� ��� �Ѵ�.
		System.out.println("�����Ը� �Է��ϼ��� : ");
		int weight = sc.nextInt();
		// for���� �� ������ ������ ;�� ������ ��
		for(; weight > 70; weight -= 2) {
			System.out.println("���X ���X!");
		}
		
		// �� ���ϱ� 1 ~ 10
		
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		// for ���ѷ���, �� �������� ����
		// for(;;) {
		//	
		// }
		
		// break
		int i = 0;
		while(true) {
			if(i == 5) {
				break;
			}
			System.out.println("Hello");
			i++;
		
		}
		
		// continue;
		for(i = 0; i <= 10; i++) {
			if(i % 4 == 0) {
			continue;
			}
			System.out.println(i + " ");
		 }
		 System.out.println();
		
	}

}
