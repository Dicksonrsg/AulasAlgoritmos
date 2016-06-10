
package Lista01;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("Temperature converter.");
        
        System.out.println("Type temperature in Fareheint: ");
        float f = input.nextFloat();
        
        float t = (5*(f-32)/9);
        System.out.println("Temperature in Celsius is " + t + "ºC");
    }
    
}
