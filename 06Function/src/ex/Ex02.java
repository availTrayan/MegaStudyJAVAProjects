package ex;

public class Ex02 {

	// ������ ������ ���� ���� ��� �Լ�
	public static int getNoodlePrice(int count) {
		
		int result = 900 * count;
		return result;
		
	}
	
	// ������ ���ݰ� ������ ���޹޾� ������ ����ϴ� �Լ�
	// ���� �Լ��̸����� �Ķ���� ������ Ÿ���� �ٸ� �Լ��� ����� (�����ε�)
	public static int getNoodlePrice(int price, int count) {
		return price * count;
	}
	
	// �� ���� ���ϴ� �Լ�
	public static int sum(int x, int y) {
		int result = x + y;
		return result;
	}
	
	// ���� ���� ���� ���� ������ �͵� ���� �Լ�
	// Hello World�� �ι� ���
	
	public static void printHelloWorld() {
		System.out.println("Hello World");
		System.out.println("Hello World");
	}
	
	 // 1���� 10������ �� ���ϴ� �Լ�
	public static int sumAll() {
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		int result = getNoodlePrice(5);
		System.out.println("������ ���� : " + result + "��");
		
		int num1 = 10; 
		int num2 = 20;
		
		System.out.println(sum(5, 4 - 1));
		System.out.println(sum(num1, num2));
		System.out.println(getNoodlePrice(900, 4));
		printHelloWorld();
		System.out.println(sumAll());
		
	}

}
