package ex;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		// ���ڿ� ���� �� �ʱ�ȭ
		
		String text = "Hello world";
		
		System.out.println(text);
		
		// ���ڿ� ����
		int number = 10;
		System.out.println(text + number);
		
		String text2 = "!!!";
		System.out.println(text + text2);
		
		String newText = text + text2;
		System.out.println(newText);
		
		// ���ڿ� �Է�
		Scanner sc = new Scanner(System.in);
		
		/*
		 * String scanText1 = sc.next(); 
		 * String scanText2 = sc.next();
		 */
		String scanLine = sc.nextLine();
		
		/*
		 * System.out.println(scanText1); 
		 * System.out.println(scanText2);
		 */
		System.out.println(scanLine);
		
		// ���ڿ� �迭
		String[] texts = {"cat", "dog", "apple"};
		
		for(int i = 0; i < texts.length; i++) {
			System.out.println(texts[i]);
		}
	}

}
