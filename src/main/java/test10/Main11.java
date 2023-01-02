package test10;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main11 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int root = Integer.parseInt(br.readLine());
		String[][] arr = new String[root][2]; 
		for(int i = 0; i < root; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i][0] = st.nextToken();
			arr[i][1] = st.nextToken();
		}
		
		Arrays.sort(arr , new Comparator<String[]>() {

			@Override
			public int compare(String[] o1, String[] o2) { //o1 인덱스 1 부터 o2 인덱스 0부터 비교
				return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]); //리턴값이 양수라면 o1 바꾹고 0과 음수면 그대로 둔다.
			}
		});
		
		for(int i = 0; i < root; i++) {
			bw.write(arr[i][0] +" "+ arr[i][1]+"\n");
		}
		bw.flush();
	}
}