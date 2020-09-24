package Strings_And_2D;

import java.util.Scanner;

public class Largest_Row_Column_Sum {
	public static int[][] takeinput(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter The Number Of Rows");
		int rows = s.nextInt();
		System.out.println("Enter The Number Of Columns");
		int cols = s.nextInt();
		int input[][] = new int [rows][cols];
		for (int i = 0 ; i <rows ; i++){
			for (int j = 0 ; j <cols ; j++) {
				System.out.println("Enter The Element in " + i +  "Row" + j + "Column" );
				input[i][j] = s.nextInt();
			}
		}
		return input;
		
		
		
}
	public static void main(String[] args) {
		int Row = 0;
		int col = 0;
		int largestrow = Integer.MIN_VALUE;
		int[][]input = takeinput();
		for (int j = 0 ; j <input[0].length ; j++) {
			int sum = 0;
			for (int i = 0 ; i <input.length ; i++ ) {
				sum = sum + input[i][j];
				if (sum >largestrow) {
					largestrow = sum;
					Row = j;
				}
			}
		}
		int largestcolumn = Integer.MIN_VALUE;
		for (int i = 0 ; i <input.length; i++) {
			int sum = 0;
			for (int j = 0 ; j< input[0].length; j++) {
				sum = sum + input[i][j];
				if (sum > largestcolumn) {
					largestcolumn = sum;
					col = i;
				}
			}
		}
			if (largestrow >largestcolumn) {
				System.out.print("column" + " " +  Row + " " + largestrow );
			}else if (largestrow<largestcolumn) {
				System.out.println("row" + " " + col + " " + largestcolumn);
			}
		
	}
}