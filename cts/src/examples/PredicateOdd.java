package examples;

import java.util.function.Predicate;

public class PredicateOdd {
	public static void main(String args[]) {
	
		Predicate <Integer> p2=i->(i%2!=0);
			System.out.println(p2.test(10));
			System.out.println(p2.test(11));
			System.out.println(p2.test(12));
	}
}
