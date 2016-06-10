
package Lista01;

import java.util.Scanner;


public class Q10 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        float f = 1.8f;
        
        System.out.println("Temperature converter.");
        
        System.out.println("Type temperature in Celsius: ");
        float c = input.nextFloat();
        
        float t = ((c*f)+32);
        System.out.println("Temperature in Celsius is " + t + "ºC");
    }
    
}
