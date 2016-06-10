
package lista03;

import java.util.Scanner;

public class questao06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Type 1st number: ");
        int n1 = input.nextInt();
        
        System.out.print("Type 2nd number: ");
        int n2 = input.nextInt();
        
        System.out.print("Type 3rd number: ");
        int n3 = input.nextInt();
        
        if(n1 > n2 && n1> n3){
            System.out.println(n1 + " is the highest number!");
        }
        else if(n2 > n1 && n2> n3){
            System.out.println(n2 + " is the highest number!");
    }
        else {
            System.out.println(n3 + " is the highest number");
        }
    }
    
}
