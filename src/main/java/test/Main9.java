package test;

import java.util.Scanner;

public class Main9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int [] c = {1,1,2,2,2,8};
		int [] num = new int[6]; 
		for(int i = 0; i < c.length; i++) {
			num[i] = c[i] - scanner.nextInt();	
			}
		for(int j = 0; j < num.length; j++) {
			System.out.print(num[j] + " ");
		}
	}

}
