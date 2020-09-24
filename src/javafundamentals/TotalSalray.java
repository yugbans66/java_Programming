// Ques. Write a program to calculate the total salary of a person. 
// The user has to enter the basic salary (an integer) and the grade (an uppercase character), 
// and depending upon which the total salary is calculated as -

// totalSalary = basic + hra + da + allow – pf
// hra   = 20% of basic
// da    = 50% of basic
// allow = 1700 if grade = ‘A’
// allow = 1500 if grade = ‘B’
// allow = 1300 if grade = ‘C' or any other character
// pf    = 11% of basic.

// Input format :
// Basic salary & Grade (separated by space)
// Output Format :
// Total Salary


package javafundamentals;
import java.util.Scanner;
public class TotalSalray {
	
	public static void main(String[] args) {
		
        Scanner s = new Scanner(System.in);
        double n= s.nextInt();
        char ch = s.next().charAt(0);
        
        double allow;
        if (ch == 'A'){
            allow = 1700;
        }else if(ch == 'B'){
            allow = 1500;
        }    else{
            allow = 1300;
        }
        double t = n + ((20*n)/100) +((50*n)/100) + allow - ((11*n)/100);
        System.out.print(Math.round(t));
	}


}


