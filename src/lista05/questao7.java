package lista05;

import java.util.Scanner;

public class questao7 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);

		//Variables to be used, 'b' will receive biggest number, 'n' receives number typed, 'c' counts the times while is run.
		float b=0, n, c=0;

		//Inside of do input is received and compared. 
		do{
			System.out.print("Type a number: "); 
			n = input.nextFloat();
			
			if(n > b){
				b = n;
			}
			c++;
		}while(c < 5);
		
		System.out.println("The biggest number: "+b);
		input.close();
	}

}
