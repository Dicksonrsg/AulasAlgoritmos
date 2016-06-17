
package estruturaderepeticaowhile;

import java.util.Scanner;

public class exemplo01 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int nt = 0;
        
        String resposta =  "nao";
        
        while (!resposta.equalsIgnoreCase("sim")){
        
            System.out.println("Eu sou bonito? ");
            resposta = input.next();
            nt++;
            
            }
        System.out.println("Voce fez uma boa escolha, após "+ nt + " tentativa(s)");
        }
    }
    

