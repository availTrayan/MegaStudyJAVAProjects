package ex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex02 {

	public static void main(String[] args) {

		List<String> fruits = new ArrayList<>();
		
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("grape");
		fruits.add("banana");
		fruits.add("banana");

		for(int i = 0; i < fruits.size(); i++) {
			
			// �ε��� ����� �ݺ���
			
			 String item = fruits.get(i); 
			
			// banana ����
			if(item.equals("banana")) {
				fruits.remove(i);
				
			}
		}
		System.out.println(fruits);
		
		// ���� for�� (foreach)
		for(String item : fruits) { // String item = fruits.get(i); �� item��� ���
			// System.out.println(item);
			/*
			 * if(item.equals("banana")) { fruits.remove(item); }
			 */
		}
		System.out.println(fruits);
		
		// Iterator Ȱ��
		Iterator<String> iter = fruits.iterator(); //����Ʈ �ݺ������� �� ������ iterator �����ǻ��
		
		while(iter.hasNext()) {
			
			String item = iter.next();
			// System.out.println(item);
			if(item.equals("banana")) {
				iter.remove();
			}
		}
		System.out.println(fruits);
		
		
	}

}
