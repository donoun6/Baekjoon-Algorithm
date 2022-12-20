package test8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int index = Integer.parseInt(br.readLine());
		int ans = index;
		StringTokenizer st= new StringTokenizer(br.readLine());
		for(int i = 0; i < index; i++) {
			int num = Integer.parseInt(st.nextToken());
			int count = 0;
			for(int j = 1; j <= num; j++) {
				if(num == 1) {
					ans--;
					break;
				}
				if(num%j == 0) {
					count++;
					if(count > 2) {
						ans--;
						break;
					}
				}
			}
		}
		System.out.println(ans);
	}
}
