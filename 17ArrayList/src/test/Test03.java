package test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		
		// 1. id �ߺ� üũ
		List<String> stringList = new ArrayList<>();
		
		stringList.add("hagulu");
		stringList.add("happy");
		stringList.add("google");
		stringList.add("bts");
		stringList.add("iu");
		stringList.add("cuteboy");
		
		Scanner scan = new Scanner(System.in);
		System.out.print("id : ");
		String id = scan.nextLine();
		for(int i = 0; i < stringList.size(); i++) {
		
			if(stringList.contains(id)) {
			
		}
	   }
		System.out.println("�ߺ� �Դϴ�.");
		
		
		// 2. ü�� ��� ��� ����
		List<Integer> points = new LinkedList<>();
		points.add(8);
		points.add(7);
		points.add(6);
		points.add(10);
		points.add(9);
		points.add(4);
		
		
		points.sort(Comparator.naturalOrder()); 
		
		Integer min = points.get(0);
		Integer max = points.lastIndexOf(points);
		
		Iterator<Integer> iter = points.iterator(); 
		
		points.remove(0);
		points.remove(points.size() - 1);
		
			 Integer sum = 0; 
			 
			 iter = points.iterator();
			 
			  while(iter.hasNext()) { 
				  
				 Integer num = iter.next(); 
				 sum += num; 
				}
			 
			 Double average = (double) (sum / points.size());
			 System.out.println(average);
			 
			 
			 
		// 3. �ζ� ��ȣ
		/*	 
		List<Integer> lotNum = new ArrayList<>();	 
			 
		Random random = new Random();
			 
		for(int i = 0; i < 5; i++) {
			
			Integer randomNum = lotNum.get(i);
			
			randomNum = random.nextInt(45) + 1;	
			
		}	
					
			iter = lotNum.iterator();
			while(iter.hasNext()) {
				Integer number= iter.next();
				
				if(lotNum.contains(number)) {
					iter.remove();
				}
				
			}
			System.out.println(lotNum);
			*/
			 
		// 4. ȸ�� �߰��ϱ�
		
		List<String> memberList = new ArrayList<>();
		memberList.add("���");
		memberList.add("����");
		memberList.add("���");
		memberList.add("����");
		memberList.add("�κ�");
		
		System.out.println(memberList);
		
		List<String> memberList2 = new ArrayList<>();
		memberList2.add("����Ű");
		memberList2.add("����");
		memberList2.add("����");
		memberList2.add("�κ�");
		memberList2.add("����");
			
		System.out.println(memberList2);
		// System.out.println(memberList + memberList2);
		
		}

  }


