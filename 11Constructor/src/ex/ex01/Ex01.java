package ex.ex01;

public class Ex01 {

	public static void main(String[] args) {

		Person me  = new Person("�����" , 28);
		
		System.out.println(me.getName());
		me.setAge(28);
		System.out.println(me.getAge());
		me.printInfo();
		
	}

}
