package ex;

public class Ex02 {

	public static void main(String[] args) {

		// ���ڿ��� ���ڷ�
		
		String numberString1 = "30";
		String numberString2 = "20";
		
		System.out.println(numberString1 + numberString2);
		
		int number1 = Integer.parseInt(numberString1);
		int number2 = Integer.parseInt(numberString2);
		
		System.out.println(number1 + number2);
		
		numberString1 = String.valueOf(number1);
		numberString2 = String.valueOf(number2);
		numberString1 = number1 + " ";
		numberString2 = number2 + " ";
		
		System.out.println(numberString1 + numberString2);
		
		// ���ڿ� ��
		String word1 = "�����";
		//String word2 = "�����";
		String word2 = new String("�����");
	
		if(word1 == word2) {
			System.out.println("�δܾ�� ��ġ�Ѵ�!");
		} else {
			System.out.println("�δܾ�� �ٸ���!");
		}
			
		if(word1.equals(word2)){
			System.out.println("�δܾ�� ��ġ�Ѵ�!");
		}
		if(word1.equals("�����")){
			System.out.println("�δܾ�� ��ġ�Ѵ�!");
		}
		
		
	}
	}


