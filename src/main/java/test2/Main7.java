package test2;

import java.util.Scanner;

public class Main7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		scanner.close();
		if(a==b && a==c && b==c ) {
			System.out.println(10000+a*1000);
		}else if(a==b || a==c || b==c) {
			if(a==b) {System.out.println(1000+a*100);}else
			if(a==c) {System.out.println(1000+a*100);}else
			if(b==c) {System.out.println(1000+b*100);}
		}else {
			int[] abc = {a,b,c};
			int max = 0;
			for(int i = 0; i < abc.length; i++ ) {
				if ( abc[i] > max) {
					max = abc[i];
				}
			}
			System.out.println(max*100);
		}
		
	}
}
