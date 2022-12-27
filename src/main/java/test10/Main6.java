package test10;

import java.io.*;

public class Main6 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine()); // root
		int[] arr = new int[8001]; // 입력값 범위 절대값 4000  (-4000 ~ 4000) 
		
		double avg = 0;
		
		int count = 0;
		int mid = 0;
		
		int mode = 10000;
		int modeCnt = 0;
		boolean modeCheck = false;
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		
		for(int i = 0; i < N; i++) {//배열에 수를 담는다.
			int num = Integer.parseInt(br.readLine())+4000;
			arr[num]++;
			avg += num - 4000;
			if(max < num) { max = num; }
			if(min > num) { min = num; }
		}
		
		for(int i = 0; i < arr.length; i ++) { // 배열 오름차순 정렬
			while(arr[i] != 0) {
				int num = i - 4000;
				arr[i]--;
				count++;
				if(count == (N+1)/2) { mid = num; } // 중앙값 산출
				if(modeCnt < arr[i]) {
					modeCnt = arr[i];
					mode = num;
					modeCheck = true;	// 첫 등장이므로 true 로 변경 
				}
				else if(modeCnt == arr[i] && modeCheck == true) {// 이전 최빈값 최댓값과 동일한 경우면서 한 번만 중복되는 경우 
					mode = num;
					modeCheck = false;					
				} else if(count == 2) { // 최빈값이 없을때 카운트를 이용하여 최빈값 산출
					mode = num;
				} else if (N == 1) { //root가 1일때 조건
					mode = num;
				}
			}
		}
		System.out.println(Math.round(avg/N)); //평균값 소수 첫째자리 반올림 산출
		System.out.println(mid); // 중앙값 산출
		System.out.println(mode); // 최빈값 산출
		System.out.println(max-min); // 범위 산출
	}
}

