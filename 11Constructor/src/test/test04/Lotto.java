package test.test04;

import java.util.Random;

public class Lotto {
	
	// ��ŷ�� ������ �迭
	private int[] markings;
	
	public Lotto() {
	// �����ڿ��� ��ŷ�� �迭�� �ʱ�ȭ	
		this.markings =  new int [6];
	}
	
	// �������� ��ȣ ��ŷ
	public void manualMarking(int mark1, int mark2, int mark3, int mark4, int mark5, int mark6) {
		this.markings[0] = mark1;
		this.markings[1] = mark2;
		this.markings[2] = mark3;
		this.markings[3] = mark4;
		this.markings[4] = mark5;
		this.markings[5] = mark6;
	}
	
	// �ڵ����� ��ȣ ��ŷ
	public void AutoMarking() {
		
		Random rand = new Random();

		for(int i = 0; i < 6; i++) {
			int randomNum = rand.nextInt(45) + 1;
			this.markings[i] = randomNum;
			
			// ���Ӱ� �������� �̹� �迭�� �ִ��� Ȯ��
			
			for(int j = 0; j < i; j++) { //���� ���� ������ i
				if(randomNum == this.markings[j]) {
					// �ߺ��� ������ i�� �ٽ� �ݺ��ؼ� �̱�
					i--; 
					break;
				}
			}
		}
	}

	
	// ��ŷ�� ��ȣ Ȯ�ο�
	public void printNums() {
		
		for(int i = 0; i < markings.length; i++) {
			System.out.print(markings[i] + " ");
		}
		System.out.println();
	}
	
	public int[] getMarkings() {
		return this.markings;
	}


	
	
	
	
	
	
}
