import java.util.Scanner;

public class OddEven_Kejriwal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(); //taking input from keyboard for number of testcase
		
		while(t-->0)
		{
			int evenSum=0;
			int oddSum=0;
			int car = sc.nextInt(); //input from keyboard
				while(car!=0)
				{
					int rem = car%10; //last digit
					if(rem%2==0) {
						evenSum = evenSum+rem;
					}
					else {
						oddSum = oddSum+rem;
					}
					car=car/10;
				}
				
				if((oddSum%3==0) || (evenSum%4==0))
				{
					System.out.println("allowed");
				}
				else
				{
					System.out.println("Not allowed ");
				}
	     }
	}

}
