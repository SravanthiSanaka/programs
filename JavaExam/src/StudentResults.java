
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Student
{
	String name;
	int marks;
	public Student(String name, int marks) 
	{
		super();
		this.name = name;
		this.marks = marks;
	}

}
public class StudentResults
{
	public static void main(String[] args)
	{
		ArrayList<Student>list=new ArrayList<Student>();
		Student s1=new Student("venu",55);
		Student s2=new Student("sarala",60);
		Student s3=new Student("swapna",90);
		Student s4=new Student("sravanthi",20);
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		System.out.println("students who are passed:");
		Predicate<Student>p=s->s.marks>=40;
		Function<Student,String>f=stu->
		{
			int m=stu.marks;
			if(m>=80)
			return "Distinction";
			else if(m>=60 && m<=79)
			return "First Class";
			else if(m>=50 && m<=60)
			return "Second class";
			else
			return "fail";
		};
		Consumer<Student>c=s->
		{
			System.out.print(s.name+"  ");
			System.out.println(f.apply(s));
		};
		for(Student s:list) 
		{
			if(p.test(s))
			{
				c.accept(s);
			}

		}
	}
}

