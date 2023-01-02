package test11;

import java.io.*;

public class Main2 {
	private static int ans = 0;
	private static int num = 0;
	private static int n1 = 1;
	private static int n2 = 0;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		factorial(Integer.parseInt(br.readLine()));
		System.out.println(ans);
	}
	
	public static void factorial(int N) {
		if(N == 0) {
			return;
		}else {
			num = n1 + n2;
			n2 = n1;
			n1 = num;
			ans = n2;
		}
		factorial(N-1);
	}
}