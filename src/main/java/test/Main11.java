package test;

import java.util.Scanner;

public class Main11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		scanner.close();
		System.out.println(((b%10))*a);
		System.out.println(((b%100)/10)*a);
		System.out.println(((b%1000)/100)*a);
		System.out.println(b*a);
	}
}
