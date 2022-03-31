package test01;

import java.util.Scanner;

public class 알파벳행렬 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("소문자 알파벳 하나를 입력하시오.>>");
		String s = scanner.next();
		
		char c = s.charAt(0);
		char stringArray[][]= new char[5][];
			stringArray[0]= new char[5];
			stringArray[1]= new char[4];
			stringArray[2]= new char[3];
			stringArray[3]= new char[2];
			stringArray[4]= new char[1];
			
			
			for(char i ='a'; i<stringArray.length; i++)
				for(char j='a'; j<stringArray[i].length; j++)
					stringArray[i][j]= s.charAt(0);
			
			for(char i=c; i<stringArray.length; i--) {
				for(char j=c; j<stringArray[i].length; j--)
					System.out.print(stringArray[i][j]+" ");
			}
				System.out.println();
			scanner.close();
	}
		
		
}
