import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBHandler {

	//Write the required business logic as expected in the question description
	public Connection establishConnection() throws InvalidCityPincodeException {

		Properties props=new Properties();
		Connection conn=null;
		
			FileInputStream fis;
			try {
				fis = new FileInputStream("src\\db.properties");
				props.load(fis);
			//System.out.println();
			String url=props.getProperty("db.url");
			String driver=props.getProperty("db.classname");
			String userName=props.getProperty("db.username");
			String pwd=props.getProperty("db.password");
			Class.forName(driver);
			conn= DriverManager.getConnection(url,userName,pwd);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw new InvalidCityPincodeException(e.getMessage());
			}
			 catch (IOException e) {
			
				e.printStackTrace();
				throw new InvalidCityPincodeException(e.getMessage());
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				
				e.printStackTrace();
				throw new InvalidCityPincodeException(e.getMessage());
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw new InvalidCityPincodeException(e.getMessage());
			}
			return conn;

	}
}
