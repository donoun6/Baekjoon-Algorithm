package test6;

import java.io.*;

public class Main10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int[] alphabet = new int[26];
        int count = 0;
        for(int i = 0; i < a; i++) {
        	StringBuilder sb = new StringBuilder();
        	String text = br.readLine();
        	for(int j = 0; j < text.length(); j++) {
        		int code = (int)text.charAt(j)-97;
        		alphabet[code] += 1;
        		if(j > 0) {
        			if(code == (int)text.charAt(j-1)-97) {
        				alphabet[code] = 1;
        				if(code == (int)text.charAt(j-1)-97) {
            				alphabet[code] += 1;
            			}
        			}
        		}
        	}
        	for(int j = 0; j < alphabet.length; j++) {
        		if(alphabet[j] <= 1) {
        			alphabet[j] = 0;
        		}
        		if(alphabet[j] == 0) {
        		}
        		sb.append(alphabet[j]);
        		alphabet[j] = 0;
            }
        	String[] ans = sb.toString().split("0");
        	if(ans.length == 0) {
        		count++;
        	}
        }
        System.out.println(count);
    }
}