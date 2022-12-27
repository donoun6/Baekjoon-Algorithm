package test10;

import java.io.*;

public class Main7 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] N = br.readLine().split("");
		int[] arr = new int[10];
		for(int i = 0; i < N.length; i++) {
			arr[Integer.parseInt(N[i])]++;
		}
		for(int i = 9; i >= 0; i--) {
			while(arr[i] != 0) {
				bw.write(String.valueOf(i));
				arr[i]--;
			}
		}
		bw.flush();
	}
}

