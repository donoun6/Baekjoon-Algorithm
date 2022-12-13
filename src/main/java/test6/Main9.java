package test6;

import java.io.*;

public class Main9 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String[] ca = {"c=","c-","dz=","d-","lj","nj","s=","z="};
        for(int i = 0; i < ca.length; i++) {
        	if(a.contains(ca[i])) {
        		a = a.replaceAll(ca[i], "0");
        	}
        }
        System.out.println(a.length());
    }
}