
package introducao;

import java.util.Scanner;

public class Teste1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
 
        System.out.print("Digite primeiro numero: ");
        int pri = input.nextInt();
        System.out.print("Digite segundo numero: ");
        int seg = input.nextInt();
        int mult = pri * seg;
        System.out.println(pri + " x " + seg + " = " + mult);
    }
    
}
