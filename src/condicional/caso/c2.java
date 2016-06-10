
package condicional.caso;

import java.util.Scanner;


public class c2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("## Opções ##\nGabriel\nCarlos\nCaio");
        String choice = input.next();
        
        switch (choice) {
            case "Gabriel":
                System.out.println("Cabra bom, esse garoto");
                break;
            case "Carlos":
                System.out.println("Sujeito sério e concentrado");
                break;
            case "Caio":
                System.out.println("Gente fina e honesta");
                break;
            default:
                System.out.println("Você é azedo e não gosta de gente");
        }
    }
    
}
