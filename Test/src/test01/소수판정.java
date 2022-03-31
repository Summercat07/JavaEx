package test01;
import java.util.Scanner;


public class 소수판정 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int n, m;
		System.out.println("소수판정 범위를 입력하세요.");
		System.out.print("첫번째 양의 정수를 입력하세요 : ");
		n = scanner.nextInt();
		System.out.print("두번째 양의 정수를 입력하세요 : ");
		m = scanner.nextInt();
		
		int small, big;
		if(n == m) {
			System.out.print("잘못입력했습니다.");
			return;
		}
		else if(n > m) {
			big = n;
			small = m;
		}
		else {
			big = m;
			small = n;
		}
		
		boolean[] pn = new boolean[big];
		for(int i=0; i<pn.length; i++)
			pn[i] = true;
		pn[0] = pn[1] = false;
		
		int count = 0;
		for(int i=0; i<pn.length; i++) {
			if(pn[i]==true) {
				if(small < i)
				System.out.print(i + "\t");
				count++;
				if(count%10 == 0)
					System.out.println();
			for(int j=i*2; j<pn.length; j+=i) {
				pn[j] = false;
     		}
			
     	}
		
	 }				
			
   }
	
}
