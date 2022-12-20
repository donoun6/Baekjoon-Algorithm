package test7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = 2;
		int ans = 1;
		while(a >=  b) {
			b += (6*ans);
			ans++;
		}
		System.out.println(ans);
	}
}
