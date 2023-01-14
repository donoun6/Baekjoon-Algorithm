package test13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;


public class Main4 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			int num = Integer.parseInt(st.nextToken());
			if(!map.containsKey(num)) { //똑같은 key가 존재하지 않을때 value를 1로 준다.
				map.put(num, 1);
			}else {
				map.put(num, map.get(num)+1); //똑같은 key값이 있으면 value값을 하나씩 추가
			}
		}
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < M; i++) {
			int num = Integer.parseInt(st.nextToken());
			if(map.containsKey(num)) { //해당 키값을 가지고있으면 key값을 이용하여 value(횟수)를 호출
				bw.write(map.get(num)+" ");
			}else {
				bw.write(0+" ");//key값이 아니면 0을 출력
			}
		}
		bw.flush();
	}	
}
