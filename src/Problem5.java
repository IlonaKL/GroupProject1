

import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		/* Write a program to swap 2 numbers without
		a temporary variable?
		*/
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter number a");
		int a=input.nextInt();

		System.out.println("Enter number b");
		int b=input.nextInt();
		input.close();

		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a = "+a+" and b = "+b);
	}

}
