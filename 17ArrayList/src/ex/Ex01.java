package ex;

import java.util.ArrayList;
import java.util.List;

public class Ex01 {

	public static void main(String[] args) {

		
		// ����Ʈ ��ü ����
		ArrayList<Integer> integerList = new ArrayList<>();
		
		// ��ĳ���� ���·� ���� �Ϲ����� �������
		List<Integer> integerList2 = new ArrayList<>();
		
		// �� �߰��ϱ�
		integerList.add(4);
		integerList.add(8);
		
		System.out.println(integerList);
		
		integerList2.add(3);
		integerList2.add(6);
		
		integerList.addAll(integerList2);
		
		System.out.println(integerList);
		
		// �ε����� ���� �� �����ϱ�
		integerList.add(1, 5);
		System.out.println(integerList);
		
		// �ε����� �� ������ �����ϱ�
		Integer number = integerList.get(2);
		int intNumber = integerList.get(2);
		
		System.out.println(number);
		System.out.println(intNumber);
		
		// �� �����ϱ�
		integerList.set(0, 2);
		System.out.println(integerList);
		
		// �ε����� �� �����ϱ�
		integerList.remove(1);
		System.out.println(integerList);
		
		// ���� �����ϱ� 2
		Integer removeNumber = integerList.remove(1);
		System.out.println(removeNumber);
		
		// ��� �� �����
		integerList.clear();
		System.out.println(integerList);
		
		
		// ���ڿ� ����Ʈ
		List<String> stringList = new ArrayList<>();
		stringList.add("���");
		stringList.add("��");
		stringList.add("����");
		
		System.out.println(stringList);
		
		
	}

}
