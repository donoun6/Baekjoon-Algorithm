package test6;

import java.io.*;
import java.util.StringTokenizer;

public class Main4 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int a = Integer.parseInt(br.readLine());
		for(int i = 0; i < a; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int num = Integer.parseInt(st.nextToken());
			String[] text = st.nextToken().split("");
			for(int j = 0; j < text.length; j++) {
				for(int k = 0; k < num; k++) {
					bw.write(text[j]);
				}
			}
			bw.newLine();
		}
		br.close();
		bw.close();
	}
}
