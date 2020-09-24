package Arrays;

import java.util.Scanner;

public class Count_Inversions_Question {
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
		int count = 0;
		int [] input = takeinput();
		for (int i = 0 ; i <input.length-1;i++) {
			for (int j = i+1 ; j <input.length;j++) {
				if (input [i] > input[j]) {
					count = count + 1;
				}
			}
		}
		System.out.println(count);
	}
}
