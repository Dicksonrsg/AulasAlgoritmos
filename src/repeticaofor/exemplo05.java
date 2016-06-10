
package repeticaofor;

import java.util.Scanner;


public class exemplo05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int f = 0;
        
        System.out.println("Digite o numero: ");
        f = input.nextInt();
        
        for (int i=f-1; i>=1; i--){
            f*=i;
            
        }
        System.out.println(f);
    }
    
}
