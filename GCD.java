import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int h;
		for(h=num1<num2?num1:num2; h>=1;h-- )
		{
			if(num1%h==0&num2%h==0)
				break;
		}
		System.out.println(h);
	}

}
