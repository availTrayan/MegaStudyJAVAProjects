package test;

public class Person {
	
	private String name;
	private int birth;
	
	public Person(String name, int birth) {

		this.name = name;
		this.birth = birth;
	}
	
	@Override
	public String toString() {
		return "�̸� : "+  this.name + " ���� : " + this.birth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirth() {
		return birth;
	}

	public void setBirth(int birth) {
		this.birth = birth;
	}
	
	

}
