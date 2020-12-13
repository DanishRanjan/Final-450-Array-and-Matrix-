import java.util.Scanner;

public class Replace_them_all {
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int rem ;
	int count = 0;
	int piggy = 0 ;
	while(n>0) {
		rem=n%10;
		if(rem==0) {
			rem = 5;
		}
		piggy+= (rem*(long)Math.pow(10, count));
		count++;
		n=n/10;
	}
	System.out.println(piggy);
}
}
