

	import java.util.Date;
	import java.util.*;
	import java.text.SimpleDateFormat;
	public class Main {
	public static void main(String [] args) {
	   
	        System.out.println("In-time");
	        Scanner kb=new Scanner(System.in);
	        String inStr = kb.nextLine();
	        SimpleDateFormat sd=new SimpleDateFormat("dd/MM/yyyy HH:mm");
	        sd.setLenient(false);
	        Date inD,outD ;
	    try{
	        inD= sd.parse(inStr); 
	       if(!inD.before(new Date("29/10/2019 20:10"))){
	       System.out.println(inD + " is an Invalid In-Time");
	       return ;
	    }
	    System.out.println("Out-time");
	    String outStr = kb.nextLine();
	    outD =sd.parse(outStr);
	    if(!outD.after(inD))
	    {
	        System.out.println(outD + " is an invalid Out-Time");
	        return ;
	    }
	    long timeT=outD.getTime() - inD.getTime();
	    double tt = timeT/(double)1000*60*60*24;
	    
	    System.out.println((timeT * 240)+" Rupees");
	    
	    }
	    catch(Exception e)
	    {
	        e.printStackTrace();
	    }
	}
	}




