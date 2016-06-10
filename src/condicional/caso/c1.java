
package condicional.caso;

import java.util.Scanner;


public class c1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Type a number: ");
        int n1 = input.nextInt();
        
        switch (n1) {
            case 1: 
                 System.out.println("Janeiro");
                break;
            case 2:
                System.out.println("Fevereiro");
                break;
            case 3:
                System.out.println("Março");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Maio");
                break;
            case 6:
                System.out.println("Junho");
                break;
            default:
                System.out.println("Outro Mês");
        }

     }
    
}
