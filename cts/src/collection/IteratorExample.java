package collection;

import java.util.ArrayList;

public class IteratorExample {

	public static void main(String[] args) {
		Student s1=new Student("123","praveen");
		Student s2=new Student("456","kumar");
		Student s3=new Student("789","anil");
		ArrayList ar=new ArrayList();
		ar.add(s1);
		ar.add(s2);
		ar.add(s3);
		System.out.println(ar);
		Iterator itr=ar.iterator();
		while(itr.hasNext())
			System.out.println();
		
		

	}

}
