package ex;

public class ThreadImplements implements Runnable { 
	
	// Runnable�� run ���� Ŭ���� 
	
	private String resource;
	
	public ThreadImplements(String resource) {
		this.resource = resource;
	}

	@Override
	public void run() {
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
