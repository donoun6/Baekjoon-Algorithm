package test11;

import java.io.*;

public class Main3{
	static int count = 0;
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int root = Integer.parseInt(br.readLine());
		for(int i = 0; i < root; i ++) {
			String text = br.readLine();
			bw.write(recursion(text, 0, text.length()-1)+ " " + count + "\n");
			count = 0;
		}
		bw.flush();
    }
	
    public static int recursion(String s, int l, int r){
    	count++;
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) {return 0;}
        else return recursion(s, l+1, r-1);
    }
    
}