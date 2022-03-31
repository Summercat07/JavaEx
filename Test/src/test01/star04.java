package test01;

public class star04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i=0; i<(5*2)-1; i ++) {
			for(int j=0; j<(5*2)-1; j++) {
				if(i == 4 | i+4 == j | i+j == 4)
					System.out.print('*');
				else
					System.out.print(' ');
			}
					System.out.print('\n');
		}
		
	}
	
 }