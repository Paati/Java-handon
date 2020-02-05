package mallPark;
import java.text.SimpleDateFormat;
import java.util.*;
import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class Main {

public static void main(String [] args) {

	   Scanner sc = new Scanner(System.in);
       Date in=null, out=null;
       String output = null;
       SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
       String inTime="",outTime="";
      simpleDateFormat.setLenient(false);

      try {
                           System.out.println("In-time");
                           inTime = sc.nextLine();
                           in = simpleDateFormat.parse(inTime);
                           //System.out.println(((simpleDateFormat.parse("29/10/2019 20:10").getTime())/60000-(in.getTime()/60000)));
                           if(((simpleDateFormat.parse("29/10/2019 20:10").getTime())/60000-(in.getTime()/60000))<1){
                                               throw new ParseException("",0);
                           }
       } catch (ParseException e) {
                           output = inTime +" is an Invalid In-Time ";
                           System.out.println(output);
                           return;
                           
       }

       try {

                           System.out.println("Out-time");
                           outTime = sc.nextLine();
                           out = simpleDateFormat.parse(outTime);
                           if(((out.getTime()/60000)-(in.getTime()/60000))<1){
                                               throw new ParseException("",0);
                           }

       } catch (ParseException e) {
                           output = outTime +" is an Invalid Out-Time ";
                           System.out.println(output);
                           return;
       }
       
       
       if(output==null){
                           double time = (out.getTime()-in.getTime())/60000;
                           output = (int)(Math.ceil(time/60)*10)+" Rupees";
                           
                           
                           
       }
       System.out.println(output);

}
}