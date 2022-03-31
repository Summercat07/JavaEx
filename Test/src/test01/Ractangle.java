package test01;

import java.util.Scanner;

public class Ractangle {
		int width;
		int height;
		
		public int getArea() {
			return width*height;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ractangle rect = new Ractangle();
		Scanner scanner = new Scanner(System.in);
		System.out.print(">> ");
		
		rect.height = scanner.nextInt();
		rect.width = scanner.nextInt();
		
		System.out.println("사각형의 면적은 "+ rect.getArea());
		
		scanner.close();
	}

}
