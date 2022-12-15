package text7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int index = Integer.parseInt(br.readLine());
		int n = 1;
		int m = 0;
		int col = 1;
		int count = 0;
			while (index > count) {
				if(col%2 != 0) {
					n--;
					m++;
					count++;
					if(n <= 0) {
						n++;
						col++;
					}
				}else if(col%2 == 0) {
					n++;
					m--;
					count++;
					if(m <= 0) {
						m++;
						col++;
					}
				}
			}
		System.out.println(m+"/"+n);
	}
}
