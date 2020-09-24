package Arrays;

import java.util.Scanner;

public class Special_Sum_of_Array_Question {
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
		int sum = 0 ; 
		int[]input = takeinput();
		for (int i = 0 ; i <input.length ; i++) {
			sum = sum + input[i];
			if (sum > 10) {
				int tempsum = sum%10;
				sum = tempsum + sum/10;
			}
		}
		System.out.println(sum);
	}
}
