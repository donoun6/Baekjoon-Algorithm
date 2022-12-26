package test10;

import java.io.*;

public class Main6 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int index = Integer.parseInt(br.readLine());
		int[] arr = new int[8001];
		double avg = 0;
		int count = 0;
		int mid = 0;
		int mode = 0;
		int mode2 = 0;
		int modeCnt = 0;
		int modeIndex = 0;
		int min = 0;
		int max = 0;
		
		for(int i = 0; i < index; i++) {
			int num = Integer.parseInt(br.readLine())+4000;
			arr[num]++;
		}
		
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > 1) {
				if(modeIndex == 0 || modeIndex <= arr[i] && modeCnt <2) {
					modeIndex = arr[i];
					mode = i - 4000;
					modeCnt++;
				}
			}
				while(arr[i] != 0) {
					int num = i-4000;
					if(count == 0) {
						min = num;
					}
					if(count == index-1) {
						max = num;
					}
					avg += i-4000;
					arr[i]--;
					count++;
					if(count-1 == index/2) {
						mid = num;
					}
					if(count <= 2) {
						mode2 = num;
					}
				}
		}
		System.out.println((int)Math.round(avg/index));
		System.out.println(mid);
		if(modeIndex == 0) {
			System.out.println(mode2);
		}else {
			System.out.println(mode);
		}
		if(min == max) {
			System.out.println(0);
		}else {
			System.out.println(max-min);
		}
	}
}

