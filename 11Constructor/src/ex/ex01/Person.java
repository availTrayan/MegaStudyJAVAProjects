package ex.ex01;

public class Person {
	
	private String name;
	private int age;
	
	// ������
	public Person(String name, int age) {
		System.out.println("Person ����");
		this.name = name; // private ��� ������ �Ķ���� ����
		this.age = age;
	}
	
	public String getName() {
		
		return name;
		// return this.name �Ķ���Ϳ� name�� ������ ������ ����
	}
	// getter�� ���� ��������
	public int getAge() {
		return age;
	}
	
	// setter�� ���� ����
	public void setAge(int age) {
		this.age = age;
	} // source �޴��� generate getter and setter�� ��������
	
	// ��ü ���� ��� ���
	public void printInfo() { // ������ ��Ȯ�ϴٸ� getter���̵�
		System.out.println("�̸� : " + this.name + " " + "���� : " + this.age);
	}
	
}
