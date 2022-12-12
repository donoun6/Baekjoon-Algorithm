package test5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main2 {
	 
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(String.valueOf(n(Integer.parseInt(br.readLine()))));
		br.close();
		bw.flush();
		bw.close();
	}
	public static int n (int number) {
		int count = 0;
		if(number <= 99) {
			count = number;
		}else {
			count = 99;
			for(int i = 1; i <= number; i++) {
				int[] arr = new int[3];
				while(i>99) {
					arr[0] = i/100;
					arr[1] = (i/10)%10;
					arr[2] = i%10;
					if(arr[1]-arr[0] == arr[2]-arr[1]) {
						count++;
					}
					break;
				}
			}
		}
		return count;
	}
}