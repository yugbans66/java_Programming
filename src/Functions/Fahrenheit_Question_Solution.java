package Functions;
import java.util.Scanner ;
public class Fahrenheit_Question_Solution {

	public static void printFahrenheitTable(int start, int end , int step) {
		int currentvalue = start;
		while (currentvalue <= end) {
			int fahrenheitvalue = (int)((5.0/9)*(currentvalue-32));
			System.out.println(currentvalue+ "\t" + fahrenheitvalue);
			currentvalue += step;
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int start = s.nextInt();
		int end = s.nextInt();
		int step = s.nextInt();
		printFahrenheitTable(start , end , step);
                	
	}
	
}
