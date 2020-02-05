import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Associate ast = new Associate();
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the associate id:");
		int a = sc.nextInt();
		ast.setAssociateId(a);
		
		System.out.println("Enter the associate name:");
		String str = sc.next();
		ast.setAssociateName(str);
		
		System.out.println("Enter the number of days:");
		int b = sc.nextInt();
		ast.trackAssociateStatus(b);
		
		System.out.println("The associate "+ast.getAssociateName()+" work status:"+ast.getWorkStatus());
		
		sc.close();
	}
}
