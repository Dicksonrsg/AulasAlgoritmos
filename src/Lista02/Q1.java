
package Lista02;

import java.util.Scanner;


public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Type the first integer: ");
        int i1 = input.nextInt();
        
        System.out.print("Type the second integer: ");
        int i2 = input.nextInt();
        
        System.out.print("Type the real number: ");
        float r1 = input.nextFloat();
        
        float a = (i1*2) + (i2/2);
        System.out.print("Double of the first + half of the second integer: " + a);
        
        float b = (i1*3) + r1;
        System.out.print("Three times the 1st integer: ");
        
        
        
    }
    
}
