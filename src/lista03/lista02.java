
package lista03;

import java.util.Scanner;

public class lista02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Type a number: ");
        int n1 = input.nextInt();
        
        if (n1 > 0){
            System.out.println(n1 + " is positive.");
        }
        else {
            System.out.println(n1 + " is negative.");
        }
    }
    
}
