package test;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {

		// 1. index�� ���� ���ʷ� �Է� �޾Ƽ�, �Ʒ� �迭�� �ش��ϴ� index�� ���� �ٲٰ� ����ϼ���.
		/*
		int[] numbers = {3, 5, 2, 10, 39};
		Scanner sc = new Scanner(System.in);

		System.out.print("������ index�� ���� �Է��ϼ��� : " );
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int index = num1;
		numbers[index] = num2;
		for(int i = 0; i < numbers.length; i++) {
		System.out.print(numbers[i] + " ");
	 }
	*/
		
		// 2. ���� ü��
		/*
		char [] scores = {'X', 'O', 'O','X','X','O','O','O','O','X'};
		int point = 0;
		
	   for(int i = 0; i < scores.length; i++) {
		   if(scores[i] == 'O') {
			   point += 10;
		   }
	   }
	   System.out.println("ä�� ����� " + point + "�� �Դϴ�.");
		*/
		
	   // 3. �ӱ� ���
	   int[] works = {3, 5, 5, 3, 5, 3, 5};
	   int salary = 0;
	
	   for(int i = 0; i < works.length; i++) {

		  if(i < 5) {
			  salary += (works[i] * 8500);
		  } else {
			  salary += (works[i] * 9500);
		  }
			
	   }
	   	System.out.println("�����ϰ� �� �ӱ��� " + salary);
	   	
	   	// 4. ���ĺ� ����
	   	
	   	char[] alphabet = new char[26];
	   	
	   	for(int i = 0; i < alphabet.length; i++) {
	   	
	   		alphabet[i] = (char)('A' + i);
	   	}
	   	
		for(int i = 0; i < alphabet.length; i++) {
		   	
			System.out.print(alphabet[i] + " ");	   
		}
	   		System.out.println();
	   		
	   for(int i = 0; i < alphabet.length; i++) {
		   if(alphabet[i] == 'V') {
			   System.out.println("V�� " + (i + 1) + "��°�Դϴ�.");
		   }
	   }
	   		
	


	   	// 5. �迭 �� ����
	   	// �迭�� ���̰� 5�� int �迭�� �����.
	   	// ���� ���� ������ �Է¹����鼭, �Է¹��� ���� ¦���϶��� �迭�� �����Ѵ�.
	   	// �迭�� �������� �Է��� �ߴ��ϰ� ����� ������ ����Ѵ�.
	   Scanner sc = new Scanner(System.in);
	   
		int[] numbers2 = new int[5];
		int i = 0;
		
		while(true) {
		
			System.out.print("���� �Է��ϼ��� : ");
			int number = sc.nextInt();
			
			if(number % 2 == 0) {
				numbers2[i] = number;
				i++;
			} 
			
			if(i == numbers2.length) {
				break;
			}
		}
	
	}
}   	
