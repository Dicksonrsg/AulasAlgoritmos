
package Exemplo1;

import java.util.Scanner;

public class basexpoente {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // http://wiki.python.org.br/EstruturaDeRepeticao n13
        
        System.out.println("Type base number: ");
        int b = input.nextInt();
        
        System.out.println("Type exponent number: ");
        int e = input.nextInt();
        
        int r= b;
        
        for (int i = 1; i<e; i++){
            r*=b;
        }
        System.out.println(r);
    }
    
}
