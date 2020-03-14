package examples;

import java.util.Scanner;

public class Main2 {
	public static void main()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int n=s.nextInt();
		System.out.println(UserMainCode2.checkSum(n));
	}
}