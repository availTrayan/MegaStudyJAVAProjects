package test;

public class Test02 {

	public static void main(String[] args) {
		
		// 1.�������
		/*
		������ �������ؼ� �������� ��¹��� ������ ��°���� ����
		*/
		
		int score1 = 90, score2 = 80;
		char grade1 = 'A', grade2 = 'B';
		double rate1 = 4.0, rate2 = 3.0;
		
		System.out.println("���� ������ " + score1 + "�� �̻��̸� \'" + grade1 + "\'�����̰� ������ " + rate1 +"�Դϴ�.");
		System.out.println("���� ������ " + score2 + "�� �̻��̸� \'" + grade2 + "\'�����̰� ������ " + rate2 +"�Դϴ�.");
		
		
		// 2.�Ǽ� ����
		int number1 = 33;
		double number2 = 35.325;
		double mul = number1 * number2;
		System.out.println("�� ���� �� : " + mul);
		
		// 3.��¥ ���ϱ�

		int day = 24;
		int answer = 943/day;
		System.out.println("943���� "+answer+"�� �Դϴ�.");	
		
		// 4. ���� ���� ���ϱ�
		int width = 8, length = 9;
		int square = width * length;
		double triangle = (width * length) /2;
		System.out.println("�簢���� ���� : " + square + "\n�ﰢ���� ���� : " + triangle);
		
	
	
		// 5. ��� ���ϱ�
		int korean = 93, math = 88, english = 94;
		int sum = korean + math + english;
		double average2 = (double)sum/3;
		System.out.println("���� " + korean + "��, " + "���� " + math +"��, " +"���� "+english +"��" + "\n���: " + average2);
		
		// 6. ȭ�� ���ϱ�
		int Celsius = 30;
		double Fahrenheit = (double) 9/5 * Celsius + 32;
		
		System.out.println("���� " + Celsius + "���� "+"ȭ�� " + Fahrenheit + "�� �Դϴ�." );
	}

}
