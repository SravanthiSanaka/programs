package examples;

import java.util.Scanner;

public class Main6 {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter size of first array");
		int n=s.nextInt();
		System.out.println("enter size of second array");
		int m=s.nextInt();
		int a[]=new int[n];
		int b[]=new int[m];
		System.out.println("enter elements into first array");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("enter elements into second array");
		for(int j=0;j<m;j++)
		{
			b[j]=s.nextInt();
		}
		System.out.println(UserMainCode6.sumElement(a,b));
	}
}
