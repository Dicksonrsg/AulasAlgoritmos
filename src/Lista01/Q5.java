
package Lista01;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Measurement converter!");
        
        System.out.println("Type in measure in Metre: ");
        float m = input.nextFloat();
        
        float cm = m * 100;
        System.out.println("Measure in Cm is: " + m);
    }
    
}
