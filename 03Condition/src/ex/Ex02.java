package ex;

public class Ex02 {

	public static void main(String[] args) {
		
		// ������ �Ȱ� ������ 70���ϸ� ġŲ����
		// ������ �ȴ´� �׸��� �����԰� 70�����̴�. �׷��� ġŲ����

		int walking = 10000;
		int weight = 68;
		
		if (walking > 10000 && weight <= 70) {
			System.out.println("ġŲ����");
		} 
		
		// ������ �Ѱų� �����԰� 70���ϸ� ġŲ����
		// ������ �Ѵ´� �Ǵ� �����԰� 70���ϴ� �׷��� ġŲ����
		
		if (walking > 10000 || weight <= 70 ) {
			System.out.println("ġŲ���� !!!!");
		}
		
		int number = 30;
		// 10 <= number <= 40 
		if(10 <= number && number <= 40) {
			System.out.println("10���� ũ�� 40���� �۴�");
		}
		// 10 > number , number > 40
		if ( 10 > number || number > 40) {
			System.out.println("10���� �۰ų� 40���� ū��");
		}
		
	}

}
