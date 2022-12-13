package test6;

import java.util.*;
import java.io.*;

public class Main7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder a = new StringBuilder(st.nextToken()).reverse();
        StringBuilder b = new StringBuilder(st.nextToken()).reverse();
        int a1 = Integer.parseInt(a.toString());
        int b1 = Integer.parseInt(b.toString());
        if(a1>b1) System.out.println(a1);
        else System.out.println(b1);
        br.close();
    }
}