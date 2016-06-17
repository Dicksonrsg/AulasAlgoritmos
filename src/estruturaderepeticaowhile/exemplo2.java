
package estruturaderepeticaowhile;

import java.util.Scanner;


public class exemplo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int n = 0, soma = 0, c =0;
        
            System.out.print("Informe o numero a ser somado: ");
            n = input.nextInt();
       
        
        while(n !=0){
            
            soma+=n;
            c++;
            System.out.print("Informe o numero a ser somado: ");
            n = input.nextInt();
        }
         System.out.println("Media: " + (soma/(c-1)));
    }
}
