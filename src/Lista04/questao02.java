
package Lista04;

import java.util.Scanner;

public class questao02 {
    public static void main(String[] args) {
       Scanner input =  new Scanner(System.in);
       float it = 0.0f, inss = 0.0f, fgts = 0.0f, lu = 0.0f, dd = 0.0f, nw = 0.0f;
       
       System.out.println("Salary calculator.");
       
       System.out.print("Type your hour value: ");
       float hm = input.nextFloat(); 
       
       System.out.print("Type hours worked: ");
       float hw = input.nextFloat();
       
       float gw = hm*hw;
       
       if ( gw <= 900.00f ){
       inss = gw*0.1f;
       fgts = gw*0.11f;
       lu = gw*0.03f;
       dd = inss + lu;
       nw = gw - dd;
       
           System.out.println("Gross wage ("+ hm +" * "+ hw +"): R$"+ gw +
                   "\nIncome tax: Free of it"+ 
                   "\nINSS: R$"+ inss + 
                   "\nDiscounted total: " + dd + 
                   "\nNet wage: "+nw);
       }
       else if ( gw <= 1500.00f ){
       it = gw*0.05f;
       inss = gw*0.1f;
       fgts = gw*0.11f;
       lu = gw*0.03f;
       dd = inss + lu + it;
       nw = gw - dd;
       
           System.out.println("Gross wage ("+ hm +" * "+ hw +"): R$"+ gw +
                   "\nIncome tax: R$"+ it + 
                   "\nINSS: R$"+ inss + 
                   "\nDiscounted total: " + dd + 
                   "\nLabor Union: " + lu +
                   "\nNet wage: "+nw);
       }
       else if ( gw <= 2500.00f ){
       it = gw*0.1f;
       inss = gw*0.1f;
       fgts = gw*0.11f;
       lu = gw*0.03f;
       dd = inss + lu + it;
       nw = gw - dd;
       
           System.out.println("Gross wage ("+ hm +" * "+ hw +"): R$"+ gw +
                   "\nIncome tax: R$"+ it + 
                   "\nINSS: R$"+ inss + 
                   "\nDiscounted total: " + dd + 
                   "\nLabor Union: " + lu +
                   "\nNet wage: "+nw);
       }       
       else if ( gw >= 2500.01f ){
       it = gw*0.05f;
       inss = gw*0.2f;
       fgts = gw*0.11f;
       lu = gw*0.03f;
       dd = inss + lu + it;
       nw = gw - dd;
       
           System.out.println("Gross wage ("+ hm +" * "+ hw +"): R$"+ gw +
                   "\nIncome tax: R$"+ it + 
                   "\nINSS: R$"+ inss + 
                   "\nDiscounted total: " + dd + 
                   "\nLabor Union: " + lu +
                   "\nNet wage: "+nw);
       }
       else {
           System.out.println("Invalid Wage.");
           System.exit(1);
       }
       
    }
    
}
