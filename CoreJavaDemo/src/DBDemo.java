import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBDemo {
	

	
		static Connection conn = null;
	public static Connection getConnection(){

	try{
		System.out.println("reached.......");
	Class.forName("com.mysql.cj.jdbc.Driver");
	conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/truyum","root","1234");  
	return conn;
	}
	catch(Exception e){
		e.printStackTrace();
	}
	return conn;
	
	}
	public void  closeConnection()
	{
	try {
		conn.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	}

	}


