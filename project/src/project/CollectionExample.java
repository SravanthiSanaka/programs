package project;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
class Student implements Comparable<Student> 
{
String name;
String age;
String city;
public Student(String name, String age, String city) {
super();
this.name = name;
this.age = age;
this.city = city;
}
@Override
public String toString() {
return "Student [name=" + name + ", age=" + age + ", city=" + city + "]";
}
@Override
public int compareTo(Student s) {
// TODO Auto-generated method stub
if(age.compareTo(s.age)<0)
return 1;
else if(age.compareTo(s.age)>0)
return -1;
else
return 0;
}

}
public class CollectionExample {
public static void main(String args[])
{
Student s1=new Student("sravs","22","mtm");
Student s2=new Student("appu","25","hyd");
Student s3=new Student("aki","28","bng");
TreeSet<Student> t=new TreeSet<Student>();
t.add(s1);
t.add(s2);
t.add(s3);
System.out.println(t);
}
}