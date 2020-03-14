package assignment;

import java.util.Scanner;

public class Ass3 {

	public static void main(String[] args) {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		while(n>0)
		{
			int rem=n%10;
			if(rem%2==0)
			{
				sum=sum+(rem*rem);
			}
			n=n/10;	
			
		}
		System.out.println("sum of squares of even numbers:"+sum);

	}

}
