package test;

public class Test01 {

	public static void main(String[] args) {

		int[] numbers = {3, 8, 9, 4, 2, 1, 7, 5};
		
		// 1. �迭�� 4��° ���� 6���� ����
		numbers[3] = 6;
		
		// 2.�迭�� ���� ������� ����ϼ���. 
		/*
		for(int i = 0; i < numbers.length; i ++) {
		System.out.print(numbers[i] + " ");
		}
		*/
		
		// 3. �迭�� ���� �ݴ������ ����ϼ���.
		/*
		for(int i = numbers.length - 1; i >= 0; i--) {
			System.out.print(numbers[i] + " ");
		}
		*/
		
		// 4. �迭�� ¦����° ��ġ�� �ִ� ������ ����ϼ���.
		/*
		for(int i = 2; i < numbers.length; i++) {
			if(i % 2 == 0) {
				System.out.println(numbers[i - 1] + " ");
			}
		}
		*/
		
		// 5. �迭�� ���� �� 2�� ����ִ� index�� ����ϼ���.
		/*
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] == 2) {
			
				System.out.println("2�� ����ִ� index : " + i);
			}
		}
		*/
		
		// 6. �迭�� ���� �� ���� ū ���� ����ϼ���
		/*
		int max = numbers[0];
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] > max) {
				max = numbers[i];
			}
		}
		System.out.println("���� ū �� : " + max);
		*/
		
		// 7. �迭�� ���� �� ���� ���� ���� ����� index�� ����ϼ���.
		
		int min = numbers[0];
		int minIndex = 0;
		
		for(int i = 0; i < numbers.length; i++) {
			if(min > numbers[i]) {
				min = numbers[i];
				minIndex = i;
			}
		}
		System.out.println("�ּҰ��� index : " + minIndex);
		
		/*
		// 8. �迭�� ��� ���� ���� ��� �ϼ���
		int sum = 0;
		for(int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		System.out.println("���� �� : " + sum);
		*/
	}
	
}
