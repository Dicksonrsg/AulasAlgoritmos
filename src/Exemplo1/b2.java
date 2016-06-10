
package Exemplo1;

import java.util.Scanner;

public class b2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Type average in: ");
        float avg = input.nextFloat();
        
        System.out.print("Type absences in: ");
        int a = input.nextInt();
        
        if (avg>7 && a<=25){
        System.out.println("Student Passed");
        }
        else {
        System.out.println("Student Failed");
        }
        
    }
}
