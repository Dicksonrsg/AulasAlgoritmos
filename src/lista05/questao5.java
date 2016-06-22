package lista05;

import java.util.Scanner;

public class questao5 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		float year = 0, pa = 0, pb = 0, t1 =0, t2=0;
		
		System.out.print("Type initial population of A: ");
		pa = input.nextFloat();
		
		System.out.print("Type growth rate: ");
		t1 = input.nextFloat();
		
		System.out.print("Type initial population of B: ");
		pb = input.nextFloat();
		
		System.out.print("Type growth rate: ");
		t2 = input.nextFloat();
		
        if (pa > pb){
        	do{
        		pb *= t2;
        		pa *= t1;
        		year++;
        }while ( pa > pb);
        }
        
        else if (pb > pa ){
            do{
                pb *= t2;
                pa *= t1;
                year++;
        }while ( pb > pa);        	
        }
        
        System.out.println("Years needed for population of City A to exceed B's: " + (year+1));
        input.close();
	}

}
