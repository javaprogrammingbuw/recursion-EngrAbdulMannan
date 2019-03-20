import java.util.Scanner;

public class Fibonacci {
	//todo: The Fibonacci sequence is a sequence where the current number is the sum of the previous numbers. You can read it up here:
	//https://en.wikipedia.org/wiki/Fibonacci_number
	//Write an iterative method fib which takes an integer as parameter. This integer corresponds to the position in the Fibonacci sequence.
	//fib should return the fibonacci number at this position. For example, fib(4) should return 3.
	//Now, write a second methond fibRek. fibRek does exactly the same like fib, but it works recursive.

/*
 * 5=4+3
 * 4=3+2
 * 3=2+1
 * 2=1+0
 * */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number to find the Fibonacci   ");
		int n =scan.nextInt();	
		
		System.out.println("The Fibonacci number of"+n+  "="  + fibRek(n));
		System.out.println("The Fibonacci number of"+n+    "="  + fib(n));
}
	public static int fibRek(int n) {
		if(n<2) {
			return n;
		}
		else {
			return fibRek(n-1)+fibRek(n-2);
		}
	}
	public static int fib(int n) {
		int x = 0; //result
		int y = 0;
		int z = 1;
		if(n<2) {
			x=n;
		}
		else {
			for(int i =1; i<n;i++ ) {
				x=y+z;
				int temp = z;
				z=x;
				y=temp;
			}
		}
		return x;
	}
	
	/*
	 * y=2 (fib(3))
	 * z=3 (fib(4))
	 * 
	 * */
	
	
	/*   y z x
	 * y z x
	 * 0 1 1 2 3 5 8 13 ...
	 * 
	 * fib(0) = 0
	 * fib(1) = 1
	 * fib(2) = 1 = 0 + 1 = fib(0) + fib (1)
	 * 
	 * 
	 * */
}


