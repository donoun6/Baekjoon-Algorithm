package test4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main6 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] arr = new int[10];
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine())%42;
		}
		for(int i = 0; i < arr.length; i++) {
			int cnt = 0;
			for(int j = i; j >= 0; j--) {
				if(arr[i] != arr[j]) {
					cnt++;
				}
				if(cnt == i) {
					count++;
				}
			}
		}
		bw.write(count + "\n");
		
		bw.flush();
		bw.close();
		br.close();
	}
}
