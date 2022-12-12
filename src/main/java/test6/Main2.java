package test6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		String b = br.readLine();
		String[] arr = b.split("");
		long ans = 0;
		for(int i = 0; i < a; i++) {
			ans += Integer.parseInt(arr[i]);
		}
		System.out.println(ans);
		br.close();
	}
}
