package test;

import java.util.ArrayList;
import java.util.List;

public class Test01 {

	public static void main(String[] args) {

		// 1. List �����
		List<Integer> integerList = new ArrayList<>();
		
		integerList.add(3);
		integerList.add(8);
		integerList.add(9);
		integerList.add(4);
		integerList.add(2);
		integerList.add(1);
		integerList.add(7);
		integerList.add(5);
		
		System.out.println(integerList);
		
		// 2. �� �����ϱ�
		integerList.set(3, 6);
		System.out.println(integerList);
		
		// 3. �� �����ϱ�
		integerList.add(2, 10);
		System.out.println(integerList);
		
		// 4. �� �����ϱ�
		integerList.remove(1);
		integerList.remove(6);
		System.out.println(integerList);
	}

}
