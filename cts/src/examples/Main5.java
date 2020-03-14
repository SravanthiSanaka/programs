package examples;

import java.util.Scanner;

public class Main5 {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter size of array");
		int n=s.nextInt();
		int a[]=new int[n];
		System.out.println("enter elements into array");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("enter search element");
		int search=s.nextInt();
		System.out.println(UserMainCode5.findElement(a,search));
	}
}
