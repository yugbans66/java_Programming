package Strings_And_2D;

public class Printing_Prefix {
public static void PrintPrifix (String str) {
	for (int i = 0 ; i <str.length() ; i++) {
		System.out.println(str.substring(0, i+1));
	}
}
public static void main(String[] args) {
	String str = "abcde";
	PrintPrifix(str);
}}