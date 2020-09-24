package Arrays;

import java.util.Scanner;

public class Stocks_Are_Profitable_Question {
	public static int[] takeinput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int [] arr = new int [size];
		for (int i = 0 ; i < size ; i++) {
			 arr[i] = s.nextInt();
		}
		return arr;
		
	}
	public static void main(String[] args) {
		int ans = 0;
		int max = 0;
		int min = 0;
		int x = 0;
		int[] input = takeinput();
		for(x = 0 ; x <input.length ;x++) {
			if(max<input[x]) {
				max = input[x];
			}
		}
		for (int i = 0 ; i <x ; i++) {
			min =input[0];
			if(min > input[i]) {
				min = input[i];
			}
		}
		ans = max-min;
		System.out.println(ans);
		
	}
}
