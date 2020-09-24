package Strings_And_2D;
import java.util.Scanner;
public class a2D_Array_input_printing {
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
public static void Print(int[][]input) {
	int rows = input.length;
	int cols = input[0].length;
	for (int i = 0 ; i < rows ; i++) {
		for (int j = 0 ; j <cols ; j++) {
			System.out.print(input[i][j] + " ");
		}
	
	System.out.println();
}
}
public static void main(String[] args) {
	int[][]input = takeinput();
	Print(input);
		}
	}


