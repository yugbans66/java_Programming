package Arrays;

import java.util.Scanner;

public class Division_By_4_Question {
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
		int Div = 0;
		int [] input = takeinput();
		for (int i = 0 ; i<input.length ; i++) {
			input[i]/=4  ;
			if (input[i] == 0) {
				input[i] = -1;
			}
			System.out.print(input[i] + " ");
			
		}
	}
}
