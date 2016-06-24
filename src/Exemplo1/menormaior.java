
package Exemplo1;

import java.util.Scanner;

public class menormaior {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Type group's size: ");
        int g = input.nextInt();
        
        int low = 0, high=0;
        
        for (int i =1; i<=g; i++){
            
            System.out.print("Type number "+i+": ");
            int n = input.nextInt();
            if (i==1){
            low = n;
            high = n;
            }
            else if(n < low){low = n;}
            else if(n > high){high = n;}
        }
        System.out.println("Lowest numer: "+low+"\nHighest number: "+high);
    }
    
}
