package examples;
import java.util.function.Predicate;
public class Predicate3 {

	public static void main(String[] args) {
		Predicate <Integer> p1=i->(i>20);
		Predicate <Integer> p2=i->(i%2==0);
		System.out.println(p1.or(p2).test(221));
	}

}
