package Arrays;
import java.util.Scanner;
public class Function_To_Print_Array {
	public static void printarray(int [] arr) {
		int n = arr.length;
		for (int i = 0 ; i<n ; i++) {
		System.out.println(arr[i]);
	}}
public static int[] TakeInput() {
	Scanner s = new Scanner (System.in);
	int n = s.nextInt();
	int arr[] = new int [n];
	for (int i = 0 ; i<n ; i++) {
		System.out.println("Enter the Element in "+ " " + i + "th Index");
		arr[i] = s.nextInt();
		
	}
	return arr;
	
}
public static void main(String[] args) {
	int[] arr = TakeInput();
	printarray(arr);
}
}
