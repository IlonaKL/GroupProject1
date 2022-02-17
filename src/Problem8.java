

public class Problem8 {

	public static void main(String[] args) {
		// Maximum and minimum number in the array?

		int[][] numbers = {
				{ 2, 5, 45, -4 },
				{ 11, -6, 0 },
				{ 54, -34, 2, 666, 15, 3 },
				{ 7, -999 }
				};

		int min = numbers[0][0];
		int max = numbers[0][0];

		for (int[] number : numbers) {
			for (int num : number) {
				if (num < min)
					min = num;
				if (num > max)
					max = num;
			}
		}
		System.out.println("Max = "+max+" and Min = "+min);
	}
}
