package ex;

import org.w3c.dom.Text;

public class Ex03 {

	public static void main(String[] args) {

		// ���ڿ� ���� ���ϱ�
		
		String text = "Hello";
		int length = text.length();
		System.out.println("���� : " + length);
	

		// Ư�� ��ġ�� ���� ���ϱ�
		char alphabet = text.charAt(1);
		System.out.println(alphabet);
		System.out.println(text.charAt(4));
		
		// ���� �ϳ��ϳ��� ���ؼ� ���ڿ� ����ϱ�
		System.out.println(text);
		
		for(int i = 0; i < text.length(); i++) {
			System.out.println(text.charAt(i) + " ");
		}
		
		// ���ڿ� �ڸ���
		
		String phoneNumber = "01012345678";
		
		String Numpart1 = phoneNumber.substring(0, 3);
		String Numpart2 = phoneNumber.substring(3, 7);
		String Numpart3 = phoneNumber.substring(7);
		System.out.println(Numpart1 + "-" + Numpart2 + "-" + Numpart3);
		
		// Ư�� ���ڿ��� �����ϴ���?
		// Ư�� ���ڿ��� ��������?
		
		String name = "�����";
		// �Ⱦ�����?
		
		if(name.startsWith("��")) {
			System.out.println("����");
		} else {
			System.out.println("�ƴ�");
		}
		
		// �̸��� �������?
		if(name.endsWith("���")) {
			System.out.println("����");
		} else {
			System.out.println("�ƴ�");
		}
		
		// Ư�� ���ڿ� �ٲٱ�
		// ���� �̾��� �ٲ���
		
		String replaceName = name.replace("��", "��");
		// name = name.replace
		System.out.println(replaceName);
		
		// ���ڿ� �ɰ���
		String memberString = "���α�, ���缮, ����, Ȳ����, ����ȣ";
		
		// Ư�� ���ڿ��� �ɰ���
		String[] names = memberString.split(",");
		
		for(int i = 0; i < names.length; i++) {
		System.out.println(names[i]);
		}
	}
}