package test10;

import java.io.*;

public class Main3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int index = Integer.parseInt(br.readLine());
		int[] arr = new int[index];
		int tmp = 0;
		for(int i = 0; i < arr.length; i++) {
			arr[i]= Integer.parseInt(br.readLine());
		}
		while(index != 0) {
			
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}