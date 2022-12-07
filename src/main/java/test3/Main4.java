package test3;

import java.util.Scanner;

public class Main4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int max = 0;
		for(int i = 0; i < b; i++) {
			int c = sc.nextInt();
			int d = sc.nextInt();
			max += c*d;
		}
		sc.close();
		if(max == a) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
