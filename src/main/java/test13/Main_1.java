package test13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main_1 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
	    HashSet<Integer> set = new HashSet<>(n); //해당 클래스는 중복이 되지않는다.
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    for(int i = 0; i < n; i++) {
	    	set.add(Integer.parseInt(st.nextToken()));
	    }
	    
	    int m = Integer.parseInt(br.readLine()); 
	    st = new StringTokenizer(br.readLine());
	    
	    for(int i = 0; i < m; i++) {
	    	int num = Integer.parseInt(st.nextToken());
	    	if(set.contains(num)) { //Hashset에 num이 포함되어있으면 true
	    		bw.write("1 ");
	    	}else {
	    		bw.write("0 ");
	    	}
	    }
	    bw.flush();
	}
}
