package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator1 {

	public static void main(String[] args) {
		ArrayList ar2=new ArrayList();
		ar2.add("blue");
		ar2.add("green");
		ar2.add("yellow");
		System.out.println(ar2);
		Iterator itr=ar2.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}

}
