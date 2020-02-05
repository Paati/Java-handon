package Original;

import java.sql.*;

public class DBConnection {
	static Connection conn;
	public static Connection getConnection(){

try{
	
Class.forName("com.mysql.cj.jdbc.Driver"); 
conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/truyum","root","1234");  
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
