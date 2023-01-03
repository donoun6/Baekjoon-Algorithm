package test11;

import java.io.*;
import java.util.StringTokenizer;

public class Main5{
	static String[][] star;
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int none = 3;
		star = new String[N][N];
		
		for(int i = 0; i < star.length; i++) {
			for(int j = 0; j < star.length; j++) {
				star[i][j] = "*";
				if(i == none/3 && j == none/3) {
					star[none][none] = " ";
				}
			}
		}
		

		for(int i = 0; i < star.length; i++) {
			for(int j = 0; j < star.length; j++) {
				System.out.print(star[i][j]);
			}
			System.out.println();
		}
	}
}
