
package lista03;

import java.util.Scanner;


public class questao04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Type an alphabet letter: ");
        String letter = input.next();
        
        if(letter.equalsIgnoreCase("a") || letter.equalsIgnoreCase("e") || letter.equalsIgnoreCase("i")
        ||letter.equalsIgnoreCase("u")){
            System.out.println("This letter is a vowel.");
        }
        else{
            System.out.println("This letter is a consonant");
        }
    }
    
}
