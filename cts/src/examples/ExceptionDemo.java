package examples;
import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		int e,f,h;
		Scanner cin=new Scanner(System.in);
		System.out.println("Enter e,f");
		e=cin.nextInt();
		f=cin.nextInt();
		try
		{
			h=e/f;
			System.out.println("the quotient is:"+h);
		}
		catch(java.lang.ArithmeticException obj)
		{
			System.out.println("the error is"+obj);
		}
		System.out.println("hello java");
		System.out.println("exception handling");

	}

}
