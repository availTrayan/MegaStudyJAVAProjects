package test.test02;

public class StopWatch extends Thread {
	
	private boolean stop; // stop flag
	
    public void work(String command) {
    	
    	System.out.println("��ž��ġ ����!!");
  
    	while(command.equals("����")) {
    		
	    	this.run();
	    	
    	if(command.equals("�׸�")) {
    		
		    this.setStop(true);
		    }
    	}	
    }
    
    
	public void run(boolean stop) {
		
      	int timeCount = 0;
  	
        while (!stop) {
            // ���� ����
        	try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				timeCount++;
			}
        }
        System.out.println(timeCount);
    }
    

    public void setStop(boolean stop) {
    	
        this.stop = stop;
    }
	
	

}
