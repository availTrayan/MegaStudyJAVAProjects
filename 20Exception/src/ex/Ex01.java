package ex;

public class Ex01 {
	
	// 1���� 5������ ���� �޾Ƽ� ó���ϴ� �޼ҵ�
	//�ƹ��ǹ� ���� �޼ҵ� �����Ҷ� ��ӵ� �̸�
	
	public static void foo(int number) throws Exception { 
		
		if(number < 1 || number > 5) {
			throw new Exception(); // �޼ҵ� �ڿ� ������ �־����
		}
		
	}

	public static void main(String[] args) throws Exception {

		String str = null;
		int[] array = {1, 2, 3};
		
//		str.length();
		
		try { // try���� ���ܰ� �߻��ϸ� �ϴ��ڵ���� ������� �ʰ� catch�� �ѱ��
			str.length();
			array[5] = 1;
		} catch(Exception e) {
			System.out.println("���ܻ�Ȳ �߻�");
		}
//		} catch(NullPointerException e) {
//			System.out.println("NPE�� �߻��ߴ�.");
//		} catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("�迭 �ε��� ���� �߻�");
//		}
		
		// �ڵ带 �����ð� ��� �����.
		// �и������� ���� 1/1000
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			foo(3);
		} catch (Exception e) {
			System.out.println("�߸��� ����");
		}
		
		foo(5); // ���θ޼ҵ�� ����ó�� ��ü�� �ѱ�������� ���ο��� ����� ����
		
	}
	
}
