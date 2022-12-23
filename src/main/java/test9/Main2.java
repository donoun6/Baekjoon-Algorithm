package test9;

import java.io.*;
import java.util.StringTokenizer;

public class Main2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] arr = new int[9][9];
		int ans = 0;
		int x =0;
		int y =0;
		for(int i = 0; i < arr.length; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			for(int j = 0; j < arr.length; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				if(arr[i][j] > ans) {
					ans = arr[i][j];
					x = i;
					y = j;
				}
			}
		}
		System.out.println(ans);
		System.out.println((x+1)+" "+(y+1));
	}
}

