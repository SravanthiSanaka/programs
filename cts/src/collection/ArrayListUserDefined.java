package collection;
import java.util.ArrayList;
class Student{
	String htno;
	String name;
	public Student(String htno, String name) {
		super();
		this.htno = htno;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [htno=" + htno + ", name=" + name + "]";
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
public class ArrayListUserDefined {

	public static void main(String[] args) {
		Student s1=new Student("123","praveen");
		Student s2=new Student("456","kumar");
		Student s3=new Student("789","anil");
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
