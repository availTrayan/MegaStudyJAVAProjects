package test.test02;

public class Test02 {

	public static void main(String[] args) {

		Student std = new Student("�����", "��õ��", "010-1234-5678", "����");
		
		std.printInfo();
		std.setSchool("�ҷ���");
		std.printInfo();
		std.sendScheduleMessage();
		std.sendMessage("������!");
		
		Galaxy gal = new Galaxy("1234567890");
		
		gal.setPhoneNum("010-1234-3333");
		gal.showInfo();
		gal.callPhone("010-0000-9999");
		gal.sendMessage("010-1234-5678", "�ڴ�??");
		
	}

}
