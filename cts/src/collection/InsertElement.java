package collection;

import java.util.ArrayList;

public class InsertElement {

	public static void main(String[] args) {
		ArrayList ar2=new ArrayList();
		ar2.add("blue");
		ar2.add("green");
		ar2.add("yellow");
		System.out.println(ar2);
		ar2.add(0,"red");
		System.out.println(ar2);
	}

}
