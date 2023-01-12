package test12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main5 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int number = 666;
		int result = 0;
		int count = 1;
		
		while(true) {
			String SN = String.valueOf(number);
			if(SN.contains("666")) { //666이 포함된 수를 찾는다
				if(count == N) { // 666이 포함된 수중 N번째 수를 팢는다.
					result = number;
					break;
				}
				count++;
			}
			number++;
		}
		System.out.println(result);
	}
}

