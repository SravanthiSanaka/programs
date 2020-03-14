package examples;
import java.util.TreeSet;
class Employ implements Comparable{
	String name;
	String id;
	String dept;
	public Employ(String name, String id, String dept) {
		super();
		this.name = name;
		this.id = id;
		this.dept = dept;
	}
	public int compareTo(Employ e) {
		if(name.compareTo(e.name)<0)
			return -1;
		else if(name.compareTo(e.name)>0)
			return 0;
	}
	
public String toString() {
	return name+" "+id+" "+dept;
}

public class TestTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet tr=new TreeSet();
		Employ e1=new Employ("pr","101","fi");
		Employ e2=new Employ("sr","99","li");
		Employ e3=new Employ("ar","333","fl");
		tr.add(e1);
		tr.add(e2);
		tr.add(e3);
		System.out.println(tr);
		

	}

}
