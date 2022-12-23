package test8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main6 {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int index = Integer.parseInt(br.readLine());
		
		for(int root = 0; root < index; root++) {
			int n = Integer.parseInt(br.readLine());
			int ans = n/2;
			boolean[] arr = new boolean[n+1];
			arr[0] = arr[1] = true;
			for(int i = 2; i < Math.sqrt(arr.length); i++) {
				for(int j = i+i; j <= n; j+=i) {
					arr[j] = true;
				}
			}
			for(int i = ans; i >= 2; i--) {
					if(!arr[i]&&!arr[n-i]) {
						System.out.println(i +" "+ (n-i));
						break;
					}
			}
		}
	}
}