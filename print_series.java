import java.util.Scanner;

public class print_series {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //no of times
		int m = sc.nextInt(); //except this multiple
		for(int i=1;i<=n;i++) 
		{
		int d = 3*i+2;
		if(d%m!=0) {
			System.out.println(d);
		}
		else {
			n+=1;
		}
		}
		

	}

}
