package ex;

public class Ex01 {

	public static void main(String[] args) {
		
		// ������ ���� �����ϱ�
		
		int noodlecup = 900;
		System.out.println(noodlecup);
		
		// ���� �̾ ����ϱ� , ���ڿ� ����
		
		System.out.println("������ ���� : " + noodlecup + "��");
		
		// �� �ٲ�
		System.out.println("�ȳ��ϼ��� \n�ݰ�����~~");
		
		// ����ǥ Ȱ���ϱ�
		System.out.println("���� �Ͽ��Ͽ� \"���� ��Ʈ������\"�� ���Ҵ�");
		
		// ����
		 
		// ������ 3���� �� ����
		int sum = noodlecup * 3;
		System.out.println("������ 3���� ����: " + sum + "��");
		
		// ������ ���� �λ�
		noodlecup = noodlecup + 50;
		sum = noodlecup * 3;
		System.out.println("�λ�� ������ 3���� ����: " + sum + "��");
		
		// 10,000������ ��� �ִ� �ִ� ������ ����
		int money = 10000;
		int count = money / noodlecup;
		System.out.println("�뵷���� �� �� �ִ� �������� �ִ� ���� = " + count + "��");
		
		// �ܵ� ���
		int change = money - (noodlecup * count);
		System.out.println("�ܵ� : " + change + "��");
		
	}
}
