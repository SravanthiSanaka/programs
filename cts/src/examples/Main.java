package examples;

import java.util.Scanner;

public class Main {
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a first number");
	int a=sc.nextInt();
	System.out.println("enter a second number");
	int b=sc.nextInt();
	System.out.println("enter a third number");
	int c=sc.nextInt();
	System.out.println(UserMainCode.findRoots(a,b,c));
	}
}
