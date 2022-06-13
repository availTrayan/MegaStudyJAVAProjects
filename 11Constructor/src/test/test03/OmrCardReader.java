package test.test03;

public class OmrCardReader {
	
	private int[] answers;

	public OmrCardReader() {
		answers = new int[5]; //answer�� ���� ���Ҽ��ֵ��� �����ڿ��� �ʱ�ȭ
	}

	public void setAnswers(int answer1, int answer2, int answer3, int answer4, int answer5) {
		this.answers[0] = answer1;
		this.answers[1] = answer2;
		this.answers[2] = answer3;
		this.answers[3] = answer4;
		this.answers[4] = answer5;
	}
	
	public void printInfo() {
		for(int i = 0; i < answers.length; i++) {
			System.out.print(answers[i] + " ");
		}
		System.out.println();
	}

	// ä�� ���, answers ����� ���޵� omr ī���� ������ ���ؼ� ���� ����
		public int checkScore(OmrCard card) {
			int score = 0;
			
			int[] marking = card.getMarking();
			
			for(int i = 0; i < marking.length; i++) {
				if(answers[i] == marking[i]) {
					score += 20;
				}
			}
			return score;
		}

	
		public void printResult(OmrCard card) {
			int score = this.checkScore(card);
	
			System.out.println("�̸� : " + card.getName());
			System.out.println("�й� : " + card.getStudentId());
			System.out.println("���� : " + score);
		}

		//������ ü�� ��� ���
		public void printResult(OmrCard[] card) {
			for(int i = 0; i < card.length; i++) {
				this.printResult(card[i]);
			}
		}

}
