package test.test02;

public class Galaxy {

	private String company;
	private String name;
	private String srNum;
	private String phoneNum;
	
	// ������
	public Galaxy(String srNum) {
		this.company = "�Ｚ"; // ������ ���� �̸� �־ ��
		this.name = "Galaxy";
		this.srNum = srNum;
	}
	
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	
	public void showInfo() {
		System.out.println(this.company + "���� ������ " + this.name +  "�Դϴ�.");
		System.out.println("��ȭ ��ȣ : " + this.phoneNum);
		System.out.println("�Ϸ� ��ȣ : " + this.srNum);		
	}
	
	public void callPhone(String phoneNum) {
		this.phoneNum = phoneNum;
		System.out.println(phoneNum + " �� ��ȭ�� �̴ϴ� �Ѹ�������...");
	}

	public void sendMessage(String phoneNum, String message) {
		this.phoneNum = phoneNum;
		System.out.println(phoneNum + " �� \"" + message +  "\" �޽����� �����մϴ�.");
	}
}
