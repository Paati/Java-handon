package Original;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddToDB
 */
@WebServlet("/AddToDB")
public class AddToDB extends HttpServlet {
	//private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddToDB() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out= response.getWriter();
		DateOperations dt=new DateOperations();
		String name=request.getParameter("name");
		float price=Float.valueOf(request.getParameter("price"));
		String active=request.getParameter("active");
		String date=request.getParameter("date");
		String category=request.getParameter("category");
		String freeDelivery="Yes";
		if(request.getParameterValues("free-delivery")[0].isEmpty()){
			freeDelivery="No";
		}
		Connection conn=DBConnection.getConnection();
	   java.sql.Date dst= dt.insertToDB(date);
			
			try {
				System.out.println("pS.......");
				String qr="insert into food values(?,?,?,?,?,?)";
				PreparedStatement ps = conn.prepareStatement(qr);
		
			ps.setString(1, name);
			ps.setFloat(2, price);
			ps.setString(3, active);
			ps.setDate(4,dst);
			ps.setString(5, category);
			ps.setString(6, freeDelivery);
			int ans=ps.executeUpdate();
			if(ans>0){
			out.println("<script>document.alert('Entry done successfully..!)</script>");
			out.println("<h2> Admin Option</h2><br><a href='edit-menu-item.html'>Add more Items.</a><br><a href='menu-item-list-admin.html'>main menu</a>");
			}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
