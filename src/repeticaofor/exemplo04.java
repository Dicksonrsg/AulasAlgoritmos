
package repeticaofor;

import java.util.Scanner;


public class exemplo04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m=0, n=0;
        
        System.out.println("Digite o numero para tabuada: ");
        n = input.nextInt();
        
        
        for(int i=1; i<=9; i++){
            m = n*i;
        System.out.println("3 X " + i +" = "+ m);
        }
    }
    
}
