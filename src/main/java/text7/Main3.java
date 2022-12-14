package text7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int root = 2;
		int n = 1;
		int m = 2;
		int count = 1;
			while(count > a) {
				if(a == 1) {System.out.println("1/1");break;}
				if(root%2 == 0) {
					n++;
					m--;
					count++;
					if(m == 1) {
						root++;
					}
				}
				if(root%2 != 0) {
					n--;
					m++;
					count++;
					if(n == 1) {
						root++;
					}
				}
				if(count == a ) {
					System.out.println(n+"/"+m);
					break;
				}
			}
	}
}
