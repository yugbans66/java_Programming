package Searching_Sorting;

import java.util.Scanner;

public class InsersionSort {

	public static int[] takeinput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int [] arr = new int [size];
		for (int i = 0 ; i < size ; i++) {
			 arr[i] = s.nextInt();
		}
		return arr;
		
	}
	
	public static void insersionSort(int[]input) {
		for(int i = 1 ; i <input.length ; i++) {
			int j = i-1;
			int temp = input[i];
			while(j >= 0 && input[j] > temp) {
				input[j+1] = input[j];
				j--;
			}
			input[j+1] = temp;
			
			
		}
		
		
	}
	public static void main(String[] args) {
		int[] input = takeinput();
		insersionSort(input);
		for(int i = 0 ; i < input.length ; i++) {
			System.out.print(input[i] + " ");
		}
	}
	
	
}
