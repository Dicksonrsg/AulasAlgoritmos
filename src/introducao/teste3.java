
package introducao;

import java.util.Scanner;

public class teste3 {
        public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Digite 1ª nota: ");
        float p = input.nextFloat();
        
        System.out.print("Digite 2ª nota: ");
        float s = input.nextFloat();
        
        System.out.print("Digite 3ª nota: ");
        float t = input.nextFloat();
        
        
        float m = ((p*4 + s*5 + t*6)/15);
        System.out.println("Media ponderada: " + m);
        
        if (m < 3){
            System.out.println("Reprovado");
        }
        else if (m >= 7){
            System.out.println("Aprovado");
        }
        else if (m > 3 && m < 7) {
            System.out.print("Aluno em 4ª Prova com Média: " + m);
            
            System.out.println("Nota ª prova: ");
            float n4 = input.nextFloat();
            
            m = (m + n4)/2;
            
            if (m > 5){
                System.out.print("Aluno Aprovado com média: " + m);
            }
            else{
            System.out.print("Aluno Reprovado com média: " + m);
            }
        }
        
                        
                }   
    
}
