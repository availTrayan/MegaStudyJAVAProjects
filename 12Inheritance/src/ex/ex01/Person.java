package ex.ex01;

public class Person {
	
	// �̸�, ����, 
	private String name;
	private int age;
	
	public Person() {
		System.out.println("Person ������");
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// ������� ���
	public void printInfo() {
		System.out.println(this.name + "�Դϴ�.");
		System.out.println("���̴� "  + this.age + "�Դϴ�.");
	}

}
