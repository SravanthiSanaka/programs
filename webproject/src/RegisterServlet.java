
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
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
String name=request.getParameter("name");
String desg=request.getParameter("desg");
String dept=request.getParameter("dept");
String comp=request.getParameter("comp");
String mobile=request.getParameter("mobile");
String email=request.getParameter("email");
try
{
Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection
("jdbc:mysql://localhost:3306/cts" ,"root","root");
PreparedStatement pst=con.prepareStatement("insert into employee values(?,?,?,?,?,?) ");
pst.setString(1,name);
pst.setString(2,desg);
pst.setString(3,dept);
pst.setString(4,comp);
pst.setString(5,mobile);
pst.setString(6,email);
int count=pst.executeUpdate();
response.setContentType("text/html");
PrintWriter out=response.getWriter();
out.println("<html><body>");
if(count==1)
out.println("<b> Registration Successful...</b>");
else
out.println("<b> Unsuccessful </b> ");
out.println("</body></html>");
out.close();
pst.close();
con.close(); 
}
catch(Exception e)
{

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







