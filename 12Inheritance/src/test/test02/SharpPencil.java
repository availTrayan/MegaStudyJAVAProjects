package test.test02;

public class SharpPencil extends Ballpen {
	
	 
	private int width; // ���� ����
    private int amount; // ���� ��
     
    
     public SharpPencil(int amount, String color, int width) {
 		super(amount, color);
 		this.width = width;
 	}

     public void printInfo() {
    	 super.printInfo();
    	 System.out.println(width);
     }
}
