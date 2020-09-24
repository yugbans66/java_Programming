package Searching_Sorting;

import java.util.Scanner;

public class PushZerosToEnd_Question {
	public static int[] takeinput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int [] arr = new int [size];
		for (int i = 0 ; i < size ; i++) {
			 arr[i] = s.nextInt();
		}
		return arr;
		
	}
	public static void pushzero(int[] input) {
		int k =0;
		int temp=0;
		for (int i = 0 ; i<input.length ; i++) {
			if(input[i] != 0) {
				temp = input[i];
				input[i] = input[k];
				input[k] = temp;											
				k++;
			}
		}
		
		
	}
	public static void main(String[] args) {
		int[] input = takeinput();
		pushzero(input);
		for(int i = 0 ; i <input.length ; i++) {
			System.out.print(input[i] + " ");
		}
	}
	
	
	
}
