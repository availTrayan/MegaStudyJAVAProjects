package test.test022;

public class Shape {
	// �����̸�
	private String name;
	
	public Shape(String name) {
		this.name = name;
	}
	
	// ���̸� ����ϴ� ���
	
	public double calculateArea() {
		return 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	// ���� ��� �޼ҵ�
	public void printArea() {
		System.out.println(this.name + "�� ���̴� " + this.calculateArea());
	}

}
