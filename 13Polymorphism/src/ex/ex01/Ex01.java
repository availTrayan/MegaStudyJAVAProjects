package ex.ex01;

import test.test01.Animal;
import test.test01.Cat;
import test.test01.Dog;

public class Ex01 {
	
	// ������ �����Ҹ��� ���� �ϴ� �޼ҵ�
	public static void cryAnimal(Animal animal) {
		animal.cry();
	}
	
	public static void main(String[] args) {

		Dog dog = new Dog("����");
		dog.eat();
		dog.cry();
		dog.lash();
		
		Cat cat = new Cat("����");
		cat.eat();
		cat.cry();
		cat.grooming();
		
		// ��ĳ����
		// �θ�Ŭ���� ������ �ڽ� Ŭ���� ��ü ����
		
		// int num = 10;
		// double doubleNum = num;
		// int num2 = (int)doubleNum;
		
		Animal animal = new Dog("����"); // dog�� animal Ŭ���� �̸����� ����
		animal.eat();
		animal.cry();
		
		// �ٿ�ĳ����
		Dog dog2 = (Dog)animal; //  animal�� dog Ŭ���� �̸����� ����
		dog2.lash();
		
		// ��ĳ���� Ȱ�� animal ��Ӱ�ü���� �ϳ��� �޼ҵ�� ���
		cryAnimal(cat);
		cryAnimal(dog);
		
		// ��ĳ���� Ȱ��2
		Animal[] animals = new Animal[2];
		animals[0] = dog;
		animals[1] = cat;
		
		for(int i = 0; i < animals.length; i++) {
			animals[i].cry();
			
			// Ư�� ��ü�� Ư�� Ŭ�������� Ȯ��
			if(animals[i] instanceof Cat) {
			// ����̴� �׷��
			Cat bada = (Cat)animals[i];
			bada.grooming();
			}
		}
		
	}
}
