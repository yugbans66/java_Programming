package Searching_Sorting;

import java.util.Scanner;

public class BubbleSort {

	public static int[] takeinput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int [] arr = new int [size];
		for (int i = 0 ; i < size ; i++) {
			 arr[i] = s.nextInt();
		}
		return arr;
		
	}
	
	public static void bubbleSort(int[] input) {
		
		for (int j = 0 ; j <input.length - 1 ; j++) {
					
			
		for(int i = 0 ; i <input.length - j - 1 ; i++) {
			
			if (input[i] > input[i+1]) {
				int temp = input[i];
				input[i] = input[i+1];
				input[i+1] = temp;
				
			}
			
		}
		}
		
	}
	
	public static void main(String[] args) {
		
		int [] input = takeinput();
		bubbleSort(input);
		for (int i = 0 ; i <input.length ; i++) {
			System.out.print(input[i] + " ");
		}
		
	}
	
	
}
