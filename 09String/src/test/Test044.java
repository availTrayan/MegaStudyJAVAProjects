package test;

public class Test044 {

	public static void main(String[] args) {

		// 3. ���ڿ� �˻�
		
				String membersString = "������:�۰�ȣ:���켺:�̹�ȣ:�۰�ȣ:�̹���:�̹���:������:�̺���:������";
				
				String[] members = membersString.split(":");
				
				int equalsCount = 0;
				
				for(int i = 0; i < members.length; i++) {
					String targetMember = members[i];
					int count = 0;
					if(targetMember.equals(" ")) {
						continue;
					}
					
					
					for(int j = 0; j < members.length; j++) {
						if(targetMember.equals(members[j])) {
							count++;
							members[j] = "";
						}
						
						if(count > 1) {
							equalsCount++;
							break;
						}
					}
				}
				System.out.println("���� ���� �� : " + equalsCount);
		
	}

}
