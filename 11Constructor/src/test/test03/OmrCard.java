package test.test03;

public class OmrCard {
	
	// �̸�, �й�, ��ŷ�� ����
	private String name;
	private String studentId;
	private int[] marking = new int[5];
	
	
	
	// �й��� �̸��� �Է¹޴� ������
	public OmrCard(String name, String stNum) {
		this.name = name;
		this.studentId = studentId;
//		marking = new int[5];  // �ʱ�ȭ�ҰŸ� ������ �ȿ��� �ϴ°� ����
	}
	
	
	// ������ ������ �Է¹޴� �޼ҵ�
	public void setMarking(int[] marking) {
			this.marking = marking;
	}
	
	public void setMarking(int answer1, int answer2, int answer3, int answer4, int answer5) {
		this.marking[0] = answer1;
		this.marking[1] = answer2;
		this.marking[2] = answer3;
		this.marking[3] = answer4;
		this.marking[4] = answer5;
	}
	
	// �������� ��ŷ�Ҽ��ִ� ����� �޼ҵ� �����ε�
	public void setMarking(int number, int answer) {
		this.marking[number - 1] = answer; // ��ȣ�� �´� �ε����� ���丶ŷ
	}

	// ���Ȯ�ο�
	public void printInfo() {
		System.out.println("�̸� : " + this.name + " ���� : " + this.studentId);
		
		for(int i = 0; i < this.marking.length; i++) {
			System.out.print(this.marking[i] + " ");
		}
		System.out.println();
	}
	
	public int[] getMarking() {
		return this.marking;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getStudentId() {
		return this.studentId;
	}

}


