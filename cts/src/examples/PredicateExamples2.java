package examples;
import java.util.function.Predicate;

public class PredicateExamples2 {

	public static void main(String[] args) {
		String[] names= {"chinni","bannu","soppu","ram","kiran"};
		Predicate<String> ktest=s->s.charAt(0)=='k';
		for(String n:names) {
			if(ktest.test(n)) {
				System.out.println(n);
			}
		}

	}

}
