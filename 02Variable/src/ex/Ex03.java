package ex;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		// �Է¹ޱ� ���� ������
		Scanner scan = new Scanner(System.in);
		/*
		System.out.print("������ ������ �Է��ϼ���: ");
		// �ֿܼ��� ������ ���� �Է¹ޱ�
		int noodlecup = scan.nextInt();
		
		System.out.println("������ ���� : " + noodlecup + "��");

		// ������ 5742�� �������
		
		int total = noodlecup * 5742;
		System.out.println("������ 5742���� ������ : " + total + "��");
		*/
		
		// ������ ���ݰ� ������ �Է¹ް� ���
		/*
		System.out.print("������ ���� �Է�: ");
		int noodlecup = scan.nextInt();
		System.out.print("������ ���� �Է�: ");
		int count = scan.nextInt();
		*/
		// �ΰ��� ���ڸ� ������� �Է¹ް� ���
		System.out.print("������ ���ݰ� ������ ������� �Է��ϼ��� :");
		int noodlecup = scan.nextInt();
		int count = scan.nextInt();
		System.out.println("������ ����� " + noodlecup * count + "��");
		
		// �Ҽ� �Է¹ޱ�
		double pi = scan.nextDouble();
		System.out.println("���̴� " + pi);
		
		scan.close(); //��Ʈ�� ���� ����
		
	}

}
