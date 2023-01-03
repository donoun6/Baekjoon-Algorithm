package test11;

import java.io.*;
import java.util.StringTokenizer;

public class Main4{
	static int[] tmp;
    static int count = 0;
    static int K;
    static int result = -1;
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		tmp =  new int[N];
		
		st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		for(int i = 0; i < N; i ++) {
			arr[i] = Integer.parseInt(st.nextToken());  
		}
		merge_sort(arr, 0, arr.length -1);
		System.out.println(result);
	}
	
	public static void merge_sort(int[] A, int p , int r) {
	    if (p < r){
	        int q = (p + r) / 2;       //# q는 p, r의 중간 지점
	        merge_sort(A, p, q);      //#전반부 정렬
	        merge_sort(A, q + 1, r);  //# 후반부 정렬
	        merge(A, p, q, r);        //# 병합
	    }
	}
	
	static void merge(int[] A,int p,int q,int r) {
	    int i = p; int j = q + 1; int t = 0;
	    while (i <= q && j <= r) {
	        if (A[i] <= A[j]) {
	        	tmp[t++] = A[i++];
	        }else tmp[t++] = A[j++];
	    }
	    while (i <= q){
	    	tmp[t++] = A[i++]; 		//  # 왼쪽 배열 부분이 남은 경우
	    }
	    while (j <= r) {
	    	tmp[t++] = A[j++]; 	// # 오른쪽 배열 부분이 남은 경우
	    }
	    i = p; t = 0;
	    while(i <= r){
            count++;
            if(count==K){
                result = tmp[t];
                break;
            }
            A[i++] = tmp[t++];
        }     
	}
}
