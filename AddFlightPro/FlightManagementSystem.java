import java.sql.*;
import java.util.Properties;
class FlightManagementSystem{
    
    public boolean addFlight(Flight f)
    {
       try{
           
       Connection con=DB.getConnection();
        PreparedStatement ps=con.prepareStatement("insert into "+${sys:DB_USERNAME}+"values(?,?,?,?,?)");
        ps.setInt(1,f.getFlightId());
        ps.setString(2,f.getSource());
        ps.setString(3,f.getDestination());
        ps.setInt(4,f.getNoOfSeats());
        ps.setDouble(5,f.getFlightFare());
        int n=ps.executeUpdate();
        if(n >0)
        return true;
       }
       catch(SQLException e)
       {
           e.printStackTrace();
       }
     return false;
        
    }
    
}