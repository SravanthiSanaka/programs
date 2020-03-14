package examples;

import java.util.Scanner;

public class Main3 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s=sc.next();
		System.out.println(UserMainCode3.countVowels(s));
	}
}
