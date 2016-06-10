
package introducao;

import java.util.Scanner;


public class teste2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Digite 1ª nota: ");
        float p = input.nextFloat();
        
        System.out.print("Digite 2ª nota: ");
        float s = input.nextFloat();
        
        System.out.print("Digite 3ª nota: ");
        float t = input.nextFloat();
        
        System.out.print("Digite 4ª nota: ");
        float q = input.nextFloat();
        
        float m = ((p + s + t + q)/4);
        System.out.println("Media: " + m);
        
        if (m > 7.0){
        System.out.println("Aprovado!");
    }
        else {
               System.out.println("Reprovado!"); }
                }       
    }  

//Operadores:
//> Maior que
//< Menor que
//>= maior ou igual 
//<= menor ou igual
//!= diferente
//== igual

