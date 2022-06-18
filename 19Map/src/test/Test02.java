package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Test02 {
	
	public static final Map<String, String> capitalMap = new HashMap<String, String>() {
        {
            put("���ѹα�", "����");
            put("����ũ", "�����ϰ�");
            put("����", "������");
            put("���þ�", "��ũ��");
            put("���⿡", "���");
            put("�����", "���������");
            put("������", "����Ȧ��");
            put("������", "����");
            put("������", "���帮��");
            put("�Ƹ���Ƽ��", "�ο��뽺���̷���");
            put("����Ʈ", "ī�̷�");
            put("�̶�", "�����");
            put("��Ż����", "�θ�");
            put("�Ϻ�", "����");
            put("�ʸ���", "���Ҷ�");
            put("�ɶ���", "���Ű");
            put("������", "�ĸ�");
            put("��Ű", "��ī��");
            put("ĳ����", "��Ÿ��");
            put("�ݷҺ��", "����Ÿ");
        }
    };
	

	public static void main(String[] args) {

		// 1. �̾�ã��
		
		Map<String, Character> members = new HashMap<>();
		
		members.put("������", 'X');
		members.put("������", 'X');
		members.put("���缮", 'X');
		members.put("�̱���", 'X');
		members.put("�ڳ���", 'X');
		
		System.out.println(members);
		
		Set<String> nameSet = members.keySet();
		
		for(String name : nameSet) {
			if(name.startsWith("��")){
				members.put(name, 'O');
			}
		}
		System.out.println(members);
		
		// 2. ���� ���߱� ����
		
			Scanner scan = new Scanner(System.in);
	        Random rand = new Random();

	        Set<String> conturySet = capitalMap.keySet(); //keySet ����
	        List<String> conturyList = new ArrayList<>(conturySet); 
	        // �����̸� List�� index�� ���� ���� ���� keyList
	        
	 
	        int sum = 0;
	        
	        for(int i = 0; i < 5; i++) {
	        	
	        	int random = rand.nextInt(conturyList.size()); //20 + 1 ���ʿ����
	        	
	        	String contury = conturyList.get(random); //�����̸� �������� ��������
	      
	        	System.out.print(contury + "�� ���� �̸���? ");
	        	String answer = scan.nextLine();
	        	
	        	String correct = capitalMap.get(contury); //�����̸����� �������� �����̸�
	        	
		        		if(correct.equals(answer)) {
		        			System.out.println("����");
		        			sum += 20;
		        			
		        		} else {
		        			System.out.println("Ʋ�Ƚ��ϴ�.");
		        			
		        		  }
	        }
	        System.out.println("�������� " + sum);
	}
}
		
	
