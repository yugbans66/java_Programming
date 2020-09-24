package javafundamentals;
import java.util.Scanner;
public class FahrenheitToCelsiusTable {


	public static void main(String[] args) {
		Scanner t =  new Scanner (System.in);
        int S = t.nextInt();
        int E = t.nextInt();
        int W = t.nextInt();
    
        int z=0;
            
        while(S<E){
             z = (((S-32)*5)/9);
            System.out.println(S+" "+z);
    
            S=S+W;
        }
		

		
	}

}



