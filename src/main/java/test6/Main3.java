package test6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split("");
		int[] numArr = new int[26];
		for(int i = 0; i < numArr.length; i++) {
			numArr[i] = -1;
		}
		for(int i = 0; i < arr.length; i++) {
			if(numArr[(int)arr[i].charAt(0)-97] == -1) {
				numArr[(int)arr[i].charAt(0)-97] = i;
			}
		}
		for(int j = 0; j < numArr.length; j++) {
			System.out.print(numArr[j]+" ");
		}
	}
}
