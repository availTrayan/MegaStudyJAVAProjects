package ex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex01 {

	public static void main(String[] args) {

		// id - �̸� (key - value)
		
		Map<String, String> ids = new HashMap<>();
		ids.put("trayan", "�����");
		ids.put("yoo", "���缮");
		
		System.out.println(ids);
		
		//����
		ids.put("trayan", "�ڸ��");
		System.out.println(ids);
		// �˻�
		System.out.println(ids.get("trayan"));
		
		//Ű�� ���ԵǾ� �ִ���
		if(ids.containsKey("yoo")){
			System.out.println("yoo Ű�� ����");
		}
		
		Set<String> keys = ids.keySet();
		System.out.println(keys);
		
		for(String key : keys) {
			System.out.println(key + " : " + ids.get(key));
		}
		
		Iterator<String> iter = keys.iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			System.out.println(key + " : " + ids.get(key));

		}
		
		ids.remove("trayan");
		System.out.println(ids);
		
		// Ŭ������ ����ϰ� Ȱ��
		// �̸� ���� �����ϴ� ��
		Map<String, String> person = new HashMap<>();
		person.put("name", "�����");
		person.put("age", "29");
		
		//person.name, person.age
		System.out.println(person.get("name"));
		System.out.println(person.get("age"));
		
	}

}
