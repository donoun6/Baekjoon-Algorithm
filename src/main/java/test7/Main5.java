package test7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main5 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int index = Integer.parseInt(br.readLine());
		for(int i = 0; i < index; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int H = Integer.parseInt(st.nextToken());
			int W = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			int y = (N%H == 0) ? H : N%H;
			int x = (N/H == N) ? N/H : (int)Math.ceil((double)N/H) ;
			if(x < 10) {
				System.out.println(y+"0"+x);
			}else {
				System.out.println(y+""+x);
			}
		}
	}
}
