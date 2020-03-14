package database;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomMain 
{
public static void main(String[] args)
{
// TODO Auto-generated method stub
ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

EmployeeDao dao=(EmployeeDao)context.getBean("edao");
Employee emp=new Employee();
emp.setEmpid("1006");
emp.setEname("Sravanthi");
emp.setDept("Testing");
emp.setDesg("Tester");
emp.setEmail("sravanthisanaka@gmail.com");
/*
int status=dao.saveEmployee(emp);
System.out.println(status);
System.out.println("Record Inserted");
*/
/*
int status=dao.updateEmployee(new Employee("1002","Appu","Testing")); 
   System.out.println(status);  */

Employee e=new Employee(); 
   e.setEmpid("1002"); 
   int status=dao.deleteEmployee(e); 
   System.out.println(status);
}

}