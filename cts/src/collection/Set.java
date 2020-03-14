package collection;

import java.util.HashSet;
class Emply{
	String num;
	String name;
	public Emply(String num, String name) {
		super();
		this.num = num;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Emply [num=" + num + ", name=" + name + "]";
	}
	
}

public class Set {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add("sravs");
		hs.add("appu");
		hs.add("rishi");
		hs.add("aki");
		hs.add("null");
		System.out.println(hs);
		
		HashSet hs1=new HashSet();
		hs1.add(new Emply("101","Kumar"));
		hs1.add(new Emply("102","Sukumar"));
		hs1.add(new Emply("103","RRR"));
		System.out.println(hs1);
		hs1.forEach(System.out::println );
	}

}
