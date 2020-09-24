package Strings_And_2D;

public class Printing_All_Substrings {
public static void PrintAllStrings(String str) {
	for (int i = 0; i <str.length() ; i++) {
		for (int j = i ; j <str.length() ; j++ ) {
			System.out.println(str.substring(i, j+1));
		}
	}
}
public static void main(String[] args) {
	String str = "xyz";
	PrintAllStrings(str);
}
}
