package ex;

public class Ex01 {
	
	// main thread
	public static void main(String[] args) {
		
//		ThreadExtends th1 = new ThreadExtends("@@@@");
//		ThreadExtends th2 = new ThreadExtends("$$$$");
//		th1.run(); // ���ξ����忡�� ���ư��� �޼ҵ�
//		th1.start(); // ���� ������ ����
//		th2.start();
		
		ThreadImplements ti1 = new ThreadImplements("####");
		ThreadImplements ti2 = new ThreadImplements("%%%%");
		
		Thread thread1 = new Thread(ti1);
		Thread thread2 = new Thread(ti2);
		
		thread1.start();
		thread2.start();
		
		System.out.println("main Thread");
		
		// �ٸ� ������ ��ٸ���
		try {
			thread1.join(); // ���� ���ܴ� �ϳ��� ó��
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("����!!");
		
	}

}
