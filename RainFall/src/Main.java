import java.util.List;

public class Main {

   public static void main(String[] args) { 
   
	   RainfallReport rfl=new RainfallReport();
	   List<AnnualRainfall> arl=rfl.generateRainfallReport("src/AllCityMonthlyRainfall.txt");
	   List<AnnualRainfall> arfl=rfl.findMaximumRainfallCities();
	  for(AnnualRainfall a:arfl)
	  {
		  System.out.println(a.getCityName());
	  }
   }
}
          