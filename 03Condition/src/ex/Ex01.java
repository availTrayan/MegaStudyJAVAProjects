package ex;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		
		// �����԰� 70kg ������ �� ġŲ ����
		// ���� �����԰� 70kg ���ϸ� ġŲ ����
		
		Scanner scan = new Scanner(System.in);

		int weight = 0;
		System.out.print("ü���� �Է��ϼ��� : ");
		weight = scan.nextInt();
		
		if (weight <= 70) {
			System.out.println("ġŲ ����!");
		}
		
		
		// �����԰� 90 �ʰ� �϶� ���̾�Ʈ ����!
		
		if (weight > 90) {
			System.out.println("���̾�Ʈ ����!");
		}
				
		// �����԰� 67�϶� ������!!
		
		if (weight == 67 ) {
			System.out.println("������!!");
		}
		
		// �����԰� 75�� �ƴҶ� ????
		
		if (weight != 75) {
			System.out.println("????");
		}
		
		boolean condition = true;
		if (condition) {
			System.out.println("������ ����!");
		}
		
		condition = weight <= 70;
		// if(weight <= 70) {
			if (condition) {
				System.out.println("ġŲ ����");
		}
			
		//����
			
			if (! condition) {
				System.out.println("ġŲ ����");
			}
			
		// �������� ��
			
			int num1 = 10, num2 = -5;
			
			if (num1 < num2) {
				System.out.println("num1�� �� �۴�!");
			}
	}

}
