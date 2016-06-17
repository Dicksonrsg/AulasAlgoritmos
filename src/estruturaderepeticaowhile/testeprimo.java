
package estruturaderepeticaowhile;

import java.util.Scanner;


public class testeprimo {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int c = 0, j=1;
        
        System.out.println("Verificador de numero primo.");
        
        System.out.print("Digite número a ser testado: ");
        int n = input.nextInt();

        
        while (n >= j){
            if ( n % j == 0){
                c++;
            }
            j++;   
        }
        if (c == 2){
            System.out.println("Primo");
        }
        else{
            System.out.println("Não Primo");
        }
    }
    
    
}
