package examples;
import java.util.*;
public class ExceptionAssignment1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		String str=s.nextLine();
		int x=Integer.parseInt(str);
		try {
			System.out.println("the square of number is"+x*x);
			System.out.println("sucessful");
		}
		catch(NumberFormatException e){
			System.out.println("not valid format of integer");
		}
		

	}

}
