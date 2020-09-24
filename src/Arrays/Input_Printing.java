package Arrays;
import java.util.Scanner;
public class Input_Printing {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	int arr [] = new int [n];
	for (int i = 0; i <n ; i++) {
		System.out.println("Enter the number in"+ " "+ i + "th index");
		arr[i] = s.nextInt();
	}
	for (int i = 0; i<n ; i++)
	System.out.println(arr[i]);
}
}



		/* Your class should be named Solution
	 	* Don't write main().
	 	* Don't read input, it is passed as function argument.
	 	* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/
        