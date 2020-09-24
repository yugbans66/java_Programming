package OperatorsAndForLoops;
import java.util.Scanner;

public class Questions {
	public static void main(String[] args) {
		
			
		Scanner s =  new Scanner(System.in);
		int n = s.nextInt();

		int i;
    for ( i = 3; i<=n; i+=2){
        int j,r=0;
        for (j=3;j<i;j++){
            r = j%i;
            if(r==0){
                return;
            }
            
        }
       
        System.out.println(i);
        }
    }
}

