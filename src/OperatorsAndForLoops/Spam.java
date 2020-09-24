package OperatorsAndForLoops;
import java.util.Scanner;
public class Spam {



	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        int i = 2;
        while(i<=n)
        {    boolean isprime = true;
            int j = 2;
            while(j<=i-1){
                if(i%j==0)
                    isprime = false;
                j++;
                
            }if(isprime)
                System.out.println(i);
            
            
          i++;  
            
        }
        

		
	}
}

