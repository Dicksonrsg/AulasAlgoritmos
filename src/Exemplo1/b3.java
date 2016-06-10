
package Exemplo1;

import java.util.Scanner;


public class b3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        boolean logged = false;
        
        System.out.print("Login: ");
        String login = input.next();
        
        System.out.print("Password: ");
        String pass = input.next();
        
        if(login.equals("dickson") && pass.equals("spider")){
        logged = true;
        }
        if(!logged){
        System.out.println("Wrong user or password!");
        }
        else{
        System.out.println("Logged successfully!!");
        }
        
        
        
    }
    
}
