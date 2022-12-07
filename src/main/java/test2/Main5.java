package test2;

import java.util.Scanner;

public class Main5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		scanner.close();
		
		if(a == 0 && b < 45 ) {
			a = 23;
			b = 60 - (45 - b );
			System.out.print(a+" "+b);
		}else if( b < 45 ) {
			a = a - 1;
			b = 60 - (45 - b );
			System.out.print(a+" "+b);
		}else {
			b= b -45;
			System.out.print(a+" "+b);
		}
		
	}
}
