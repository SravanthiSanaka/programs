package examples;
import java.util.function.Predicate;

public class PredicateExamples {

	public static void main(String[] args) {
		Predicate<String>p2=str->(str.charAt(0)=='k');
	 Predicate<Integer> p1=i->{boolean flag=true;
		 for(int x=2;x<i;x++)
		 {
			 if(i%x==0) {
				 flag=false;
				 break;
			 }
		 }
		return flag;	  
	 };
	 System.out.println(p1.test(3));
	 System.out.println(p2.test("kill"));
	}
		
}
