package test;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {

		// 1. ���� ���ڿ� ��ȯ
		
		int year = 2000;
		int month = 11;
		int day = 15;
		
		String yearString = String.valueOf(year);
		String monthString = String.valueOf(month);
		String dayString = String.valueOf(day);
		
		System.out.println(yearString + monthString + dayString);
		
		// 2. ���ڿ� ���� ��ȯ
		
		String yearString2 = "1995";
		
		int age = 2022 - Integer.parseInt(yearString2);
		
		System.out.println("1995�� ���� ���̴� " + (age + 1) + "��");
		
		
		// 3. ���� ����
		
		String[] goods = {"�����", "������", "�Ŷ��", "��ī�ݶ�", "������", "������", "�����", "�Ŷ��"};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("��ǰ�� : ");
		String good = sc.next();
		
		int count = 0;
		
		for(int i = 0; i < goods.length; i++) {
			if(good.equals(goods[i])){
				count++;
			}
		}
		System.out.println(count + "��");
	}

}
