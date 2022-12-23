package test10;

import java.io.*;
import java.util.StringTokenizer;

public class Main4 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[Integer.parseInt(st.nextToken())];
		int cut = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < arr.length; i++) {
			arr[i]= Integer.parseInt(st.nextToken());
		}
		for(int i = 0; i < arr.length; i++) {
			int num = 0;
			for(int j = 0; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					num = arr[j];
					arr[j] = arr[i];
					arr[i] = num;
				}
			}
		}
		System.out.println(arr[cut-1]);
	}
}