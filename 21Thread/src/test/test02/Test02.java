package test.test02;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		StopWatch watch = new StopWatch();
		
		System.out.println("������ ���� �����ġ�� ����ǰ�, �׸��� ���� �����ġ�� �ߴܵ˴ϴ�.");
		
		String command = scan.next();
		
		watch.work(command);
		
		command = scan.next();
		
		watch.work(command);
	
	}

	}

