import java.util.List;

public class Main {

   public static void main(String[] args) throws InvalidCityPincodeException { 
	   RainfallReport rfl=new RainfallReport();
	   
		List<AnnualRainfall> arl=rfl.generateRainfallReport("src/AllCityMonthlyRainfall.txt");

	   
	   List<AnnualRainfall> arfl=rfl.findMaximumRainfallCities();
	 
	   for(AnnualRainfall a:arfl)
		  {
		   	  System.out.println("Pin: "+a.getCityPincode() );
			  System.out.println("City: " +a.getCityName() );
			  
			  System.out.println("Average Annual Rainfall :"+ a.getAverageAnnualRainfall());
		  
		}
   }

}