package test11;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
 
public class Main6 {
 
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int N = Integer.parseInt(br.readLine());
 
		bw.write((int) (Math.pow(2, N) - 1) + "\n");
 
		Hanoi(N, 1, 2, 3, " 함수 호출 ");
		
		bw.flush();
		bw.close();
	}
	public static void Hanoi(int N, int start, int mid, int to, String dd) throws IOException {
		if (N == 1) {
			bw.write(start + " " + to + dd + N + "\n");
			return;
		}
 
		Hanoi(N - 1, start, to, mid, " 첫번째 재귀 ");
    
		bw.write(start + " " + to + dd + N +"\n" );
    
		Hanoi(N - 1, mid, start, to, " 두번째 재귀 ");
	}
	
	/*
	 재귀함수의 실행순서
	 입력값을 3으로 주면 하노이 함수가 실행
	 첫번째 재귀함수를만나 3 -> 2 ->1 식으로 카운트 1이 return이기때문에 함수종료
	 진행이 안된 2는 쭉진행 두번째 재귀함수에서 2를 값으로 2 -> 1로 실행 마찬가지로 1이 return값이르모 종료
	 마지막으로 처음으로 넣은 입력값 3으로 진행 두번째 재귀함수를만나 함수 실행
	 */
}