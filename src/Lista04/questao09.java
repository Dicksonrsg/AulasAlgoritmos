
package Lista04;

import java.util.Scanner;

public class questao09 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("Contador de casas.");
        
        System.out.print("Digite o numero: ");
        int n = input.nextInt();
        
        int cen = n/100;
        int dez = (n % 100) / 10;
        int uni = ((n % 100) % 10);
        
        if(cen > 0 && dez ==0 && uni==0){
            System.out.println(n+" = "+cen+" centenas.");
        }        
        else if (cen > 0){
            System.out.println(n + " = " + 
                    cen+" centenas,"+ dez+" dezenas e "+ 
                    uni+" unidades");
        }
        else if(dez > 0 && uni==0){
            System.out.println(n+" = "+dez+" dezenas.");
        }
        else if (dez>0){
            System.out.println(n+" = "+dez+ " dezenas e "+
                    uni+ " unidades.");
        }
        else {
            System.out.println(uni +" unidades.");
        }
        
    }
    
}
