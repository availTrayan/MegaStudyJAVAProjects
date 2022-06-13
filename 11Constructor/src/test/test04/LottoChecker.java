package test.test04;

import java.util.Random;

public class LottoChecker {
	
	// ��÷��ȣ
	private int[] winNums;
	
	public LottoChecker() {
		this.winNums = new int[6];
	}

	// ��÷��� - ��÷��ȣ ����� 
	
	public void drawWinNums() {
		Random rand = new Random();
		for(int i = 0; i < winNums.length; i++) {
				int randomNum = rand.nextInt(45)+1;
				this.winNums[i] = randomNum;
						
			for(int j = 0; j < i; j++) { //���� ���� ������ i
				if(randomNum == this.winNums[j]) {
					// �ߺ��� ������ i�� �ٽ� �ݺ��ؼ� �̱�
						i--; 
					break;
				}
			}
		}
	}
	
	// ��÷��ȣ ���
	public void printWinNums() {
		for(int i = 0; i < this.winNums.length; i++) {
			System.out.print(this.winNums[i] + " ");
		}
		System.out.println();
	}
	
	public String checkWin(Lotto lot) {
		
		int count = 0;
		int[] markings = lot.getMarkings();
		
		for(int i = 0; i < markings.length; i++) {
			
			int target = markings[i]; // ��ġ���� Ȯ���� ������ ����
			for(int j = 0; j < this.winNums.length; j++) {
				if(target == this.winNums[j]) {
					count++;
					break;
				}
			}
		}
		
		switch (count) {
		case 6 : 
			return "1��";
			// break; return�� �ϸ� break �ʿ����
		case 5 : 
			return "2��";
		case 4 : 
			return "3��";
		case 3 : 
			return "4��";
		case 2 : 
			return "5��";
		default : 
			return "��!";
		}
		
	}
	
		
}
	
	

