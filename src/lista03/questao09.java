package lista03;

import java.util.Scanner;

public class questao09 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int carrier = 0;
		
		System.out.print("Type 1st number: ");
		int n1 = input.nextInt();
		
		System.out.print("Type 2nd number: ");
		int n2 = input.nextInt();
		
		System.out.print("Type 2nd number: ");
		int n3 = input.nextInt();
		
		if(n1<n2){
			carrier = n1;
			n1 = n2;
			n2 = carrier;
		}
		if(n1<n3){
			carrier = n1;
			n1 = n3;
			n3 = carrier;
		}
		if(n2<n3){
			carrier = n2;
			n2 = n3;
			n3 = carrier;
		}


		System.out.println("1st: "+n1+
				"\n2nd: " + n2 +
				"\n3rd: " + n3);
	}

}
