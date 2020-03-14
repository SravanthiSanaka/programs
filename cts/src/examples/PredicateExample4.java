package examples;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Student{
	String name;
	int marks;
	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + "]";
	}
	
}
public class PredicateExample4 {
	public static void main(String[] args) {
		ArrayList<Student> list=new ArrayList<Student>();
		Student s1=new Student("sravs",100);
		Student s2=new Student("appu",90);
		Student s3=new Student("vanya",80);
		Student s4=new Student("navya",70);
		Student s5=new Student("moni",60);
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		Predicate<Student> p=Student->Student.marks>=60;
		System.out.println(p.test(s1));
		Function<Student,String> f1=Student->
		{
			if(Student.marks>=100) {
				return "A[Distinction]";
			}
			else if(Student.marks>=90) {
				return "B[First Class]";
			}
			else if(Student.marks>=80) {
				return "C[Second Class]";
			}
			else if(Student.marks>=70) {
				return "D[Third Class]";
			}
			
			else if(Student.marks>=60) {
					return "E[Pass]";
			}
			else
				return "Failed";
			};
			Consumer<Student> c=Student->{
				System.out.println("Student Name:"+Student.name);
				System.out.println("Student Marks:"+Student.marks);
				System.out.println("Student Grade:"+f1.apply(Student));
				System.out.println();
			};
			for(Student Student : list)
			{
				if(p.test(s3))
					c.accept(s3);
			}
				
				
		}
	}


