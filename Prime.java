import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		int count = 0;
		int tc = sc.nextInt();
		while(tc-->0)
		{
			int n = sc.nextInt();
			for(int i=2; i*i<= n;i++)
			{
				if(n%i==0) {
				count++;
				return;
				} 
			}
		}
		
		if(count>0) {
			System.out.println("not prime");
		}
		else {
			System.out.println("prime");
		}
	}

}
