
package Lista04;

import java.util.Scanner;


public class questao01 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        float plus = 0.0f, ns =0.0f;
        
        System.out.println("Tabajara Salary calculator");
        
        System.out.print("Type salary: ");
        float salary = input.nextFloat();
        
        if(salary <= 280.00f){
        plus = salary*0.2f;
        ns = salary + plus;
            System.out.println("Old Salary is R$" + salary + "\nAdded percentage is 20%" + 
                    "\nAdded value is " + plus + "\nNew salary is R$" + ns);
        }
        else if(salary > 280.01f && salary <= 700.00f){
        plus = salary*0.15f;
        ns = salary + plus;
            System.out.println("Old Salary is R$" + salary + "\nAdded percentage is 15%" + 
                    "\nAdded value is " + plus + "\nNew salary is R$" + ns);
        }
        else if(salary > 700.01f && salary <= 1500.00f){
        plus = salary*0.1f;
        ns = salary + plus;
            System.out.println("Old Salary is R$" + salary + "\nAdded percentage is 10%" + 
                    "\nAdded value is " + plus + "\nNew salary is R$" + ns);
        }
        else if(salary > 1500.01f){
        plus = salary*0.05f;
        ns = salary + plus;
            System.out.println("Old Salary is R$" + salary + "\nAdded percentage is 5%." + 
                    "\nAdded value is " + plus + "\nNew salary is R$" + ns);
        }
        else{
            System.out.println("Salary is out of range.");
        } 
    }
    
}
