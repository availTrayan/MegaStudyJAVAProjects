package test.test02;

import java.util.Scanner;

public class Student {
	
	private String name;
	private String school;
	private String phone;
	private String subject;
	
	public Student(String name, String school, String phone, String subject) {
		
		this.name = name;
		this.school = school;
		this.phone = phone;
		this.subject = subject;
		
	}
	
	
	public void printInfo() {
		System.out.println(subject + " ����" + " : " + school + " " + name + "�л�");
	}
	
	public void setSchool(String school) {
		this.school = school;
		System.out.println(name + "���� �б��� " + school + "(��)�� ����Ǿ����ϴ�.");
	}
	
	public void sendScheduleMessage() {
		System.out.println(name + "�л����� " + "(" + phone + ")" + " �������� �޽����� �����մϴ�.");
	}
	
	public void sendMessage(String message) {
		System.out.println(name + "�л����� " + "(" + phone + ")" + message + " ��� �����մϴ�.");
	}
	
	
	

}
