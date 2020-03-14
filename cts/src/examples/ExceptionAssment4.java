package examples;

import java.util.Scanner;

public class ExceptionAssment4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int a=s.nextInt();
		System.out.println("enter b number");
		int b=s.nextInt();
		try {
			int c=a/b;
			System.out.println("the result is:"+c);
			System.out.println("successful");
		}
		catch(ArithmeticException e) {
			System.out.println("unsucessful arthematic exception");
		}
		

	}

}
