import java.util.*;
public class LCM {
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	int n1 = sc.nextInt();
	int n2 = sc.nextInt();
	int l;
	for(l=1;l<=(n1*n2);l++)
	{
		if(l%n1==0&&l%n2==0)
			break;
	}
	System.out.println(l);
}
}
