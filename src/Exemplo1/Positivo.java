
package Exemplo1;

import java.util.Scanner;

public class Positivo {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Digite um numeron: ");
        int n = input.nextInt();
        
        if(n > 0){
            System.out.println("Positivo");}
        else if (n < 0){
            System.out.println("Negativo");
        }
        else {
            System.out.println("Numero Neutro");
}
    } 
    
}
