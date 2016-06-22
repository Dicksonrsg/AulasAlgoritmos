package lista05;

import java.util.Scanner;

public class questao8 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		float n =0, sum = 0, avg = 0;
		
		for(int i = 0; i<5; i++){
			System.out.print("Type a number: ");
			n = input.nextFloat();
			sum+=n;
		}
		avg = sum/5;
		System.out.print("Sum: "+ sum + "\nAverage: "+avg);
		
input.close();
	}

}
