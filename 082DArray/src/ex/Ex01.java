package ex;

public class Ex01 {

	public static void main(String[] args) {

		// ���� ���� ������ �迭
		int[][] scores = {
				{95, 90, 100, 95, 94}, 
				{80, 85, 88, 84, 92},
				{40, 55, 64, 45, 50}
			};
		
		System.out.println("�ι�° �л��� �׹�° ���� : " + scores[1][3]);
		System.out.println("����° �л��� �ι�° ���� : " + scores[2][1]);
		System.out.println("ù��° �л��� ����° ���� : " + scores[0][2]);
		
		for(int i = 0; i < scores.length; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print(scores[i][j] + " ");
			}
			System.out.println();
		}
		
		// ������ �迭 ����
		// �л��� ����
		
		for(int i = 0; i < scores.length; i++) {
			int sum = 0;
			for(int j = 0; j < scores[i].length; j++) {
				sum += scores[i][j];
			}
			System.out.println("�л��� ���� : " + sum);
		} 
		
		
		
	}

}
