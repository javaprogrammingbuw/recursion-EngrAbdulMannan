import java.util.Scanner;

public class Factorial {
	//todo: implement a recursive functions whicht gives you the factorial value of a given number
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number to find the Factorial   ");
		int n =scan.nextInt();	
		
		System.out.println("The Factorial of number is : "+ calFactorial(n));
		
}
	public static int calFactorial(int n){
		if ( n==1){
			return n;
			
		}
		else {
			
			return n* calFactorial(n-1); //n*(n-1);
		}
	}
	
	/*
	 * fak(4)=4*fak(3)
	 * fak(3)=3*fak(2)
	 * fak(n)=n*fak(n-1)
	 * */
	
}


