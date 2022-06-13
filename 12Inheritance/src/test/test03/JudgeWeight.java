package test.test03;

public class JudgeWeight extends HealthInfo {
	
	private double normalWeight;
	
	public JudgeWeight(String name, double height, double weight) {
		super(name, height, weight);
	}
	
	public double calculSW() {
		
		this.normalWeight = (this.height - 100) * 0.9;
		return normalWeight;	
	}
	
	public void calculBMI() {
		
		double bmi = ((this.weight - calculSW()) / normalWeight * 100);
		
		if(bmi >= 20) {
			System.out.print(" => �� �Դϴ�.");
		} else if(bmi >= 10 && bmi < 20) {
			System.out.print(" => ��ü�� �Դϴ�.");
		} else {
			System.out.print(" => �����Դϴ�.");
		}
		
	}
	
	 public void showInfo() {
	        System.out.print(name + "���� ���� " + height + ", ������ " + weight + "kg");
	        calculBMI();
	    }
	
}
