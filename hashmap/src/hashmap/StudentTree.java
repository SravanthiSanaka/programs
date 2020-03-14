package examples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeMap;

class Student implements Comparable<Student>
{
String rollno;
String marks;
public Student(String rollno, String marks) {
super();
this.rollno = rollno;
this.marks = marks;
}
@Override
public String toString() {
return "Student [rollno=" + rollno + ", marks=" + marks + "]";
}
public int compareTo(Student stu)
{
if(marks.compareTo(stu.marks)<0)
return -1;
else if(marks.compareTo(stu.marks)>0)
return 1;
else
return 0;
}
}
public class StudentTree  
{
public static void main(String[] args) 
{
// TODO Auto-generated method stub
TreeMap ts=new TreeMap();

ts.add(new Student("150","101"));
ts.add(new Student("150","101"));
ts.add(new Student("150","101"));
ts.forEach(System.out::println);

while(ts.forEach(marks))
{
int sum=0;
for()
sum=sum+
}
}
}