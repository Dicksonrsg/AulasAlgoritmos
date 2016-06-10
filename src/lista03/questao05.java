
package lista03;

import java.util.Scanner;

public class questao05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Type 1st grade: ");
        float g1 = input.nextFloat();
        
        System.out.print("Type 2nd grade: ");
        float g2 = input.nextFloat();
        
        float avg = (g1+g2)/2;
        
        if(avg == 10.0f){
            System.out.println("Distincted Passed!");
        }
        else if (avg >= 7 ){
            System.out.println("Passed!");
        }
        else{
            System.out.println("Failed.");
        }
    }
    
}
