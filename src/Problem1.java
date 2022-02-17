

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		/*
		 * Create an array on int values using a scanner and calculate the sum of all
		 * stored elements in that array.
		 */
		
		int sum = 0;
		Scanner input = new Scanner(System.in);
		
		int size;
		System.out.println("Enter the size of an array");
		do {
		size = input.nextInt();
		
		if (size==0)
			System.out.println("The array is empty");
		else if (size<0)
			System.out.println("Please enter valid size of the array");
		else {
			System.out.println("Enter " + size + " elements of the array");
			int[] number = new int[size];
			for (int i = 0; i < size; i++) {
				number[i] = input.nextInt();
				sum += number[i];
			}
			input.close();
			System.out.println("The sum of all stored elements in an the array equals to " + sum);
		}
		} while (size<0);
	}
}
