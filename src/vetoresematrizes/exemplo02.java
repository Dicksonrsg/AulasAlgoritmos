
package vetoresematrizes;

import java.util.Scanner;

public class exemplo02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String nome[] = new String[3];
        int nota[][] = new int[3][4];
        
        for (int i = 0; i < nome.length; i++){
        
            System.out.println("Nome " + (i+1)+ ": ");
            nome[i] = input.next();
            
            for(int j = 0; j<4; j++){
                System.out.println("Nota "+(j+1)+ " de "+ nome[i]+ ": ");
                nota[i][j] = input.nextInt();
            }
        }
    }
    
}
