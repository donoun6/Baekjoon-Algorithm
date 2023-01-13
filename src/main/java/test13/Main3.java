package test13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main3 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		HashMap<String, Integer> Map = new HashMap<>(); //몬스터 이름을 가지고 (key값) 값을 찾는다 (value)
		String[] nameArr = new String[N]; //hashMap은 value로 키값을 찾기엔 복잡하기에 배열을 만들어 해당 인덱스의 몬스터 이름을 가져오기위함
		
		for(int i = 0; i < N; i++) {
			String name = br.readLine();
			Map.put(name, i); //몬스터이름을 key값 value값으로 인덱스를 넣어준다.
			nameArr[i] = name; //배열에 똑같이 담는다.
		}
		
		for(int i = 0; i < M; i++) {
			String key = br.readLine();
			if(Map.containsKey(key)) { //해당 Map의 키값이 존재할때
				bw.write(Map.get(key)+1+"\n");
			}else { //아니면 해당값을 int로 바꾸어 배열의 인덱스로 값을찾는다.
				int index = Integer.parseInt(key);
				bw.write(nameArr[index-1]+"\n");
			}
		}
		
		bw.flush();
	}
}
