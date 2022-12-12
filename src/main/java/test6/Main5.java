package test6;

import java.io.*;

public class Main5 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String text = br.readLine().toUpperCase();
		int[] numArr = new int[26];
		for(int i = 0; i < text.length(); i++) {
			numArr[text.charAt(i)-65] += 1;
		}
		int index = 0;
		int code = -2;
		for(int i = 0; i < numArr.length; i++) {
			if(index == numArr[i]) {
				code = -2;
			}
			if( index < numArr[i]) {
				index = numArr[i];
				code = i;
			}
		}
		System.out.println((char)(code + 65));
		br.close();
	}
}
