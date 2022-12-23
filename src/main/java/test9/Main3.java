package test9;

import java.io.*;
import java.util.StringTokenizer;

public class Main3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int confetti = Integer.parseInt(br.readLine());
		boolean[][] arr = new boolean[100][100];
		int ans = 0;
		for(int root = 0; root < confetti; root++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			for(int i = x; i < x+10; i++) {
				for(int j = y; j < y+10; j++) {
					if(!arr[i][j]) {
						arr[i][j] = true;
						ans++;
					}
				}
			}
		}
		System.out.println(ans);
	}
}

