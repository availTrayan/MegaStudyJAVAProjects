package ex;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Ex01 {

	public static void main(String[] args) {

		// �Է� ���� �״�� ������ ��
		Set<Integer> hash = new HashSet<>();
		
		// ���� ũ���� ����ȴ�.
		// �Է� 3 5 2 7 1
		// ���� 1 2 3 5 7
		// ���Ķ����� �ӵ��� ����
		Set<Integer> tree = new TreeSet<>();
		
		hash.add(5);
		hash.add(7);
		hash.add(3);
		
		System.out.println(hash);
		
		// HashSet�� �ߺ����� ���θ� Ȯ���Ҽ� ����
		boolean flag = hash.add(7);
		System.out.println(flag);
		
		hash.remove(7);
		System.out.println(hash);
		
		if(hash.contains(3)) {
			System.out.println("3�� ������");
		}
		
		// �ݺ���
		for(Integer number : hash) {
			System.out.print(number + " ");
		}
		
		Iterator<Integer> iter = hash.iterator();
		while(iter.hasNext()) {
			int number = iter.next();
			System.out.println(number);
		}
		
		
	}

}
