
package lista03;

import java.util.Scanner;


public class questao08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Type 1st price: ");
        int p1 = input.nextInt();
        
        System.out.print("Type 2nd price: ");
        int p2 = input.nextInt();
        
        System.out.print("Type 3rd price: ");
        int p3 = input.nextInt();
        
        if(p1 < p2 && p1< p3){
            System.out.println(p1 + " is the lowest price!");
        }
        else if(p2 < p1 && p2< p3){
            System.out.println(p2 + " is the lowest price!");
    }
        else {
            System.out.println(p3 + " is the lowest price");
        }
    }
    
}
