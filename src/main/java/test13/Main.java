package test13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int A,B;
	static int[] aNum;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		//A배열 입력
		A = Integer.parseInt(br.readLine());
		aNum = new int[A];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < A; i++) { aNum[i] = Integer.parseInt(st.nextToken());}
		
		//오름차순 정렬
		Arrays.sort(aNum); //찾고자하는 비교대상배열은 오름차순 정렬이 되어있어야지 이분탐색이 가능하다.
		
		//B배열 입력
		B = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < B; i++) { 
			int N = Integer.parseInt(st.nextToken());
			if(binarySearch(N)) {
				bw.write("1 ");
			}else {
				bw.write("0 ");
			}
		}
		bw.flush();
	}
	
	public static boolean binarySearch(int N) {
		int left = 0;
		int right = A-1;
		
		while(left <= right) {
			int mid = (left+right)/2;
			if(N < aNum[mid]) {
				right = mid-1;
			}else if(N > aNum[mid]) {
				left = mid+1;
			}else {
				return true;
			}
		}
		return false;
	}
}
