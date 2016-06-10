package Exemplo1;

import java.util.Scanner;


public class teste3 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Digite 1ª nota: ");
        float p = input.nextFloat();
        
        System.out.print("Digite 2ª nota: ");
        float s = input.nextFloat();
        
        System.out.print("Digite 3ª nota: ");
        float t = input.nextFloat();
        
        
        float m = ((p*4 + s*5 + t*6)/15);
        System.out.println("Media: " + m);
        
                        
                }       
    }  