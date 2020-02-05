import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class ConnectClass {
	public static void main(String ar[]){
	Connection conn=DBDemo.getConnection();
	PreparedStatement ps;
	try {
		System.out.println(conn);
		ps = conn.prepareStatement("select * from food");
	ResultSet rs=ps.executeQuery();
	while(rs.next())
	{
	System.out.println(rs.getString("fname"));	
	}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
	}
	}


}