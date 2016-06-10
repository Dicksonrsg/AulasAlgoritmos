
package introducao;

import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
        System.out.println("Qual o seu nome: ");
        
        Scanner entrada = new Scanner(System.in);
        
        String nome = entrada.next();
        System.out.println("Bem vindo, " + nome + "!");
        
    }
    
}
