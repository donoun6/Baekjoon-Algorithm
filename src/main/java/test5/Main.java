package test5;

public class Main {
	 
	public static void main(String[] args) {
		boolean[] arr = new boolean[10001];
		for (int i = 1; i < 10001; i++){
			int selfNum = d(i);
			if(selfNum < 10001) {
				arr[selfNum] = true;
			}
			if(!arr[i]) {
				System.out.println(i);
			}
		}
	}

	public static int d(int number){
		int sum = number;
		while(number != 0){
			sum = sum + (number % 10);
			number = number/10;
		}
		return sum;
	}
}