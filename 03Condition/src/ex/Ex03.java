package ex;

public class Ex03 {

	public static void main(String[] args) {
		
		int weight = 72;
		// �����԰� 70���ϸ� ġŲ ����
		// �׷��� ������ ������ ����
		
		if(weight <= 70) {
			System.out.println("ġŲ ����");
		} else {
			System.out.println("������ ����");
		}
		
		// �����԰� 70���ϸ� ġŲ����
		// �׷��� �ʰ� �����԰� 75���ϸ� �߰����� ����
		// �׷��� �ʰ� �����԰� 80���ϸ� �����峪 ����
		// �׷��� ������ ����!!
		
		if (weight <= 70) {
			System.out.println("ġŲ ����");
		} else if (weight <= 75){
			System.out.println("�߰����� ���� !!");
		} else if (weight <= 80) {
				System.out.println("������ ����");
		} else {
			System.out.println("����!!");
			
		}

	}

}
