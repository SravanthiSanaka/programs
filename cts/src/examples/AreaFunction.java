package examples;

import java.util.function.BiFunction;
import java.util.function.Function;

public class AreaFunction {

	public static void main(String[] args) {
		Function<Integer,Double> area=a->(3.14*a*a);
		System.out.println(area.apply(4));
		BiFunction<Integer,Integer,Integer> max=(a,b)->(a>b?a:b);
		System.out.println("max number is:"+max.apply(8,9));
		
		
	}

}
