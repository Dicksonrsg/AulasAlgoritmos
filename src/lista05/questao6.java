package lista05;

import java.util.Scanner;

public class questao6 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);

		/* For prints numbers from 1 - 20 in vertical position*/ 
		for (int i = 1; i <=20; i++){
			System.out.println(i);
		}
		/* For prints numbers from 1 - 20 side by side (same line)*/
		for(int i = 1; i <=20; i++){
			System.out.print(i +" , ");
		}
input.close();
	}

}
