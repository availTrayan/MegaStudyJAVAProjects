package test.test01;

public class iPhone extends iPodTouch {
	
	// ��ȭ�ϱ�, �޽��� ������
	
	private String phoneNum;
	
	public iPhone(String phoneNum) {
		super();
		this.setModel("iPhone");
		this.phoneNum = phoneNum;
	}
	
	@Override
    public String infoString() {
		return super.infoString() + "\n��ȭ��ȣ : " + this.phoneNum;
    }
	
    public void calling(String num) {
    	System.out.println(num + "�� ��ȭ��");
    }

    public void sendMessage(String num2, String message) {
    	System.out.println(num2 + " �� " + message + " ����");
    }
    
}
