package test11;

import java.io.*;

public class Main {
	private static int ans = 1;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		factorial(Integer.parseInt(br.readLine()));
		System.out.println(ans);
	}
	
	public static void factorial(int N) {
		if(N == 0) { return;}
		ans *= N;
		factorial(N-1);
	}
}
