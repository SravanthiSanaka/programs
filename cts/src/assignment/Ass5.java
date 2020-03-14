package assignment;

import java.util.Scanner;

public class Ass5 {

	public static void main(String[] args) {
		int  rev = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
        while(num != 0) {
            int digit = num % 10;
            rev = rev* 10 + digit;
            num /= 10;
        }

        System.out.println("Reversed Number: " + rev);

	}

}
