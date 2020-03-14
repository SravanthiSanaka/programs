package main;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.StudentDaoImpl;
import data.Student;

public class TestStudent {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentDaoImpl sdao=(StudentDaoImpl)context.getBean("edao");

		System.out.println("Enter Student Id");
		int id=sc.nextInt(); 
		System.out.println("Enter Student Name");
		String name=sc.next();
		System.out.println("Enter Student Age");
		int age=sc.nextInt();
			
		Student student=new Student();
		student.getId();
		student.getName();
		student.getAge();

		sdao.create(student);
		
	}

}
