package test3;

import java.io.*;

public class Main12 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int input = Integer.parseInt(br.readLine());
		int a = (input/10 + input%10)%10 + (input%10*10);
		int count = 1;
		
		while (a != input) {
			int b = ((a%10)*10);
			a = (a/10 + a%10);
			int c = (a%10)+b;
			a = c;
			count++;
		}
		
		bw.write(String.valueOf(count));
		br.close();
		bw.flush();
		bw.close();
	}
}
