package lista04;

import java.util.Scanner;

public class questao06 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Quadratic equeation calculator!");

		System.out.print("Type coefficient A: ");
		int a = input.nextInt();
		if(a==0){
			System.out.println("Coefficient A can not be zero!");
			System.exit(0);}
		
		System.out.print("Type coefficient B: ");
		int b = input.nextInt();
		
		System.out.print("Type coefficient C: ");
		int c = input.nextInt();
		
		int delta  = (b*b)- (4*a*c);
		float root = 0.0f;
		
		if (delta < 0 ){
			System.out.println("Delta is negative. \nThis equation has no real roots.");
			System.exit(0);
		}
		else if (delta==0){
			root = ((-b)/(2*a));
			System.out.println("This Equation has only one root. \nWhich is "+ root);
		}
		else {
			
			System.out.println("ti");
		}
	}

}
