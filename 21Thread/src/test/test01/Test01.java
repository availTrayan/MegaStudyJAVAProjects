package test.test01;

public class Test01 {

	public static void main(String[] args) {

		
		Animal tiger = new Animal("����");
		Animal cow = new Animal("����");
		Animal horse = new Animal("����");
		
		Thread thread1 = new Thread(tiger);
		Thread thread2 = new Thread(cow);
		Thread thread3 = new Thread(horse);
		
		thread1.start();
		thread2.start();
		
		try {
			thread1.join(); // ���� ���ܴ� �ϳ��� ó��
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		thread3.start();
		
		
		
	}

}
