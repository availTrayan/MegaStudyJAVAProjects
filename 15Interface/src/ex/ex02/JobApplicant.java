package ex.ex02;

public class JobApplicant implements JavaProgramming {
	
	// �̸�, ����, ��������
	private String name;
	private int age;
	private int toeic;

	// �ڱ�Ұ� ���
	public void introduce() {
		System.out.println("���� ���ػ��̿���!!");
	}
	
	@Override
	public void programming() {
		System.out.println("����");
	}
	
}
