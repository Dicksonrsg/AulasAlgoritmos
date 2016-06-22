package lista05;

import java.util.Scanner;

public class questao10 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Type beginning of interval: ");
		int b = input.nextInt();
		
		System.out.print("Type end of interval: ");
		int e = input.nextInt();		
		
		while (b < e){
			if ((b % 2) !=0 ){
				System.out.println(b);
			}
			b++;
		}
input.close();
	}

}
