package ex;

public class Ex01 {

	public static void main(String[] args) {

		// �迭 �ʱ�ȭ
		int[] scores = {85, 90, 95, 88, 93, 94};
		
		int[] numbers = new int[5];
		
		// �迭 �����ϱ�
		System.out.println("ù��° �� : " + scores[0]);
		System.out.println("�׹�° �� : " + scores[3]);
		
		// �迭 �� ����
		scores[0] = 90;
		System.out.println(scores[0]);
		
		int index = 4;
		System.out.println(scores[index]);
		scores[index] = 100;
		
		// ����!
		System.out.println(scores[5]);
		
		// �ݺ��� ����
		for(int i = 0; i < 6; i++) {
			System.out.println(scores[i]);
		}
		
		// �迭 ���� �� ��� ���ϱ�
		int sum = 0;
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("���� : " + sum);
	}

}
