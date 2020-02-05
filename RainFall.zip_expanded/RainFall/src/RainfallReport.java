import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class RainfallReport {

	//Write the required business logic as expected in the question description
	public List<AnnualRainfall> generateRainfallReport(String filePath)throws InvalidCityPincodeException  {
	    
		
		BufferedReader reader;
		
		List <AnnualRainfall>ar = new ArrayList<AnnualRainfall>();
	
			try {
				reader = new BufferedReader(new FileReader(filePath));
			
			String str;
			
				while ((str=reader.readLine()) != null) {
					
					String ast[]=str.split(",");
					if(validate(ast[0]))
					{
						AnnualRainfall annualRainfall=new AnnualRainfall();
						double rain[]=new double[12];
						for(int i=0;i<12;i++)
						{
						 rain[i]=Double.parseDouble(ast[i+2]);
						}
						annualRainfall.calculateAverageAnnualRainfall(rain);
						ar.add(annualRainfall);
						
					}

}
			} catch (NumberFormatException | IOException e) {
				// TODO Auto-generated catch block
				throw new InvalidCityPincodeException(e.getMessage());
			}
			return ar;
	}
	
	public List<AnnualRainfall>  findMaximumRainfallCities() throws InvalidCityPincodeException {
	
		List<AnnualRainfall> ar=new ArrayList<AnnualRainfall>();
		DBHandler db=new DBHandler();
		Connection conn=db.establishConnection();
		PreparedStatement ps;
	
			try {
				ps = conn.prepareStatement("select * from  AnnualRainfall where average_annual_rainfall=(select max(average_annual_rainfall) from AnnualRainfall)");
			
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				AnnualRainfall annualRainfall=new AnnualRainfall();
				int s=rs.getInt(1);
				String st=rs.getString(2);
				double strr=rs.getDouble(3);
				annualRainfall.setCityPincode(s);
				annualRainfall.setCityName(st);
				annualRainfall.setAverageAnnualRainfall(strr);
				 ar.add(annualRainfall);
			}
			}catch (SQLException e) {
	               throw new InvalidCityPincodeException(e.getMessage());
				}
			return ar;
		
	}
	
	
	
	public boolean validate(String cityPincode) throws InvalidCityPincodeException {
	
		if(cityPincode.matches("[0-9]{5}")){
			return true;
		}
		else 
			throw new InvalidCityPincodeException("Invalid City Pincode");
    		
	}

}
