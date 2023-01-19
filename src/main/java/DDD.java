

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
 * Servlet implementation class DDD
 */
@WebServlet("/DDD")
public class DDD extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DDD() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		doGet(request, response);
		String q=request.getParameter("PatientName");
		String w=request.getParameter("PatientSurname");
		
		String r=request.getParameter("Gender");
		String y=request.getParameter("Date");
		String t=request.getParameter("Time");
		String u=request.getParameter("Email");
		String i=request.getParameter("MobileNumber");
		String o=request.getParameter("Symptoms");
		String p=request.getParameter("Department");
		String a=request.getParameter("DoctorName");
		
		//PrintWriter pr=response.getWriter();
	
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver is loaded");
			
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/Health_care","root","root");
			System.out.println("connetion sucessful");
			String st="insert into Appointment(PatientName,PatientSurname,Gender,Date,Time,Email,MobileNumber,Symptoms,Department,DrName)Values(?,?,?,?,?,?,?,?,?,?);";
			PreparedStatement n=c.prepareStatement(st); 
			
			n.setString(1, q);
			n.setString(2, w);
			n.setString(3, r);
			n.setString(4, y);
			n.setString(5, t);
			n.setString(6, u);
			n.setString(7, i);
			n.setString(8, o);
			n.setString(9, p);
			n.setString(10, a);
			n.executeUpdate();
			
			c.close();
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
