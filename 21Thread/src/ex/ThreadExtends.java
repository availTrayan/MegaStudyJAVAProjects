package ex;

public class ThreadExtends extends Thread {
	
	private String resource;
	
	public ThreadExtends(String resource) {
		this.resource = resource;
	}

	@Override
	public void run() {
		// ������ ������ ������
		// Ư�� ���ڿ��� 10�� ���
		
		for(int i = 0; i < 5; i++) {
			System.out.println(resource);
			
			// ���ý������� �����尣 �۾���ȯ Ȯ���ϱ����� 1�� ���� ����
			try { 
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
