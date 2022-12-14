package test6;

import java.io.*;

public class Main10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int count = a;
        for(int i = 0; i < a; i++) {
        	String text = br.readLine();
        	boolean[] code = new boolean[26];
        	for(int j = 0; j < text.length()-1; j++) {
        		if(text.charAt(j)!=text.charAt(j+1)) {
        			if(code[(int)text.charAt(j+1)-97]==true) {
        				count--;
        				break;
        			}
        		}
        		code[text.charAt(j)-97]=true;
        	}
        }
        System.out.println(count);
    }
}