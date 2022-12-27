package test10;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main8 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int [N][2];
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int X = Integer.parseInt(st.nextToken());
			int Y = Integer.parseInt(st.nextToken());
			arr[i][0] = X;
			arr[i][1] = Y;
		}
		
		Arrays.sort(arr, (arr1, arr2) -> { //람다식
			if(arr1[0] == arr2[0])  {
				return arr1[1] - arr2[1];
			}
			else {
				return arr1[0] - arr2[0];	
			}
		});
		
		for(int i = 0; i < arr.length; i++) {
			bw.write(arr[i][0] +" "+ arr[i][1]+"\n");
		}
		bw.flush();
	}
}

