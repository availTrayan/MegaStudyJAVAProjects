package ex.ex01;

public class Dog extends Animal {
	
	public Dog(String name) {
		super(name);
	}
	
	@Override
	public void cry() {
		System.out.println("��");
	}

	public void lash() {
		System.out.println("���� ������");
	}
	
}
