package Searching_Sorting;

import java.util.Scanner;

public class Rotate_Array_Question {

	public static int[] takeinput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int [] arr = new int [size];
		for (int i = 0 ; i < size ; i++) {
			 arr[i] = s.nextInt();
		}
		return arr;
		
	}
	
	public static void RotateArray(int[] input) {
		Scanner s = new Scanner(System.in);
		int D = s.nextInt();
		for(int i = 0 ; i <D ; i++) {
			for(int j = 1 ; j<input.length ; j++) {
				int temp = input[0];
				input[j] = input[j-1];
				input[input.length] = temp;
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		
		int[] input = takeinput();
		RotateArray(input);
		for(int i = 0 ; i <input.length ; i++) {
			System.out.println(input[i] + " ");
	   			
		}
		
		
	}
	
	
}
