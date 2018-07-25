import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {
		float u, a, t, d;	//declaration of variables
		//taking input
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter initial velocity");
		u=sc.nextFloat();
		System.out.println("Please enter Acceleration");
		a=sc.nextFloat();
		System.out.println("Please enter time");
		t=sc.nextFloat();
		
		//computation logic
		d= (u*t)+ (a*t*t)/2;
		
		//displaying output
		System.out.println("The distance travelled is: "+d);
		sc.close();
	}

}
