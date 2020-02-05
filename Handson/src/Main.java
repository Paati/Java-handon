import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no of liters to fill the tank");
		int ltr = sc.nextInt();
		if(ltr<=0){
       	   System.out.println(ltr+" is an Invalid input");
		   System.exit(0);
		}   
		  
		System.out.println("Enter the distance covered");
        int dst = sc.nextInt();
        if(dst<=0){
     	   System.out.println(dst+" is an Invalid input");
     	   System.exit(0);
        }
        
        double out1 = ((double)ltr/dst)*100;
        
        float out2 = (float)(dst*0.6214);
        float out3 = (float)(ltr*0.2642);
        
        System.out.println("Liters/100KM");
        System.out.println(String.format("%.2f",out1));
        System.out.println("Miles/gallons");
        System.out.println(String.format("%.2f", out2/out3));
        sc.close();
  }
}
