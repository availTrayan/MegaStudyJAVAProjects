package test;

import java.util.Random;
import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {

		// 1. ��ġ ����
		/*
		int[] numbers = {3, 5, 2, 10, 39};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�ΰ��� index�� �Է� �ϼ��� : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int temp = numbers[num1];
		numbers[num1] = numbers[num2];
		numbers[num2] = temp;
		
		for(int i = 0; i < numbers.length; i++) {
		System.out.print(numbers[i] + " ");
		}
	}
	*/
		
	// 2. ����
	/*
	int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	
	Random rand = new Random();

	for (int i = 0; i < 100; i++) {
	    int randomNumber = rand.nextInt(10);
	    // swap ����
	
	
	// 0 �� index�� ���� ���Ƿ� ���� index�� ���� ��ü�Ѵ�.
	int temp = numbers[0];
	numbers[0] = numbers[randomNumber];
	numbers[randomNumber] = temp;
	}
	
	for(int i = 0; i < numbers.length; i++) {
		System.out.print(numbers[i] + " ");
	}
	*/
		
	// 3. ���� �� ã��
	
	int[] numbers2 = {4, 6, 3, 8, 2, 9, 1, 5};
	
	// ���� ������ üũ�� �迭
	boolean[] checkList = new boolean[9];
	
	for(int i = 0; i < numbers2.length; i++) {
		
		int number = numbers2[i] - 1;
		checkList[number] = true;
	}
	
	for(int i = 0; i < checkList.length; i++) {
		if(checkList[i] == false) {
			System.out.println("���� ���� " + (i + 1) + "�Դϴ�.");
			break;
		}
	}
	
	// 4. �󵵼� ���ϱ�
	
	int[] numbers3 = {5, 3, 2, 1, 2, 4, 3, 3, 2, 1};
	int[] frequency = new int[5];
	
	for(int i = 0; i < numbers3.length; i++) {
		int number = numbers3[i] - 1;
		frequency[number]++;
	}
	
	for(int i = 0; i < frequency.length; i++) {
		System.out.println(i + 1 + " : " + frequency[i]);
	}

}
}
