
package repeticaofor;

import java.util.Scanner;


public class exemplo01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
/*        for (int i = 10; i > 0; i-=2){
            System.out.println("Gool " + i);
        }*/
        
        int numero =0, soma=0;
        for (int i=1; i<=5; i++){
            System.out.print("Digite o numero " + i +": ");
            numero = input.nextInt();
            
            soma+= numero;
            
        }
    }
    
}
