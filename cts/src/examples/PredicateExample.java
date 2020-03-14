package examples;
interface TestNumber{
	public boolean teststr(int x);
}
public class PredicateExample {

	public static void main(String[] args) {
		TestNumber tn=i->{
			if(i>10)
				return true;
			else
				return false;
			
		};
		System.out.println(tn.teststr(11));
	}

}
