package Strings_And_2D;
import java.util.Scanner;
public class Basics_2D_Array {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
System.out.println("Enter Number Of Rows");
int rows = s.nextInt();
System.out.println("Enter Number Of Columns");
int columns = s.nextInt();
int arr[][] = new int [rows][columns];
for (int i = 0 ; i < rows ; i++) {
	for (int j = 0 ; j < columns ; j++) {
		System.out.println("Enter the Element at" + i + "Row" + j + "Column");
		arr[i][j] = s.nextInt();
	}
}
for (int i = 0; i <rows ; i++) {
	for (int j = 0 ; j <columns ; j++) {
		System.out.print(arr[i][j] + " ");
	}
	System.out.println();
}
}
}
