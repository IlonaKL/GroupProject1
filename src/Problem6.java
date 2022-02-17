

import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {
		/*Write a java program to check whether
		* a given number is prime or not?
		*/

		Scanner input=new Scanner(System.in);
		System.out.println("Enter number");
		int num=input.nextInt();
		input.close();

		boolean prime=true;
		for (int i=2; i<num; i++) {
			if (num%i==0)
				prime=false;
		}
		
		if (prime==false)
			System.out.println("NOT a prime number");
		else
			System.out.println("Prime number");
	}
}
