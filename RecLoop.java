import java.util.Scanner;

public class RecLoop{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number a   ");
		int n =scan.nextInt();	
		
		Scanner scan1 = new Scanner(System.in);
		System.out.print("Enter a number b   ");
		int n1 =scan1.nextInt();
		
	System.out.println("The gcd of a number is "+    "="  + euclidRec(n,n1));
	System.out.println("The power of a number is "+    "="  + powIterative(n,n1));
	System.out.println("The gcd of a number is "+    "="  + euclid(n,n1));
	System.out.println("The power number of"+    "="  + powRec(n,n1));
		
	}
	//todo: Look at the given code and try to understand the methods.
	//The first method euklidRek uses recursion to compute the euclidean algorithm.
	//You can look up the algorithm here: https://en.wikipedia.org/wiki/Euclidean_algorithm
	//Add another method euclidIterative that computes the euclidean algorithm iterative.
	//The second method powIterative computes the the base to the power of n in a iterative way.
	//Add another method powRek which does exactly the same, but by using recursion.

	 public static int euclidRec(int a, int b) {
		if (a == b) {
			return a;
		} else if (b > a) {
			int temp = a;
			a = b;
			b = temp;
			return euclidRec(a, b);
		} else {
			return euclidRec(a - b, b);
		}
	}
	 


    public static double powIterative(final double base, final int n) {
		if (n < 0) {
			System.out.println("(Our version of) power is undefined for negative numbers.");
			return -1;
		} else {
			double result = 1; 

			for (int i = n; i > 0; --i) {
				result = result * base;
			}
			return result;
		}
	}
	 public static double euclid(int a ,int b) {
		 double x=0;
		 for (int i=0 ; i<Integer.MAX_VALUE; i++) { 
		 if(a==b) {
			return x=a ;
		 }
			 
		 if (b > a) {
			 int temp = a;
				a = b;
				b = temp;
			 
		 }
		 else {
			 x=a-b;
		 }
	}
		 return x;
	 }
	 public static double powRec(final double base, final int n) { 
		 if (n < 0) {
			 return -1;
			 
		 }
		 else if (n==0) {
			 return 1;
		 }
	  else { 
			return base*powRec(base,n-1);
			
}
		 
}
}