package test.test01;

public class ProductMange {
	
	private String name;
	private int price;
	private String expiration;
	
	
	public ProductMange(String name, int price, String expiration) {
		this.name = name;
		this.price = price;
		this.expiration = expiration;
	}
	
	int sumPrice(int count) {
		int result = this.price * count;
		return result;
	}
	

	void printInfo() {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + price);
		System.out.println("������� : " + expiration);
	}
	
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
	}
}
