package assignment;

import java.util.Scanner;

public class Ass1 {

	public static void main(String[] args) {
		String rev="";
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String str=sc.nextLine();
		int length=str.length();
		for(int i=length-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		if(str.equals(rev))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
		String s=rev;
		for(int j=0;j<s.length();j++)
		{
			if(s.charAt(j)=='a' || s.charAt(j)=='e' || s.charAt(j)=='i' || s.charAt(j)=='o' || s.charAt(j)=='u')
			{
				count++;
			}
		}
		if(count>=2)
		{
			System.out.println("valid");
		}
		else
		{
			System.out.println("invalid");
		}
		
		
	}

}
