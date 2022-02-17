

public class Problem7 {

	public static void main(String[] args) {
		/*Write a Java Program to print
		* the first 10 numbers of Fibonacci series.
		*/

		int[] fib=new int[10];

		fib[0]=0;
		fib[1]=1;

		System.out.print("Fibonacci series: "+fib[0]+", "+fib[1]+", ");

		for (int i=2; i<10; i++) {
			fib[i]=fib[i-2]+fib[i-1];
			System.out.print(fib[i]+", ");
		}
	}
}
