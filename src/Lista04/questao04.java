
package Lista04;

import java.util.Scanner;


public class questao04 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        
        System.out.println("School grades calculator.");
        
         System.out.print("Type 1st grade: ");
         float g1 = input.nextFloat();
         
         System.out.print("Type 2nd grade: ");
         float g2 = input.nextFloat(); 
         
         float avg =  (g1*g2)/2;
         
        if (avg >= 9.0f && avg <= 10.0f ){
             System.out.println("1st grade: " +g1+ " 2nd grade|: " +g2+
                    "\nAverage: " + avg + 
                    "\nConcept: A"
                    +"\nPassed");
         }
        else if (avg >= 7.5f && avg <= 8.9f ){
             System.out.println("1st grade: " +g1+ " 2nd grade|: " +g2+
                    "\nAverage: " + avg + 
                    "\nConcept: B" 
                    +"\nPassed");
         }
        else if (avg >= 6.0f && avg <= 7.4f ){
             System.out.println("1st grade: " +g1+ " 2nd grade|: " +g2+
                    "\nAverage: " + avg + 
                    "\nConcept: C"
                    +"\nPassed");
         }
        else if (avg >= 4.0f && avg <= 5.9f ){
             System.out.println("1st grade: " +g1+ " 2nd grade|: " +g2+
                    "\nAverage: " + avg + 
                    "\nConcept: D"
                    +"\nFailed");
         }
        else if (avg >= 0.0f && avg <= 3.9f ){
             System.out.println("1st grade: " +g1+ " 2nd grade|: " +g2+
                     "\nAverage: " + avg + 
                     "\nConcept: E"
                    +"\nFailed");
         }
        else {
            System.out.println("Something went wrong, try again.");
        }
    }
    
}
