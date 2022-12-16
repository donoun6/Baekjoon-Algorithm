package text7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main8 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int weight = N;
		int num = 0;
		int ans = 0;
		while (weight != 0) {
			if((weight%5)%3==0) {
				ans += weight/5;
				weight = weight%5;
				ans += weight/3;
				weight = weight%3;
			}else {
				weight -= 5;
				num += 5;
				if(weight < 0) {
					weight = N;
					break;
				}
				if(weight%3 == 0) {
					ans = weight/3;
					weight = (weight%3)+num;
				}
			}
		}
		while(weight != 0) {
			if(weight%3 == 0) {
				ans += weight/3;
				weight = weight%3;
			}else {
				weight -= 3;
				num += 3;
				if(weight < 0) {
					ans = -1;
					break;
				}
				if((weight%3)%3 == 0) {
					ans += weight/3;
					weight = (weight%3)+3;
				}
			}
		}
		System.out.println(ans);
	}
}
