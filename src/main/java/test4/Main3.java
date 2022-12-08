package test4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main3 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] arr = new String[Integer.parseInt(br.readLine())];
		String b = br.readLine();
		arr = b.split(" ");
		int max = Integer.parseInt(arr[0]);
		int min = Integer.parseInt(arr[0]);
		for(int i = 0; i < arr.length; i++) {
			if(max < Integer.parseInt(arr[i])) { max = Integer.parseInt(arr[i]); }
			if(min > Integer.parseInt(arr[i])) { min = Integer.parseInt(arr[i]); }
		}
		bw.write(min+" "+max);
		bw.flush();
		bw.close();
		br.close();
	}
}
