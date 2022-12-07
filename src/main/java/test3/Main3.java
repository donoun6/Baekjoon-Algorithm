package test3;

import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		
		int i = 0;
		for(int j = 1; j <= a; j++) {
			i += j;
		}
		System.out.println(i);
	}
}
