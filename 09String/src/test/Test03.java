package test;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {

		// 1. ���ڿ� ��ȯ
		String gradeString = "My grade is A";
		gradeString = gradeString.replace("A", "B");
		System.out.println(gradeString);
		
		// 2. ���ڿ� �ڸ���
		
		String phoneNumber = "01012345678";
		
		String Numpart1 = phoneNumber.substring(0, 3);
		String Numpart2 = phoneNumber.substring(3, 7);
		String Numpart3 = phoneNumber.substring(7);
		System.out.println(Numpart1 + "-" + Numpart2 + "-" + Numpart3);
		
		// 3. ���ڿ� ���� ��ȯ
		
		String birthString = "19950721";
		String year = birthString.substring(0, 4);
		int age = 2022 - Integer.parseInt(year);
		System.out.println("1995���� ���̴� " + (age + 1) + "��");
		
		// 4. ���ڿ� �˻�
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�ܾ �Է��ϼ��� : ");
		String word = sc.nextLine();
		int eCount = 0;
		
		for(int i = 0; i < word.length(); i++) {
		if(word.charAt(i) == 'e') {
			eCount++;
		}
	  }
		System.out.println("e�� ������ " + eCount + "�� �Դϴ�.");
		
		// 5. �ܾ� �� ����
		
		String sentence = "To be, or Not to Be. That Is The Question";
		
		String[] splittedSentence = sentence.split(" ");
		int wordCount = 0;
		
		for(int i = 0; i < splittedSentence.length; i++) {
			
			if(splittedSentence[i] != " ") {
				wordCount++;
			}
		}
		System.out.println("�ܾ� ���� : " + wordCount + "��");
		System.out.println(splittedSentence.length);
	}
}

