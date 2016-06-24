
package Exemplo1;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Fibonacci sequence. \nType terms you want to print: ");
        int xn = input.nextInt();
        
                int fibo[] = new int [xn+1];
        
        for (int i= 0;  i <= (xn); i++){
            
            if (i==0){fibo[0] = 0;}
            
            else if(i==1){fibo[1] = 1;}
            
            else{fibo[i] = fibo[i-1] + fibo[i-2];}
            
            System.out.print(fibo[i]+" , ");

        }
    }
    
}
