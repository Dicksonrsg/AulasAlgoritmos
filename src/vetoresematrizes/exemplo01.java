
package vetoresematrizes;

import java.util.Scanner;

public class exemplo01 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        
        int numeros[] = new int[10]; 
        String nome[] = new String[10];
        
        System.out.println(numeros[3]);
        
        for(int i = 0; i < numeros.length; i++){
            System.out.print("Digite o numero "+(i+1)+ ": ");
            numeros[i] = input.nextInt();
        }
        
        for(int i = 0; i < numeros.length; i++){
            System.out.println("-> "+ numeros[i]);
        }
    }
    
}
