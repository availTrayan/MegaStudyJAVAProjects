package ex;

public class Ex02 {

	public static void main(String[] args) {
		
		// �Ǽ� (�Ҽ�)
		double pi = 3.14;
		
		// ����
		char quiz = 'o';
		
		// ���
		System.out.println("������ : " + pi);
		System.out.println("1�� ���� : " + quiz);
		
		
		// ����ȯ
		int intpi = (int)pi;
		System.out.println("int pi : " + intpi);
		
		double doublepi = intpi;
		System.out.println("double pi : " + doublepi);
		
		// ��� ���ϱ�
		int score1 = 95, score2 = 100;
		
		// double average = (score1 + score2)/2;
		double average = (score1 + score2)/2.0;
		System.out.println("��� : " + average);
		
		
	}
}
