package lista05;

import java.util.Scanner;

public class questao9 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int imp =0;
		
		while (imp <50){
			imp++;
			if ((imp % 2) !=0 ){
				System.out.println(imp);
			}
		}
input.close();
	}

}
