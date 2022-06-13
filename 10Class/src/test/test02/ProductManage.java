package test.test02;

public class ProductManage {
	
	public String name;
	public int price;
	public String expiration;
	
	int sumPrice(int count) {
		int result = price * count;
		return result;
	}
	

	void printInfo() {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + price);
		System.out.println("������� : " + expiration);
	}
	
	// ������ѿ� ���� �Ǹ� ���� ���� Ȯ�ΰ���
	
	boolean availableSale(String today) {
		
		// ũ�� ���� �۴�
		// ������ �� ũ�� 1
		// ������ 0
		// �������� �� ũ�� -1
		/*
		 * if(expiration.compareTo(today) == -1) { return false; } else { return true; }
		 */
		
		// "2021-03-02" �и�
		String[] dates = expiration.split("-");
		String[] todays = today.split("-");
		// ������� ����� ����
		int year = Integer.parseInt(dates[0]);
		int month = Integer.parseInt(dates[1]);
		int day = Integer.parseInt(dates[2]);
		
		// ���� ��¥ ����� ����
		int todayYear = Integer.parseInt(todays[0]);
		int todayMonth = Integer.parseInt(todays[1]);
		int todayDay = Integer.parseInt(todays[2]);
		
		// "2021-03-02"
		// "2022-06-02"
		
		// ������ ���ú��� ū ���
		if(year > todayYear) {
			return true;
		} else if(year == todayYear && month > todayMonth) { // ������ �����鼭 
		
			return true;
		} else if(year == todayYear && month == todayMonth && day >= todayDay){
			return true;
		}
		
		return false;
		
		// 20200000
		/*
		 * int yyyymmdd = (year * 10000) + (month * 100) + day; int todayYyyymmdd =
		 * (todayYear * 10000) + (todayMonth * 100) + todayDay;
		 */
		
}
}