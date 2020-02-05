package Test;

import java.sql.*;

public class DBConnection {
	static Connection conn = null;
public static Connection getConnection(){

try{
	
Class.forName("com.mysql.jdbc.Driver"); 
conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","1234");  
}
catch(Exception e){
	
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
