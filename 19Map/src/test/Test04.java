package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test04 {

	public static void main(String[] args) {

		// 1.��Ƽ�� ���ϱ�
		// �ʿ��� ��Ƽ���� ������ ���
		// Ž���� Iterator ���
		// myCharacter�� ���� ������ ���������� ���� ����ĺ��� ��� ���
		// ���� ������ ���� �� ������ ���� ���� ����� ���
		
		Map<String, String> myCharacter = new HashMap<>();
        myCharacter.put("�г���", "���κ�Ƴ�");
        myCharacter.put("����", "������");
        myCharacter.put("����", "B");
        myCharacter.put("����", "38");

        // [{�г���=�г���1, ����=����, ����=5}, {�г���=�г���1, ����=����, ����=5}...]
        List<Map<String, String>> characters = new ArrayList<>();
        
        Map<String, String> character1 = new HashMap<>();
        character1.put("�г���", "���ڰ����");
        character1.put("����", "����");
        character1.put("����", "A");
        character1.put("����", "11");
        characters.add(character1);

        Map<String, String> character2 = new HashMap<>();
        character2.put("�г���", "�ϱ���");
        character2.put("����", "������");
        character2.put("����", "B");
        character2.put("����", "46");
        characters.add(character2);

        Map<String, String> character3 = new HashMap<>();
        character3.put("�г���", "�ٴ�");
        character3.put("����", "����");
        character3.put("����", "B");
        character3.put("����", "23");
        characters.add(character3);

        Map<String, String> character4 = new HashMap<>();
        character4.put("�г���", "�ʺ�");
        character4.put("����", "����");
        character4.put("����", "A");
        character4.put("����", "4");
        characters.add(character4);

        Map<String, String> character5 = new HashMap<>();
        character5.put("�г���", "����");
        character5.put("����", "����");
        character5.put("����", "B");
        character5.put("����", "84");
        characters.add(character5);

        // TODO: ����
        
        int maxLevel = 0;
        
        Map<String, String> maxHealer = null; // �ִ뷹�� ������ ���ϱ����� ���� ������ ����
        
        for(Map<String, String> character : characters) {
        	
        	String myServer = myCharacter.get("����");
	        if(character.get("����").equals(myServer) && character.get("����").equals("����")) {
	        	
	        	int level = Integer.parseInt(character.get("����"));
	        	
	        	// if(maxHealer == null){
	        	//	maxHealer = character;
	        	//	continue;
	        	//	}
	        	
	        	// String levelString = character.get("����");
	        	// int level = Intger.parseInt(levelString);
	        	
	        	// String maxLevelString = maxHealer.get("����");
	        	// int maxLevel = Intger.parseInt(maxLevelString);
	        	
	        	if(maxLevel < level) {
	        		maxLevel = level;
	        	
	        		maxHealer = character;
	        
	        	}
	        } 	
	     }
        System.out.println("���� Ž�� ���");
    	System.out.println("�г��� : " + maxHealer.get("�г���"));
    	System.out.println("���� : " + maxHealer.get("����"));
    	System.out.println("���� : " + maxHealer.get("����"));
    	System.out.println("���� : " + maxLevel);
      
}
}

