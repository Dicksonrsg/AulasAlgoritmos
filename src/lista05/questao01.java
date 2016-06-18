    
package lista05;

import java.util.Scanner;

public class questao01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
    int n ;
    
    do {
        System.out.print("Informe um numero: ");
        n = input.nextInt();
        
        if(!(n >= 0 && n <= 10)){
            System.out.println("Valor invalido!");
            
        }
    }while(!(n >= 0 && n <= 10));
   
    }
    
    
    
}
