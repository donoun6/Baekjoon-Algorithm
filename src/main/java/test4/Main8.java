package test4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main8 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a = Integer.parseInt(br.readLine());
		String[] arr = new String[a];
		
		int total = 0;
		int point = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = br.readLine();
			for(int j = 0; j < arr[i].length(); j++) {
				if(arr[i].split("")[j].equals("O")) {
					point++;
					total += point;
				}else {
					point = 0;
				}
			}
			bw.write(total+"\n");
			total = 0;
			point = 0;
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
