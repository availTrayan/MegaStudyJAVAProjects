package ex.ex02;

public class Person02 extends Object{
	
	// �̸� ����
	private String name;
	private int age;
	
	public Person02(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// ������ ��� �޼ҵ� �����ۼ�
	
	 public String printInfo() {
		 return "�̸�  : " + this.name + " ���� : " + this.age; }
	 
	
	@Override
	public String toString() {
		return "�̸�  : " + this.name + " ���� : " + this.age;
	}
	
	

}
