package test;

public class Test02 {
	
	// ����Ǵ� ��¹��� �Լ��� �ۼ�
	public static void print2DArray(int[][] numbers) {
		
		for(int i = 0; i < numbers.length; i++) {
			for(int j = 0; j < numbers[i].length; j++) {
				System.out.print(numbers[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		
		// 1. 10 �Է��ϱ�
		/*
		int[][] numbers = new int[2][3];
		
		for(int i = 0; i < numbers.length; i++) {
		
			for(int j = 0; j < numbers[i].length; j++) {
			
				numbers[i][j] = 10;
			}
		}
		print2DArray(numbers);
		}
		*/
		
		// 2. ������� �Է��ϱ�
		/*
		int[][] numbers = new int[3][4];
	
		for(int i = 0; i < numbers.length; i++) {
			
			for(int j = 0; j < numbers[i].length; j++) {
				
				numbers[i][j] = j + 1;
				
			}
		}
		print2DArray(numbers);
	  }
	*/
		
		
		// 3. �迭 ���� �Է��ϱ�
		/*
		int[][] numbers = new int[3][3];

		for(int i = 0; i < numbers.length; i++) {
			
			for(int j = 0; j < numbers[i].length; j++) {
				
				numbers[i][j] = i + 1;
			}
		}
		print2DArray(numbers);
		}
		*/
		
		// 4. +�� �׸���
		/*
		int[][] numbers = new int[5][5];
	
		for(int i = 0; i < numbers.length; i++) {
			
			for(int j = 0; j < numbers[i].length; j++) {
				
				if(i == 2 || j == 2) {
					
					numbers[i][j] = 1;
				}
			}
		}	
		
		print2DArray(numbers);
		}
		*/
		
		// 5. ��ü �� �Է�
		/*
		int[][] numbers = new int[3][3];
		int printNum = 1;
		
		for(int i = 0; i < numbers.length; i++) {
			
			for(int j = 0; j < numbers[i].length; j++) {
			
				numbers[i][j] = printNum;
	
				System.out.print(printNum + " ");
				
				printNum++;
			}
			System.out.println();
		}
		*/
		
		// 6. ��ü �� �Է�
		
		int[][] numbers = new int[3][3];
		int number = 1;
		for(int i = 0; i < numbers.length; i++) {
			
			for(int j = 0; j < numbers[i].length; j++) {
				
				// numbers[i][j] = i + 1 + (j * 3);
				// 
				// numbers[j][i] = number; �ε����� ���η� �����ϱ����� i�� j�� ����
				number++;
				System.out.print(numbers[i][j] + " ");
				
			}
			
			System.out.println();
		}
}
	}

	
