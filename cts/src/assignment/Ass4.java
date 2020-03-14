package assignment;

import java.util.Scanner;

public class Ass4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String str=sc.nextLine();
		System.out.println("enter a number");
		int n=sc.nextInt();
		StringBuffer sb=new StringBuffer();
		sb.append(str.substring(0,n));
		sb.append(str.substring(str.length()-n));
		System.out.println("first n and last n in a string is:"+sb.toString());
	}

}
