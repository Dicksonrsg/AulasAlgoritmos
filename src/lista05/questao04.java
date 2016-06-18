
package lista05;

import java.util.Scanner;

public class questao04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        float year = 0, pa = 80000, pb = 200000;
        
        do{
            pb *= 1.015f;
            pa *= 1.03f;
            year++;
        }while ( pa != pb || pa > pb);
        
        System.out.println("Years needed for population of City A to exceed B's: " + (year+1));
  
    }
    
}
