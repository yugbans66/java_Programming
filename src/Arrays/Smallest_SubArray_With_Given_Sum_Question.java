package Arrays;

import java.util.Scanner;

public class Smallest_SubArray_With_Given_Sum_Question {
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
		int[] input = takeinput();
		for (int i = 0 ; i < input.length ; i++) {
			
		}
	}
}
