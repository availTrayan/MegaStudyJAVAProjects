package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Test01 {

	public static void main(String[] args) {
		
		Map<String, Integer> scores = new HashMap<>();
		
		// 1. �ڷ��Է�
		scores.put("����", 90);
		scores.put("����", 85);
		scores.put("����", 90);
		scores.put("��ȸ", 80);
		scores.put("����", 100);
		
		System.out.println(scores);
		
		// 2. �� ����
		scores.put("��ȸ", scores.get("��ȸ") + 5);
		System.out.println(scores);
		
		// �� ã��
		Scanner scan = new Scanner(System.in);
		
		System.out.print("��ȸ�� ������� �Է��ϼ��� : ");
		String subject = scan.nextLine();
		
		if(scores.get(subject) != null) {
			System.out.println(subject + " : " + scores.get(subject));
		} else {
			System.out.println("�ڷ����");
		}
		// �� ã�� 4
		
		Set<String> keys = scores.keySet();
		
		for(String key : keys) {
			
			if(scores.get(key) >= 90) {
				System.out.print(key + " ");
			}
		
	}
	}
}
