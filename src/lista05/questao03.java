
package lista05;

import java.util.Scanner;

public class questao03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("Type required info.");
        
        System.out.print("Name: ");
        String n = input.next();
        
        int age, salary; 
        char sex = 'z', s;
        
        do{
            System.out.print("Age: ");
            age = input.nextInt();
        }while (age <= 0 || age >=150);
        
        do{
            System.out.print("Salary: ");
            salary = input.nextInt();
        }while (salary <= 0);        
                        
        do{
            System.out.print("Gender: ");
            sex = input.next().charAt(0);
        }while (sex != 'f' && sex != 'm' && sex != 'F' && sex != 'M');
        
        do{
            System.out.print("Marital status: ");
            s = input.next().charAt(0);
        }while (s != 's' && s != 'm' && s != 'w' && s != 'd' && 
                s != 'S' && s != 'M' && s != 'W' && s != 'D');        
    }
    
}
