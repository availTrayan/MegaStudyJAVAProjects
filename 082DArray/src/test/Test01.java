package test;

public class Test01 {

	public static void main(String[] args) {

		int[][] scores = {
			    {89, 93, 91, 93, 92, 78, 90, 90, 93, 90},
			    {91, 82, 72, 98, 92, 87, 77, 87, 74, 88},
			    {98, 93, 94, 91, 97, 94, 91, 96, 98, 90},
			    {65, 63, 57, 87, 88, 92, 78, 85, 100, 68},
			    {45, 50, 48, 63, 67, 58, 40, 66, 47, 64}
			};
		
		// 1. �л� �� ��� ���ϱ�
		/*
		for(int i = 0; i < scores.length; i++) {

			int sum = 0;
			double average = 0;
			
			for(int j = 0; j < scores[i].length; j++) {
				 sum += scores[i][j];
				 average = sum / 10.0;
			}
			
			System.out.println((i + 1) + "��° �л��� ��� : " + average);
		}
		*/
		
		/*
		// 2. �л� �� �ְ��� ���ϱ�
		for(int i = 0; i < scores.length; i++) {

			int max = 0;
			
			for(int j = 0; j < scores[i].length; j++) {
				 
				if(scores[i][j] > max)
				max = scores[i][j];
				
			}
			
			System.out.println((i + 1) + "��° �л��� �ְ��� : " + max);
		}
		*/
		
		
		// 3. ��� �ְ��� ���ϱ�
		/*
		double maxAverage = 0;
		int stIndex = 0;
		double average = 0;
		
		for(int i = 0; i < scores.length; i++) {
			
			int sum = 0;
			
			for(int j = 0; j < scores[i].length; j++) {
				 sum += scores[i][j];
				 average = sum / 10.0;
						
			if(average > maxAverage) {
				maxAverage = average;
				stIndex = i + 1;
			}
		}

		}
		System.out.println("����� ���� ���� �л� : " + stIndex + "��° �л�");
		System.out.println("��� : " + maxAverage);
		*/
		
		
		// 4. Ư�� ���� �ְ���
		int max = scores[0][4];
		int stIndex = 0;
		
		for(int i = 0; i < scores.length; i++) {

			// �̹� ���ǹ����� �������ֱ� ������ ���� �ݺ����� �ʿ����
				if(scores[i][4] > max) {
					max = scores[i][4];
					stIndex = i + 1;
				}	
		}
		System.out.println("4��° ������ �ְ� �����ڴ� : " + stIndex+ "��° �л�");
		System.out.println("���� : " + max);
		}
	
	
	
	// 5. �Ϻ� ��� �ְ���
	/*
	double average = 0;
	double maxAverage = 0;
	int stIndex = 0;
	
	for(int i = 0; i < scores.length; i++) {
		
		int sum = 0;
		
		for(int j = 3; j < 8; j++) {
			sum += scores[i][j];
			average = sum / 5.0;
		}
		
		if(average > maxAverage) {
			maxAverage = average;
			stIndex = i;
		}
	  }
	System.out.println("����� ���� ���� �л� : " + stIndex + "�� index");
	System.out.println("��� : " + maxAverage);
	}
	*/
}

