package test01;
import java.util.Scanner;

public class 환산 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("금액을 입력하시오(원).>>");
		int intArray[] = new int[7];

		    int i = 0;
		    int max = 0;
				for(i=0; i<intArray.length; i++) {
				intArray[i]=scanner.nextInt();
					if(intArray[i]>max)
						max=intArray[i];
			}
				
		
		
		
				
	}

}
