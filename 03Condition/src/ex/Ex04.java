package ex;

public class Ex04 {

	public static void main(String[] args) {
		
		// A �̸� �Ұ��
		// B �̸� ����
		// C �̸� ġŲ
		// �׿ܸ� ���

		char grade = 'A';
		
		switch(grade) {
		case 'A' : 
			System.out.println("�Ұ�� ����");
			break;
			
		case 'B' :
			System.out.println("���� ����");
			break;
			
		case 'C' : 
			System.out.println("ġŲ ����");
			break;
		default : 
			System.out.println("��� ����");
		}
		
		// A,B�̸� ���� C�̸� ġŲ �׿� ���
		
		switch (grade) {
		case 'A' :
		case 'B' :
			System.out.println("����");
			break;
		case 'C' :
			System.out.println("ġŲ");
			break;
		default : 
			System.out.println("���");
		}
		
	}

}
