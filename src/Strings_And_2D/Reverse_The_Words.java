package Strings_And_2D;

public class Reverse_The_Words {
public static String PrintReverse(String str) {
	String result = "";
	int i = str.length() - 1;
	int end = str.length();
	while (i>=0) {
		if (str.charAt(i) == ' ') {
			result = result + str.substring(i+1,end) + " ";
			end = i;
		}
		i--;
	}
	result = result + str.substring(0,end);
	return result;
}
public static void main(String[] args) {
	String str = "My Name Is Yugal";
	String result =   PrintReverse(str);
	System.out.println(result);
}
}
