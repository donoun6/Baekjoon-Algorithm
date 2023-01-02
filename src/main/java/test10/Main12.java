package test10;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main12 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int root = Integer.parseInt(br.readLine());
		int arr[] = new int[root] , sortArr[] = new int[root];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < root; i++) {
			arr[i] = sortArr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(sortArr);
		
        Map<Integer, Integer> map = new HashMap<>();
        int index = 0;
        for (int i : sortArr) { // 해당 배열 만큼 반복 n값은 해당 배열의 인덱스 0부터 차례대로 올라간다.
            if (!map.containsKey(i)) { //해당 키값이 없을경우
                map.put(i, index++); //X값과 인덱스값을 준다
            }
        }

        for (int i : arr) { // 정렬이 안된 배열을 n에 대입하여 아래 결과값을 출력
        	bw.write(map.get(i)+" ");
        }
        bw.flush();
	}
}