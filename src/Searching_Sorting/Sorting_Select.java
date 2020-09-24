package Searching_Sorting;

public class Sorting_Select {
	public static void SelectionSort (int [] input) {
		for (int i = 0; i < input.length - 1 ; i++) {
			int min = input[i];
			int midindex = i;
			for (int  j = i+1 ; j < input.length ; j++) {
				if (min > input[j]) {
					min = input[j];
					midindex = j;
				}
			}if (midindex != i ) {
				input[midindex] = input[i];
				input[i ]= min;
			}
		}
		
	}
	public static void main(String[] args) {
		int input[] = {2,6,9,1,5};
		SelectionSort(input);
		for (int i = 0 ; i < input.length ; i++) {
			System.out.print(input[i] +  "  ");
		}
	}

}
