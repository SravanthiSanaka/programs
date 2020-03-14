package Controllers;

import java.io.IOException;

import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;

import DAO.EmployeeDao;
import data.Employee;
import java.util.List;

/**
* Servlet implementation class DisplayServlet
*/
@WebServlet("/Display")
public class Display extends HttpServlet {
private static final long serialVersionUID = 1L;
     
   /**
    * @see HttpServlet#HttpServlet()
    */
   public Display() {
       super();
       // TODO Auto-generated constructor stub
   }

/**
* @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
*/
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
{
// TODO Auto-generated method stub
response.getWriter().append("Served at: ").append(request.getContextPath());
try
{
EmployeeDao empdao=new EmployeeDao();
Connection con=empdao.getConnection();
List<Employee> list=empdao.showEmployees();
request.setAttribute("list",list);
RequestDispatcher rd=request.getRequestDispatcher("showEmployees.jsp");
rd.forward(request,response);
}
catch(Exception e)
{
System.out.println(e);
}
}

/**
* @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
*/
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// TODO Auto-generated method stub
doGet(request, response);
}

}
