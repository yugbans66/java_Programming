package Arrays;
import java.util.Scanner;
public class Sum_Of_Array {
public static void main(String[] args) {
	int sum = 0;
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	
	int arr[] = new int [n];
	for (int i = 0; i <n ; i++) {
		System.out.println("Enter the element" + " "+ "in" + i + "Row");
		arr[i] = s.nextInt();
		
		sum = sum + arr[i];
		
	}
	System.out.println(sum);
}
}
