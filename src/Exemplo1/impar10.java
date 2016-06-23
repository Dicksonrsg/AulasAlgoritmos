
package Exemplo1;

import java.util.Scanner;

public class impar10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int odd =0, even =0, n = 0;
        
        for(int i = 1; i <= 10; i++ ){
            System.out.println("Type number "+i+": ");
            n = input.nextInt();
            
            if ((n%2) == 0){
            even++;
            }
            else{odd++;}
        }
        System.out.println("Even numbers: " +even+ " Odd numbers: "+odd);
    }
    
}
