
package lista03;

import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Escreva a primeira letra do seu sexo: ");
        String s = input.next();
        
        if(s.equalsIgnoreCase("m")){
            System.out.println("Masculino");
        }
        else if(s.equalsIgnoreCase("f")){
            System.out.println("Feminino");
        }
        else{
            System.out.println("Sexo Invalido");
        }
    }
    
}
