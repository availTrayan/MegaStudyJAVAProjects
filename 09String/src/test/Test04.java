package test;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {

		// 1. ���ڿ� �˻�
		/*
		String[] files = {"cat.jpg", "dog.png", "kakao.exe", "tree.jpg", "eclipce.exe", "tmp.txt", "phone.jpg"};
		int jpgCount = 0;
		
		for(int i = 0; i < files.length; i++) {
			if(files[i].endsWith("jpg")){
				jpgCount++;
			}
		}
		System.out.println("jpg ���� ���� : " + jpgCount);
		*/
		
		// 2. �� �ܾ� ����
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("�¸��� ����� �Է��ϼ��� : ");
		System.out.println("����� ����� �Է��ϼ��� : ");
		System.out.println("��ǻ�͸� ����� �Է��ϼ��� : ");
		System.out.println("��Ʈ���� ����� �Է��ϼ��� : ");
		
		String word1 = sc.nextLine();
		String word2 = sc.nextLine();
		String word3 = sc.nextLine();
		String word4 = sc.nextLine();
		
		String word1Answer = "victory";
		String word2Answer = "love";
		String word3Answer = "computer";
		String word4Answer = "notebook";
		
		int point = 0;
		
		if(word1.equals(word1Answer)) {
			point += 25;
		} 
		if(word2.equals(word2Answer)) {
			point += 25;
		} 
		if(word3.equals(word3Answer)) {
			point += 25;
		} 
		if(word4.equals(word4Answer)) {
			point += 25;
		} 
	
		System.out.println("������ "  + point + "�� �Դϴ�.");
		*/
		
		// 3. ���ڿ� �˻�
		
		String membersString = "������:�۰�ȣ:���켺:�̹�ȣ:�۰�ȣ:�̹���:�̹���:������:�̺���:������";
		
		String[] members = membersString.split(":");
		
		int equalsCount = 0;
		
		for(int i = 0; i < members.length; i++) {
			String targetMember = members[i];
			int count = 0;
			if(targetMember.equals(" ")) {
				continue;
			}
			
			
			for(int j = 0; j < members.length; j++) {
				if(targetMember.equals(members[j])) {
					count++;
					members[j] = "";
				}
				
				if(count > 1) {
					equalsCount++;
					break;
				}
			}
		}
	
		
		System.out.println("���� ���� �� : " + equalsCount);
	}

}
