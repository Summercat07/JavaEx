package test02;
import java.util.Scanner;

	
public class 선택정렬 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		//배열 선언, 점수 입력
		int[] inputArr = new int[10];
		int max=0, temp =0;
		
		System.out.print("10개의 점수를 공백을 두고 나누어 입력하시오>>");
		
			
		for(int i=0; i<10; i++) {
				inputArr[i] = scanner.nextInt();
				
			}
			 
		//Selection sort//
			
			for(int i =0; i<9; i++) {
				 max = inputArr[i]; 
				for(int j = 0; j<(10-1); j++) {					   
						if(inputArr[j]> max) {
							temp = max;
							max = inputArr[j];							
						}
				}
				System.out.print(inputArr[i] + "  ");
			
			temp=max;
			max = inputArr[9-i];
			inputArr[0] = temp;
			
			}
			
			System.out.println();
			
			scanner.close();			
		
	}

}
