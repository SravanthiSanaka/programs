package collection;
import java.util.function.*;

public class BiFunctionEx {

	public static void main(String[] args) {
		BiFunction<Integer,Integer,Integer> add=(a,b)->(a+b);
		BiFunction<Integer,Integer,Integer> sub=(a,b)->(a-b);
		BiFunction<Integer,Integer,Integer> prod=(a,b)->(a*b);
		System.out.println("sum is:"+add.apply(10,20));
		System.out.println("sum is:"+sub.apply(20,10));
		System.out.println("sum is:"+prod.apply(3,20));
	}

}
