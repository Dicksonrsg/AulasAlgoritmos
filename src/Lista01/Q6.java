
package Lista01;

import java.util.Scanner;


public class Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float pi = 3.1415f;
        
        System.out.println("Circle Are Calculator");
        
        System.out.print("Type in the radius: ");
        float r = input.nextFloat();
        
        float a = (r * r)* pi;
        System.out.println("The area is: " + a);
    }
    
}
