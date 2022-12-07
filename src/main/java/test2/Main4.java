package test2;

import java.util.Scanner;

public class Main4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		scanner.close();

		if(a>0 && b>0) {
			System.out.println(1);
		}else if(a<0 && b>0) {
			System.out.println(2);
		}else if(a<0 && b<0) {
			System.out.println(3);
		}else if(a>0 && b<0) {
			System.out.println(4);
		}
		
	}
}
