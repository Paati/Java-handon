package Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
//import java.util.Date;

public class DateOperations {
      public java.sql.Date insertToDB(String date){
    	 java.util.Date date1=null;
		try {
			date1 = new SimpleDateFormat("dd/MM/yyyy").parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	 java.sql.Date sqlDate = new java.sql.Date(date1.getTime());
    	 return sqlDate;
      }
}
