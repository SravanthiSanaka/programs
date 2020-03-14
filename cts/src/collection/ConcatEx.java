package collection;

import java.util.function.BiConsumer;

public class ConcatEx {

	public static void main(String[] args) {
		BiConsumer<String,String> c1=(a,b)->System.out.println(a+b);
		c1.accept("Hello", "Hi");
		
	}

}
