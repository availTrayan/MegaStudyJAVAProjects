package ex;

public class Ex01 {

	public static void main(String[] args) {

		// primitive Ÿ��
		int number = 10;
		System.out.println(number);
		
		// Wrapper class
		Integer number2 = 10;
		System.out.println(number2);
		
		Integer number21 = 10;
		
		Integer number3 = new Integer(10); // java9���� deprecated ��
		System.out.println(number3);
		
		if(number2 == number21) {
			System.out.println("��� 11"); //wrapper class�� ���簪�� ���ٸ� �ּҵ� ����.
		}
		
		if(number2 == number3) {
			System.out.println("��� 22"); //wrapper class�� �޸�Ǯ�� heap�� ����� ���̷� �ּҰ� �ٸ���
		}
		
		if(number2.equals(number3)) {
			System.out.println("��� 33");
		}
		
		if(number == number2) {
			System.out.println("��� 44"); // primitive �ڷ������� �񱳴� �ϳ����־ ��ȣ���� ����
		}
		
		if(number == number3) {
			System.out.println("��� 55");
		}
		
	}

}
