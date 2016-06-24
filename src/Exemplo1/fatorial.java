
package Exemplo1;

import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Type number to be ");
        int n = input.nextInt();
        int f = n;
        
        for (int i = (n-1); i>0; i--){
        f*=i;
        }
        System.out.println(n+"!"+ " = "+f);
    }
    
}
