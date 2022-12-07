package test2;

import java.util.Scanner;

public class Main6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int h = scanner.nextInt();
		int m = scanner.nextInt();
		int a = scanner.nextInt();
		scanner.close();
		
		int addT = a/60;
		int addM = a%60;
		
		h = addT + h;
		m = addM + m;
		
		if(m > 59) {
			h++;
			m = m - 60;
			if(h > 23) {
				h = h - 24;
				System.out.println(h+" "+m);
			}else {
				System.out.println(h+" "+m);
			}
		}else {
			if(h > 23) {
				h = h - 24;
				System.out.println(h+" "+m);
			}else {
				System.out.println(h+" "+m);
			}
		}
		
	}
}
