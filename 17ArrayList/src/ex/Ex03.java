package ex;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ex03 {

	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<>();
		
		numbers.add(5);
		numbers.add(3);
		numbers.add(8);
		numbers.add(1);
		numbers.add(4);
		numbers.add(6);
		
		// ���� ���� Ȯ��
		// 6�� ���ԵǾ� �ִ��� Ȯ��
		
		if(numbers.contains(6)) { // �ݺ��� ��� contains �޼ҵ�� boolean ��ȯ
			System.out.println("6�� ���Ե�");
		}
		
		// ����
		// ��������, ��������, �������� �� �ڵ�����δ� �������
		// �� ����, �������� �ӵ��� ���� ���
		
		// �������� 1 2 3 4
		numbers.sort(Comparator.naturalOrder()); // ����Ʈ�� ���� �޼ҵ�
		System.out.println(numbers); // ���ĵ� ����Ʈ ���
		
		// �������� 4 3 2 1
		numbers.sort(Comparator.reverseOrder());
		System.out.println(numbers);
		
		numbers.clear();
		
		// ����ִ��� Ȯ��
		if(numbers.isEmpty()) {
			System.out.println("����Ʈ�� ��� �ִ�.");
		}
	}

}
