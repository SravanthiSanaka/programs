package collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Iterator;


class Course
{
	String s1;
	String s2;
	String s3;
	public Course(String s1, String s2, String s3) {
		super();
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
	}
	
}

public class ClgHashMap {

	public static void main(String[] args) {
	Map<String,Course> map=new HashMap<String,Course>();
	map.put("JNTU", new Course("ece","cse","eee"));
	map.put("SVU", new Course("cse","civil","mech"));
	map.put("AU", new Course("it","ece","civil"));
	Scanner sc=new Scanner(System.in);
	System.out.println("mention the course");
	String s=sc.next();
	System.out.println("following universities offer the above courses");
	Set keys=(Set) map.entrySet();
	Iterator itr1=keys.iterator();
	
	while(itr1.hasNext())
	{
		Map.Entry entry = (Map.Entry)itr1.next();
		Course depts = (Course)entry.getValue();
		if(depts.s1.equals(s) || depts.s2.equals(s) || depts.s3.equals(s))
			System.out.println(entry.getKey());
	}

	}

}
