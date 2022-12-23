package test10;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] arr = new int[Integer.parseInt(br.readLine())];
		for(int i = 0; i < arr.length; i++) {
			arr[i]= Integer.parseInt(br.readLine());
		}
		for(int i = 0; i < arr.length; i++) {
			int num = 0;
			for(int j = 0; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					num = arr[j];
					arr[j] = arr[i];
					arr[i] = num;
				}
			}
		}
		for(int i = arr.length-1; i >= 0; i--) {
			bw.write(String.valueOf(arr[i])+"\n");
		}
		bw.flush();
	}
}