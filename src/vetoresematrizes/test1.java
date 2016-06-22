
package vetoresematrizes;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String nome[] = new String[3];
        int nota[][] = new int[3][4];
        int soma[] = {0,0,0};
        
        float media[] = new float[3];
        
        for (int i = 0; i < nome.length; i++){
        
            System.out.println("Nome " + (i+1)+ ": ");
            nome[i] = input.next();
            
            for(int j = 0; j<4; j++){
                System.out.println("Nota "+(j+1)+ " de "+ nome[i]+ ": ");
                nota[i][j] = input.nextInt();
                soma[i] += nota[i][j]; 
            }
        }
        
        for (int k = 0; k < soma.length; k++){
            media[k] = soma[k] / 4;
            
            if(media[k] >= 7.0f){
                System.out.println(nome[k]+" Aprovado!" );
            }
            else{
                System.out.println(nome[k]+" Reprovado!");
            }
        }
    }    
    
}
