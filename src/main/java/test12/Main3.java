package test12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[N][2]; // x y 두값을 비교해야하기 떄문에 [N][2]로 배열길이를 지정해준다 N=5일때 5칸을 생성 후에 이중베열 0과 1을 배교
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			arr[i][0] = x;
			arr[i][1] = y;
		}
		
		for(int i = 0; i < N; i++) {
			int rank = 1; // 랭크는 1부터 시작
			for(int j = 0; j < N; j++) {
				if(i != j ) { //같은 값을 비교하는건 제외해야하기 떄문에 i 와 j 가 다를때
					if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
						rank++;
					}
				}
			}
			System.out.println(rank);
		}
	}
}

