package practice.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class dateutil {

	public static Date convertToDate(String s)
	{
		SimpleDateFormat sdf = new SimpleDateFormat();
		Date date;
		try {
			date = sdf.parse(s);
			return date;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
