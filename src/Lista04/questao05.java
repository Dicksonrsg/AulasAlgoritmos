package lista04;

import java.util.Scanner;

public class questao05 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Triangle identifier!");
		
		System.out.print("Type 1st side: ");
		int s1 = input.nextInt();
		
		System.out.print("Type 2nd side: ");
		int s2 = input.nextInt();
		
		System.out.print("Type 3rd side: ");
		int s3 = input.nextInt();
		
		if (s1 ==0 || s2 == 0 || s3 ==0){
			System.out.println("Sorry, A triangle can not have a side zero.");
			System.exit(0);
		}
		else{
			if(s1 + s2 > s3 || s1 + s3 > s2 || s2 + s3 > s1 ){
				if(s1 *2 == s2 + s3){
					System.out.println("This triangle is Equilateral.");}
				
				else if (s1 == s2 || s1 == s3 || s2 == s3){
					System.out.println("This triangle is Isosceles.");}
				
				else if (s1 != s2 || s1 != s3 || s2 != s3){
					System.out.println("This triangle is Scalane.");}
				
				else {
					System.out.println("Something went wrong. \nTry again.");}		
			}
		}
		input.close();
	}
}
