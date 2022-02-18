

public class Problem9 {

	public static void main(String[] args) {
		/*Write a java program to find
		* the second largest number in the array?
		*/

		int[][] numbers = {
				{ 2, 5, 15, -4 },
				{ 121, -6, 666 },
				{ 54, -34, 2, 351, 155, 3 },
				{ 7, -999 }
				};

		int max = numbers[0][0];
		int second = numbers[0][0];

		for (int[] number : numbers) {
			for (int num : number) {
				if (num > max) {
					second=max;
					max = num;
				} else if (num>second && num!=max)
				second=num;
			}
		}
		System.out.println("The second largest number in the array is "+second);
	}
}
