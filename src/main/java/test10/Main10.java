package test10;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Main10 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int root = Integer.parseInt(br.readLine());
		String[] arr = new String[root]; 
		for(int i = 0; i < root; i++) {
			arr[i] = br.readLine();
		}
		
		Arrays.sort(arr , new Comparator<String>() { //arr를 정렬후 뒤에 조건

			@Override
			public int compare(String o1, String o2) { //o1 인덱스 1 부터 o2 인덱스 0부터 비교
				if(o1.length() == o2.length()) { //정렬되었고 다음 인덱스의 단어와 길이 비교 맞다면
					return o1.compareTo(o2); //compareTo를 이용하여 단어 정렬
				}else {
					return o1.length() - o2.length(); //반환값이 양수면 o1이 큰 값이 됩니다.
				}
			}
		});
		bw.write(String.valueOf(arr[0]+"\n"));
		for(int i = 1; i < root; i++) {
			if(!arr[i].equals(arr[i-1])) {
				bw.write(String.valueOf(arr[i])+"\n");
			}
		}
		bw.flush();
	}
}