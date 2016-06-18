
package lista05;

import java.util.Scanner;

public class questao02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
                
    String user ;
    String pass ;
    
    do {
        System.out.print("Username: ");
        user = input.next();
        
        System.out.print("Password: ");
        pass = input.next();
        
        if(user.equals(pass)){
            System.out.println("Username and password cannot be the same!");
            
        }
        else{
            System.out.println("Well done!");
        }
    }while(user.equals(pass));
   
    }
    
}
