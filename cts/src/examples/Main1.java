package examples;

import java.util.Scanner;

public class Main1 {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int n=s.nextInt();
		System.out.println(UserMainCode1.isPrime(n));
	}
}
