
package Lista04;

import java.util.Scanner;


public class questao07 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("Verificador ano bissexto.");
        
        System.out.print("Digite o ano: ");
        int ano = input.nextInt();
        
        if (ano%4 ==0){
            System.out.println(ano+" é Bissexto!");
        }
        else {
        System.out.println(ano+" não é Bissexto!");
        }
        
    }
    
}
