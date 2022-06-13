package ex.ex01;

public class Student extends Person {
	
	private String school;
	
	public Student(String name, int age, String school) {
		
		super(name, age); // �θ�Ŭ���� ������ ȣ��� ��������
		System.out.println("Student ������"); // �θ������ ���� ȣ���� �ڽĻ����� ȣ��
		this.school = school;
	}
	
	// �޼ҵ� Override
	// Overloading vs Override
	
	@Override
	public void printInfo() {
		super.printInfo(); //�θ� Ŭ���� �޼ҵ� ȣ��
		/*
		 * System.out.println(this.name + "�Դϴ�!"); 
		 * System.out.println("���̴� " + this.age + "�Դϴ�!");
		 */
		System.out.println(this.school + "�� �ٴմϴ�.");
	}

}
