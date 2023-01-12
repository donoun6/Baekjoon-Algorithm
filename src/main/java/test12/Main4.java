package test12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main4 {
	public static boolean[][] arr;
	public static int min = 64; // 8*8칸이기 때문에 64칸에서 count가 된값을 빼주면서 최소값을 찾는다.
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		arr = new boolean [N][M];
		
		for(int i = 0; i < N; i++) {
			String text = br.readLine();
			for(int j = 0; j < M; j++) {
				if(text.charAt(j) == 'W') {
					arr[i][j] = true;
				}
			}
		}
		
		//아래 두 변수는 8*8칸의 x,y축 시작점
		int Nindex = N-7; //index는 0부터 시작하므로 자기자신을 포함 그러므로 8이아니라 7을 빼준다
		int Mindex = M-7;
		
		for(int i = 0; i < Nindex; i++) { 
			for(int j = 0; j < Mindex; j++) {
				checkBord(i, j);
			}
		}
		System.out.println(min);
	}
	
	public static void checkBord(int N,int M) {
		boolean startColor = arr[N][M];
		int count = 0;
		for (int i = N; i < N+8; i++) { //8*8칸이기 때문에 시작점으로 부터 8번만 실행
			for (int j = M; j < M+8; j++) {
				if(startColor != arr[i][j]) { //시작색과 다르면 count를 추가
					count++;
				}
				startColor = !startColor; //처음시작이 true였다면 다음색은 false이므로 바꿔준다.
			}
			startColor = !startColor; //처음시작이 true였다면 다음색은 false이므로 바꿔준다. 축이 다르기떄문에 한번더 실행
		}
		count = Math.min(count, 64 - count); //기존의 카운트보다 카운트가 낮으면 갱신
		min = Math.min(min, count); //위와 같다
	}
}

