package test11;

import java.io.*;

public class Main5{
	static char[][] star;
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		star = new char[N][N]; //N*N 크기
		
		makeStar(0, 0, N, false);

		for(int i=0; i<N; i++) {
			bw.write(star[i]);
			bw.write('\n');
		}

		bw.flush();
		bw.close();
		
	}
	static void makeStar(int x, int y, int N, boolean blank) {

		// 공백칸일 경우
		if(blank) {
			for(int i = x; i < x + N; i++) {
				for(int j = y; j < y + N; j++) {
					star[i][j] = ' ';
				}
			}
			return;
		}

		if(N == 1) {
			star[x][y] = '*';
			return;
		}

		int size = N / 3;
		int count = 0;
		for(int i=x; i<x + N; i+=size) {
			for(int j=y; j<y + N; j+=size) {
				count ++;
				if(count == 5) {
					makeStar(i, j, size, true);
				}
				else {
					makeStar(i, j, size, false);
				}
			}
		}
		

	}
}
