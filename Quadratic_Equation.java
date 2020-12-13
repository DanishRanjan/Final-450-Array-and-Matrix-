import java.util.Scanner;

public class Quadratic_Equation {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	int d = (b*b)-4*a*c;
	int alpha;
	int beta;
	if(d>0) {
	System.out.println("Real and Distinct");
	alpha = (int)(-b+Math.sqrt(d))/(2*a);
	beta = (int)(-b-Math.sqrt(d))/(2*a);
	System.out.println(beta+" "+alpha);
	}
	
	else if(d==0)
	{
		System.out.println("Real and Equal");
		alpha = beta = -b/(2*a);
		System.out.println(beta+" "+alpha);
	}
	else {
		System.out.println("Imaginary");
	}
	
	
	}
}
