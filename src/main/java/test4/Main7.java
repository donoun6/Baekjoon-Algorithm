package test4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main7 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int a = Integer.parseInt(br.readLine());
		String[] b = br.readLine().split(" ");
		
		double[] arr = new double[a];
		int max = 0;
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(b[i]);
			if(arr[i] > max) {
				max = (int) arr[i];
			}
		}
		
		int count = 0;
		double avg =0;
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (arr[i]/max) * 100;
			count++;
			avg = (avg+arr[i]);
			if(count == arr.length) {
				avg = avg/a;
			}
		}
		bw.write(String.valueOf(avg));
		
		bw.flush();
		bw.close();
		br.close();
	}
}
