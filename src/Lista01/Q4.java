
package Lista01;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Type the 4 Bimestrial grades.");
        
        System.out.println("Type 1st grade: ");
        float g1 = input.nextFloat();
        
        System.out.println("Type 2nd grade: ");
        float g2 = input.nextFloat();
        
        System.out.println("Type 3rd grade: ");
        float g3 = input.nextFloat();
        
        System.out.println("Type 4th grade: ");
        float g4 = input.nextFloat();
        
        float avg = (g1 + g2 + g3 + g4)/4;
        System.out.println("Student's Average is: " + avg);
        
    }
    
}
