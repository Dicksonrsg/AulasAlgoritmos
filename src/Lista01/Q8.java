
package Lista01;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        float vh = 0.00f, hw = 0.0f, w = 0.0f;
        
        System.out.println("Wage calculator.");
        
        System.out.print("Type hour value in: ");
        vh = input.nextFloat();
        
        System.out.print("Type hours worked in: ");
        hw = input.nextFloat();
        
        w = vh * hw;
        System.out.println("Wage to be received is " + w);
        
    }
    
}
