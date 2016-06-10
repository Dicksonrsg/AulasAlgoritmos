
package lista03;

import java.util.Scanner;

public class questao01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Type a number: ");
        float n1 = input.nextFloat();
        
        System.out.print("Type another number: ");
        float n2 = input.nextFloat();
        
        if (n1 > n2){
            System.out.println(n1);
        }
        else {
            System.out.println(n2);
        }
    }
    
}
