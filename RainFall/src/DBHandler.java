import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBHandler {

	//Write the required business logic as expected in the question description
	public Connection establishConnection() {

		Properties props=new Properties();
		Connection conn=null;
		try {
			FileInputStream fis=new FileInputStream("src/db.properties");
			props.load(fis);
			String url=props.getProperty("db.url");
			String driver=props.getProperty("db.classname");
			String userName=props.getProperty("db.username");
			String pwd=props.getProperty("db.password");
			Class.forName(driver);
			conn= DriverManager.getConnection(url,userName,pwd);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     return conn;
	}
}
