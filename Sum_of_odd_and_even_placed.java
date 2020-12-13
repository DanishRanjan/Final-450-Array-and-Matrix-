import java.util.Scanner;

public class Sum_of_odd_and_even_placed {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int even = 0;
		int odd = 0;
		int count = 0;
		int p;
		while(num!=0)
		{
		p = num%10;
		count++;
		if(count%2==0)
		{
			even = even+p;
		}
		else 
		{
			odd = odd+p;
		}
		num = num/10;
		}
		System.out.println("Sum of even digit is : "+odd);
		System.out.println("Sum of odd digit is : "+even);
	}


}
