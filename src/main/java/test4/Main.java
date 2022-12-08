package test4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int a = Integer.parseInt(br.readLine());
		String[] list = new String[a];
		String b = br.readLine();
		String c = br.readLine();
		int count = 0;
		for(int i = 0; i < list.length; i++) {
			list = b.split(" ");
			if(list[i].contentEquals(c)) {
				count++;
			}
		}
		bw.write(String.valueOf(count));
		bw.close();
		br.close();
	}
}
