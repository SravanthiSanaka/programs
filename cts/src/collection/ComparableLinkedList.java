package collection;
import java.util.ArrayList;
class Student2 implements Comparable<Student2>{
	String htno;
	String name;
	public Student2(String htno, String name) {
		super();
		this.htno = htno;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student2 [htno=" + htno + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Student student) {
		if(name.compareTo(Student))
		
	}
	
}
class Employee
{
	String eid;
	String name;
	public Employee(String eid, String name) {
		super();
		this.eid = eid;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + "]";
	}
	
}
public class ComparableLinkedList {

	public static void main(String[] args) {
		Student2 s1=new Student2("123","praveen");
		Student2 s2=new Student2("456","kumar");
		Student2 s3=new Student2("789","anil");
		ArrayList ar=new ArrayList();
		ar.add(s1);
		ar.add(s2);
		ar.add(s3);
		System.out.println(ar);
		
		Employee e1=new Employee("001","sravs");
		Employee e2=new Employee("002","appu");
		Employee e3=new Employee("003","aki");
		ar.add(e1);
		ar.add(e2);
		ar.add(e3);
		System.out.println(ar);
	}

}
