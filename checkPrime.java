import java.util.*;
public class checkPrime {
public static void main(String args[])
{
	System.out.println("Enter a number to check prime or not: ");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	System.out.println(checkPrime(n));
	
}
public static boolean checkPrime(int n)
{
	for(int i=2;i<n;i++)
	{
		if(n%i==0)
		{
			return false;
			
		}
	}
	return true;
	
}
}
