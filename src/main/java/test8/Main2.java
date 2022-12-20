package test8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int min = Integer.parseInt(br.readLine());
		int max = Integer.parseInt(br.readLine());
		int	minAns = 0;
		int maxAns = 0;
		int[] arr = new int[max+1-min];
			for(int i = 0; i < arr.length; i++) {
				arr[i] = min+i;
				int num = min+i;
				int count = 0;
				for(int j = 1; j <= num; j++) {
					if(num == 1) {arr[i] = 0; break;}
					if(num%j == 0) {
						count++;
						if(count > 2) {
							arr[i] = 0;
							break;
						}
					}
				}
				if(arr[i] != 0) {
					maxAns += arr[i];
					if(minAns == 0) {
						minAns = arr[i];
					}
				}
			}
			if(maxAns == 0 && minAns == 0) {
				System.out.println("-1");
			}else {
				System.out.println(maxAns);
				System.out.println(minAns);
			}
	}
}
