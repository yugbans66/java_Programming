package Arrays;

import java.util.Scanner;

public class Array_Equilibrium_Index_Question {
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
		int rightsum = 0;
		int leftsum = 0;
		int[] input = takeinput();
		for (int i = 0 ; i<input.length ; i++) {
			rightsum = rightsum + input[i];
		}
		for (int i = 0 ; i <input.length ; i++) {
			rightsum = rightsum - input[i];
			if(leftsum == rightsum) {
				System.out.println(i);;
			}
			leftsum += input[i];
		}
	}

}
