package test;

public class Test033 {

	public static void main(String[] args) {

		int day = -2;
	    System.out.println(" 2020 / 7 \n");
	    System.out.println("  S   M   T   W   T   F   S ");
	    
	    for(int i = 0; i < 5; i++) {
	    	
	        for(int j = 0; j < 7; j++) {
	        	
	            if(day > 0) {
	            	
	                if(day < 10) { // �� ������ ������ �޷��� �������ٴ°��� Ȯ�������� ������ �𸣰ڽ��ϴ�.
	                	
	                    System.out.print("  " + day + " ");
	                    
	                } else {
	                	
	                	System.out.print(" " + day + " ");
	                }
	                
	            } else {
	            	
	            	System.out.print("    ");
	            }
	            
	            day++;
	            
	            if(day > 31) {
	                break;
	            }
	        }
	        System.out.println();
		
	}
  }
}
