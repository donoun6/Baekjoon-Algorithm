package test7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main6 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		for(int root = 0; root < testCase; root++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
			int count = 0;
			while(count != k) {
					for(int i = 1; i < n; i++) {
						arr[i] += arr[i-1];
					}
					count++;
				}
			System.out.println(arr[n-1]);
		}
	}
}
