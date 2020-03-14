package collection;

import java.util.ArrayList;

public class GetElement {

	public static void main(String[] args) {
		ArrayList ar2=new ArrayList();
		ar2.add("blue");
		ar2.add("green");
		ar2.add("yellow");
		System.out.println(ar2);
		ar2.get(0, "pink");
		System.out.println(ar2);
	}

}
