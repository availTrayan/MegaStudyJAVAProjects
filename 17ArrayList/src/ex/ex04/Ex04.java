package ex.ex04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex04 {

	public static void main(String[] args) {

		List<Member> memberList = new ArrayList<>();
		
		Member member = new Member("�����", "010-1234-5678");
		memberList.add(member);
		member = new Member("���缮", "010-1344-7788");
		memberList.add(member);
		
		memberList.add(new Member("��ȣ��", "010-5234-1255"));
		memberList.add(new Member("��ȿ��", "010-5354-1285"));
		
		System.out.println(memberList); // List�� ��ü�� �ּҸ� �����ϹǷ� toString�� �����ؾ��Ѵ�.
	
		Member me = memberList.get(0);
		System.out.println(me.getName());
		
		for(int i = 0; i < memberList.size(); i++) {
			Member item = memberList.get(i);
			System.out.println("�̸�1 : "  + item.getName());
		}
		
		for(Member item : memberList) {
			System.out.println("�̸�2 : "  + item.getName());

		}
		
		// �̸��� ������ ����� ���
		for(Member item : memberList) {
			String name = item.getName();
			
			if(name.startsWith("��")) {
			System.out.println("���� : "  + name);
			}
		}
		
		Iterator<Member> iter = memberList.iterator();
		while(iter.hasNext()) {
			Member item = iter.next();
			System.out.println("��ȭ��ȣ : " + item.getPhoneNum());
			
		}
		
		
	}

}
