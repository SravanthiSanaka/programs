package javaassignment;

import java.util.*;
import java.sql.*;

public class EmployeeJdbc {

public static void main(String[] args) throws ClassNotFoundException,SQLException
{
// TODO Auto-generated method stub
DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
Connection connection=DriverManager.getConnection
("jdbc:mysql://localhost:3306/cts","root","root");
String query="insert into employee values(?,?,?,?,?,?)";
PreparedStatement pst=connection.prepareStatement(query);
Scanner sc=new Scanner(System.in);

System.out.println("Enter Customer Name");
String name=sc.next();
System.out.println("Enter Customer Id");
int id=sc.nextInt();
System.out.println("Enter Customer Department");
String dept=sc.next();
System.out.println("Enter Customer Designation");
String desg=sc.next();
System.out.println("Enter Customer Company");
String company=sc.next();
System.out.println("Enter Customer EmailId");
String emailid=sc.next();

pst.setString(1,name);
pst.setInt(2,id);
pst.setString(3,dept);
pst.setString(4,desg);
pst.setString(5,company);
pst.setString(6,emailid);

int x=pst.executeUpdate();
System.out.println((x+ "Records Inserted..."));
}

}
