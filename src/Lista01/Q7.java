
package Lista01;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner  input = new Scanner (System.in);
        
        System.out.println("Square area calculator.");
        
        System.out.println("Type one of its side in: ");
        float l = input.nextFloat();
        
        float s = l*l;
        System.out.println("Square area is: " + s*2);
    }
    
}
